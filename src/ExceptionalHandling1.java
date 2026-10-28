import java.util.Scanner;

class Demo100{
	public void fun1(){
		System.out.println("connection4 is established...");
		

			try {
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter the numenator:");
				int a = scan.nextInt();

				System.out.println("Enter the denominator:");
				int b = scan.nextInt();
				
				int c = a/b;
		        System.out.println(c);		
			
			}
			catch(Exception e) {
				System.out.println("handled");
				}
	
        System.out.println("connection4 is terminated...");
	}
}

class Demo101{
	public void fun2(){
		System.out.println("connection3 is established...");
		
		
			Demo100 d = new Demo100();
			d.fun1();
		
		
		
        System.out.println("connection3 is terminated...");
	}
}

class Demo102{
	public void fun3(){
		System.out.println("connection2 is established...");
		

			Demo101 d = new Demo101();
			d.fun2();
			
				
        System.out.println("connection2 is terminated...");
	}
}

public class ExceptionalHandling1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("connection1 is established...");
		
		try {
			Demo102 d = new Demo102();
			d.fun3();
		}
		
		catch(Exception e) {
			System.out.println("Handles in fun3");
		}
        System.out.println("connection1 is terminated...");

	}

}
