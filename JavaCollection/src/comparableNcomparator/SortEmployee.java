package comparableNcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {

	public static void main(String[] args) {
		ArrayList<Emp> emps = new ArrayList<>();
		emps.add(new Emp("Harshita", "2378564523", 12));
		emps.add(new Emp("Anisha", "1223344556", 34));
		emps.add(new Emp("Vinita", "3445566778", 20));
		
		System.out.println(emps);
		//For Comparator
		Collections.sort(emps,new IdComparator());
		
		ArrayList<Emp> emps1 = new ArrayList<>(emps);
		Collections.sort(emps1,new NameComparator());
		System.out.println(emps1);

	}

}
