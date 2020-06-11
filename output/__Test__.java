import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AnalisadorSintaticoSemanticoLexer lex = new AnalisadorSintaticoSemanticoLexer(new ANTLRFileStream("D:\\Documentos\\code\\analisador-sintatico-semantico\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        AnalisadorSintaticoSemanticoParser g = new AnalisadorSintaticoSemanticoParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}