
public abstract class CuTop {
	protected String text = "";
	@Override public String toString() {
		String a = text.replaceAll("[ ]+", " ");
		//remove trailing blank characters
	    while (a.substring(a.length()-1).equals(" ")) {
	    	  a = a.substring(0, a.length()-1);
	    }
				
		return a;
	}
}
