import java.util.ArrayList;
import java.util.List;


public class Intf extends CuInterface{
	private String intf_name;
	private String funs = "";
	private List<String> kc_name;
	private CuType t = new VTopBot("Thing");
	private ArrayList<String> v_names = new ArrayList<String>();
	private ArrayList<CuTypeScheme> ts_names = new ArrayList<CuTypeScheme>();
	public Intf (String iname, List<String> kname){
		intf_name = iname;
		kc_name = kname;
		text = "interface " + intf_name.toString() + " <";
		for (String s : kc_name) {
			text += " " + s.toString();
		}
		text += " > extends";
	}
	@Override
	public void add (CuType tt) {
		t = tt;
	}
	@Override
	public void add (String v_name, CuTypeScheme ts) {
		v_names.add(v_name);
		ts_names.add(ts);
		funs += " fun " + v_name + ts.toString() + " ;";
	}
	
	@Override public String toString() {
		text += " " + t.toString();
		text += " { " + funs + " } ";
		return text;
	}
}
