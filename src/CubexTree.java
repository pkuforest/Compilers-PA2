import java.io.IOException;

import org.antlr.v4.runtime.*;

public class CubexTree {
	public static void main (String args[]) throws IOException {
//		getLexer(args[0]);
		try {
			tree(args[0]);
		} catch (Exception e) {
			System.out.println("parser error");
		}
	}
	
	protected static void tree(String fn) throws IOException {
		CubexLexer2 lexer = new CubexLexer2(new ANTLRFileStream(fn));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CubexParser2 parser = new CubexParser2(tokens);
		parser.setBuildParseTree(true);
		RuleContext tree = parser.top();
		tree.inspect(parser); // show in gui
	}
}
