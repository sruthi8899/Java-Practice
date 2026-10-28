import java.util.Scanner;

/**
 * Compilation time--->Syntax error(faulty coding)
 * Execution time----->exception(faulty input)
 */
public class Exceptionhandling {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//// exception occur and the program is doesn't termniated
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Connection to be established");
//		
//		System.out.println("Enter the numinator:");
//		int a = scan.nextInt();
//		
//		System.out.println("Enter the denominator:");
//		int b = scan.nextInt();
//		
//		int c = a/b;
//		System.out.println(c);
//		System.out.println("connection to be terminated.");
//		
		
/**
 *  how to fix the exception
 *  created by user:try and catch() block
 */
		
		try {
			System.out.println("Connection to be established");
			System.out.println("Enter the numinator:");
			int a = scan.nextInt();
			
			System.out.println("Enter the denominator:");
			int b = scan.nextInt();
			
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Enter the valid denominator.");
		}
		
		System.out.println("connection to be terminated.");
	}

}
