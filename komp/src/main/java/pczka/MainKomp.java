package pczka;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import me.gramatykaLexer;
import me.gramatykaParser;

import java.io.*;

public class MainKomp {
    public static void main (String[] args) {
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName("src/main/resources/test");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(inputStream == null)
            System.out.println("error");

        gramatykaLexer gramatykaLexer = new gramatykaLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(gramatykaLexer);
        gramatykaParser markupParser = new gramatykaParser(commonTokenStream);

        gramatykaParser.ProgramContext programContext = markupParser.program();
        kompGramatykaVisitor visitor = new kompGramatykaVisitor();
        String result = visitor.visit(programContext);
        System.out.println(result);
        try {
            PrintWriter out = new PrintWriter("filename.txt");
            out.write(result);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}