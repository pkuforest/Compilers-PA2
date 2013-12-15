import java.util.ArrayList;
import java.util.List;

// CLASS CLSINTF pk=kindcontext pt=typecontext {$c = new Cls($CLSINTF.text, $pk.kc, $pt.tc);} 
// (EXTENDS t=type {$c.add($t.t);} LBRACE (s=stat {$c.add($s.s);})* (SUPER LPAREN ex=exprs RPAREN SEMICOLON {$c.add($ex.cu);})? (FUN VAR ts=typescheme s=stat {$c.add($VAR.text, $ts.ts, $s.s);})* RBRACE)?;
public class Cls extends CuClass {
	String clsintf;
	List<String> kc;
	List<CuVvt> tc;
	String type;
	List<CuStat> ss = new ArrayList<CuStat>();
	List<CuExpr> es;
	List<String> fun = new ArrayList<String>();
	
	public Cls(String clsintf, List<String> kc, List<CuVvt> tc) {
		this.clsintf = clsintf;
		this.kc = kc;
		this.tc = tc;
	}
	@Override public void add (CuType t) {
		type = t.toString();
	}
	
	@Override public void add (CuStat s) {
		ss.add(s);
	}
	
	@Override public void add (List<CuExpr> s) {
		es = s;
	}
	
	@Override public void add(String v, CuTypeScheme ts, CuStat s) {
		String t = String.format("fun %s %s %s", v, ts.toString(), s.toString());
		fun.add(t);
	}
	
	@Override public String toString() {
		return String.format("class %s %s %s extends %s { %s super ( %s ) ; %s }", 
				clsintf, CuMethod.printList("<", kc, ">", ","), CuMethod.printList("(", tc, ")", ","), type, 
				CuMethod.printList("", ss, "", ""), CuMethod.printList("(", es, ")", ","), CuMethod.printList("", fun, "", ""));
	}
}
