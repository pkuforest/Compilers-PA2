
public class IfStat extends CuStat{
	private CuExpr e;
	private CuStat s1;
	private CuStat s2 = null;
	public IfStat (CuExpr ex, CuStat st) {
		this.e = ex;
		this.s1 = st;
	}

    @Override public void add (CuStat st) {
    	s2 = st;
    }
    
    @Override 
    public String toString() {
    	super.text = "if ( " + e.toString() + " ) " + s1.toString();
    	if (s2!=null)
    		super.text += " else " + s2.toString();
    	else
    		super.text += " else { }";
    	return super.text;
    	
    }
}
