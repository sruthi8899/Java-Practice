package collectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
	@Override
	public int compareTo(Employee e2) {
		Employee e1 = this;
//		Employee e3 = this;
//		Employee e4 = this;
		
		Integer sal1=e1.salary;
		Integer sal2=e2.salary;
//		Integer id3=e3.id;
//		Integer id4=e3.id;
		
//		if(id1>id2 || id3>id2 || id4>id2) {
//			return 1;
//		}
//		else if(id2>id1 || id2>id3 || id2>id4) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
		int n = sal1.compareTo(sal2);
		return n;
	}
}


public class Comparable1 {

	public static void main(String[] args) {
		
		Employee e1=new Employee(9,"Renshihao", 40000);
		Employee e2=new Employee(8,"Sruthi", 10000);
		Employee e3=new Employee(7,"bieber", 30000);
		Employee e4=new Employee(9,"Yang Yang", 90000);
		
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
//		al.add(e3);
//		al.add(e4);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
	
		
		
//		ArrayList al = new ArrayList();
//		al.add(100);
//		al.add(50);
//		al.add("TAP");
//		al.add("ACAD");
//	
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
		
		
		

	}

}
