import java.util.HashMap;

public class HashMapInternal {

	public static void main(String[] args) {
		HashMap<String, Integer> emp = new HashMap<>();
		//check the internal process in the debug mode in variable window how it is storing in the map
		
		emp.put("Harshita", 20);
		emp.put("Megha", 15);
		emp.put("Shabnam", 28);
		
		System.out.println(emp);
	}

}
