import java.io.IOException;

import org.antlr.v4.runtime.*;

public class Cubex {
	public static void main (String args[]) throws IOException {
		getLexer(args[0]);
	}
	
	protected static void getLexer(String fn) throws IOException {
		CubexLexer2 lexer = new CubexLexer2(new ANTLRFileStream(fn));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CubexParser2 parser = new CubexParser2(tokens);
		
		// altering anltr error messages
		parser.removeErrorListeners();
		parser.addErrorListener(new ParserErrorListener(false)); //prevent printing debugging messages
				
				
		try {
			System.out.println(parser.top().cu.toString());
		} catch (Exception e) {
			System.out.println("parser error");
		}
	}
}
