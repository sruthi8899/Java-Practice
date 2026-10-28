package package1;

class Demo{
	public int a; //1
	protected int b; //2
	int c; //3.package access
	private int d; //4
	
}

 public class Demo1 extends Demo{
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);  // it not accessible eithin the subclass inside the same page
	}
	
}

//public class AccessModifiers {
//
//	public static void main(String[] args) {
//	   Demo1 d = new Demo1();
//	   d.disp();
//	}
//
//}
