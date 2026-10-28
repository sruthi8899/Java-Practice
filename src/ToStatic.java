class Employee8{
	private int eId;
	private String name;
	private int salary;
	
    public Employee8() {
	   super();
    }

	public Employee8(int eId, String name, int salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
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
		return eId+ " " + name+" " + salary;
	}
    
}

public class ToStatic{

	public static void main(String[] args) {
		Employee8 e = new Employee8(1, "ren", 200000);
		
		System.out.println(e.toString());
		
		String s = new String("java");
		System.out.println(s);
	}
}


//class Exampleclone{
//	int[] ar = {1,2,3,4,5};
//	int[] ar2 = ar;
//	
//	ar2[2] = 10;
//	
//	for(int i1=0; i<ar.length; i++) {
//		System.out.print(ar[i1] + " ");
//	}
//	for(int i=0; i<ar.length; i++) {
//		System.out.print(ar2[i1] + " ");
//	}
//}
//public class ToStatic{
//
//	public static void main(String[] args) {
//		
//	}
//}
//

