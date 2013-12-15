// {$f = new FunCtxt();} (COMMA v=vvc ts=typescheme {$f.add($v.v, $ts.ts);})*;
public class FunCtxt extends CuFunC {
	CuVvc v; 
	CuTypeScheme ts;
	
	public FunCtxt() {
	}
	
	@Override public void add(CuVvc v, CuTypeScheme ts) {
		this.v = v;
		this.ts = ts;
		super.text += String.format(" , %s %s", v.toString(), ts.toString());
	}
}
