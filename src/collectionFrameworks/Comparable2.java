package collectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee1>{
	private int id;
	private String name;
	private int salary;
	
	public Employee1() {
		
	}
	
	public Employee1(int id, String name, int salary){
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
	public int compareTo(Employee1 e2) {
		Employee1 e1 = this;
		
		String name1 = e1.name;
		String name2 = e2.name;
		if(name1.equals(name2)) {
			Integer id1=e1.id;
			Integer id2=e2.id;
			
			int n = id1.compareTo(id2);
			return n;
		}
		
		return name1.compareTo(name2);
	}
}
public class Comparable2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of Employees");
		int employees = scan.nextInt();
		scan.nextLine();
		
//		ArrayList<Employee1> al = new ArrayList<Employee1>();
		TreeSet<Employee1> ts = new TreeSet<Employee1>();
		
		for(int i=0; i<employees; i++) {
			System.out.println("Enter the details odf the "+(i+1)+" employee");
			String details = scan.nextLine();
			String[] input = details.split(",");
		    Employee1 e = new Employee1(Integer.parseInt(input[0]), input[1], Integer.parseInt(input[2]));
//			al.add(e);
			ts.add(e);
		}
		System.out.println(ts);
//		Collections.sort(al);
//		System.out.println(al);
	}

}
