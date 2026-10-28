package collectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class SortingId implements Comparator<Employee2>{
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		
		return id1.compareTo(id2);
	}
}

class SortingName implements Comparator<Employee2>{
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		
		return name1.compareTo(name2);
	}
}

class SortingSalary implements Comparator<Employee2>{
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		Integer sal1 = e1.getSalary();
		Integer sal2 = e2.getSalary();
		
		return sal1.compareTo(sal2);
	}
}

class SortingIdDes implements Comparator<Employee2>{
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		
		return -1*id1.compareTo(id2);
	}
}

class Employee2 {
	private int id;
	private String name;
	private int salary;
	
	public Employee2() {
		
	}
	
	public Employee2(int id, String name, int salary){
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
	
	
}

public class Comparator1 {

	public static void main(String[] args) {
        
		SortingId sid = new SortingId();
		SortingName sn = new SortingName();
		SortingSalary ss = new SortingSalary();
		SortingIdDes siddes = new SortingIdDes();
		
		Employee2 e1 = new Employee2(9,"Ren",4000);
		Employee2 e2 = new Employee2(8,"Sru",1000);
		TreeSet<Employee2> ts = new TreeSet<Employee2>(siddes);
		ts.add(e1);
		ts.add(e2);
		System.out.println(ts);

	}

}
