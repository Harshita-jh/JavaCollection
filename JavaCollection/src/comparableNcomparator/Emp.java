 package comparableNcomparator;

import java.util.Comparator;

public class Emp {
//public class Emp implements Comparable<Emp> {

	private String name;
	private String phone;
	private int empId;

	//Comparable
	/*
	 * @Override public int compareTo(Emp o) { return this.empId-o.empId; }
	 */ 	
	
	public Emp(String name, String phone, int empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}
}
