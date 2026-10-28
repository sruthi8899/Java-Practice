import java.util.Scanner;

/**in program there is no static variable,blocks,methods , so the program start to execute instance variables.
 *class loader comes help to JVM to load the Businessman1 class.
 */

//class Businessman1{
//	private float p;//instance variable
//	private float t;
//	private float r;
//	private float si;
//	
//	//default constructor created by JVM
//	
//	public void acceptInput(){ //instance method
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter the principal amount:");
//		p = scan.nextFloat();
//		System.out.println("Enter the tenure:");
//		t = scan.nextFloat();
//		
//		r = 15.2f; //common to all objects rate of interest
//	}
//	public void calcInterest() { //instance method
//		si = p*t*r/100;
//	}
//	public void displayInterest() { //instance method
//		System.out.println(si);
//	}
//}
//
//
//public class Businessman {    //main method
//
//	public static void main(String[] args) {  
//		Businessman1 b1 = new Businessman1(); 
//		b1.acceptInput();
//		b1.calcInterest();
//		b1.displayInterest();
//		
//		Businessman1 b2 = new Businessman1();
//		b2.acceptInput();
//		b2.calcInterest();
//		b2.displayInterest();
//		
//		Businessman1 b3 = new Businessman1();
//		b3.acceptInput();
//		b3.calcInterest();
//		b3.displayInterest();
//		
//	}
//
//}




class Businessman1{
	private float p;//instance variable
	private float t;
	static private float r; // static variable
	private float si;
	
	//static block only allocated to static variable
	
	static {  //static block
		r = 15.2f;
	}
	
	//default constructor created by JVM
	
	public void acceptInput(){ //instance method
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principal amount:");
		p = scan.nextFloat();
		System.out.println("Enter the tenure:");
		t = scan.nextFloat();
		
		
	}
	public void calcInterest() { //instance method
		si = p*t*r/100;
	}
	public void displayInterest() { //instance method
		System.out.println(si);
	}
}


public class Businessman {    //main method

	public static void main(String[] args) {  
		Businessman1 b1 = new Businessman1(); 
		b1.acceptInput();
		b1.calcInterest();
		b1.displayInterest();
		
		Businessman1 b2 = new Businessman1();
		b2.acceptInput();
		b2.calcInterest();
		b2.displayInterest();
		
		Businessman1 b3 = new Businessman1();
		b3.acceptInput();
		b3.calcInterest();
		b3.displayInterest();
		
	}

}

