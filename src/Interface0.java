import java.util.Scanner;
////Rule 1: interface like a contract, implements helps to achieve standarization
interface Calculator9{
////Rule 3: by default or automatically in interface the method is public and abstract 
	public abstract void add();
	void sub(); 
}
class Calculator100 implements Calculator9{
	int a;
	int b;
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		System.out.println(a+b);
	}
	
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		System.out.println(a-b);
	}
	public void mul() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println(c);
	}
}
class Calculator101 implements Calculator9{
	int s;
	int r;
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int s = scan.nextInt();
		System.out.println("Enter the second number:");
		int r = scan.nextInt();
		System.out.println(s+r);
	}
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int s = scan.nextInt();
		System.out.println("Enter the second number:");
		int r = scan.nextInt();
		System.out.println(s-r);
	}
}
class Calculator102 implements Calculator9{
	int x;
	int y;
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x = scan.nextInt();
		System.out.println("Enter the second number:");
		int y = scan.nextInt();
		System.out.println(x+y);
	}
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x = scan.nextInt();
		System.out.println("Enter the second number:");
		int y = scan.nextInt();
		System.out.println(x-y);
	}
}

class Math{
	public void operation(Calculator9 ref) {
		ref.add();
		ref.sub();
	}

	public static int pow(int last, int count) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Interface0 {

	public static void main(String[] args) {
		
		Calculator100 c1 = new Calculator100();
		Calculator101 c2 = new Calculator101();
		Calculator102 c3 = new Calculator102();
////Rule 2:  interface promote polymorphism (loose Coupling)		
//		Calculator9 ref;
//		
//		ref = c1;
//		ref.add();
//		ref.sub();
//		
//		ref = c2;
//		ref.add();
//		ref.sub();
//		
//		ref = c3;
//		ref.add();
//		ref.sub();

////2.reduce code and flexibity
//		Math m = new Math();
//		
//		m.operation(c1);
//		m.operation(c2);
//		m.operation(c3);

////Rule 4: speciallized methods cannot be access directly using interface type reference .
/// but make it parent reference   behave like a child
/// Down casting  	
		Calculator9 ref;
		
		ref = c1;
		ref.add();
		ref.sub();
		((Calculator100)(ref)).mul();
		
	}

}
