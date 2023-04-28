package comparableNcomparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp>{
	@Override 
	public int compare(Emp o1, Emp o2) {
		//For String we have to use compareTo() method
		return o1.getName().compareTo(o2.getName());
	}

}
