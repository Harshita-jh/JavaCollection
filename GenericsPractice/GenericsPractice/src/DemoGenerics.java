import java.util.ArrayList;
import java.util.List;

public class DemoGenerics {

	public static void main(String[] args) {
		
		//this will store only String type values
		List<String> list =  new ArrayList<>();
		list.add("LCWD");
		
		//this will contain all type of values
		List anotherList = new ArrayList();
		anotherList.add("LCWD");
		anotherList.add(12);
		anotherList.add(11.11);
		
		System.out.println(list);
		System.out.println(anotherList);

	}

}
