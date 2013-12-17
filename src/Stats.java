import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Stats extends CuStat{
	protected ArrayList<CuStat> al;
	public Stats (List<CuStat> cu) {
		//we should actually flatten it instead of just flatten it 
		//when printing
		al = new ArrayList<CuStat>();
		ArrayList<CuStat> cu_cpy = (ArrayList<CuStat>) cu;
		for (CuStat cs : cu_cpy) {
			if (cs instanceof Stats) {
				al.addAll(((Stats)cs).al);
			}
			else {
				al.add(cs);
			}
		}
		if (al.size()==1) {
			text = CuMethod.listFlatten(al);
		}
		else {
			text = "{ " + CuMethod.listFlatten(al) + " }";
		}
	}
}
