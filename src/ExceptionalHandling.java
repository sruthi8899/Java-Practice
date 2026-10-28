import java.util.InputMismatchException;
import java.util.Scanner;



public class ExceptionalHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("connection is established.");
		
		try {
			System.out.println("Connection to be established");
			System.out.println("Enter the numinator:");
			int a = scan.nextInt();
			
			System.out.println("Enter the denominator:");
			int b = scan.nextInt();
			
			int c = a/b;
			System.out.println(c);
			
			////input = -5 exception: NegativeArraySizeException
			System.out.println("Enter the size of the array: ");
			int n = scan.nextInt();
			int[] ar = new int[n];//throws ecception in these line
			
			////input=ten exception: InputMismatchException 
			System.out.println("Enter the element: ");
			int ele = scan.nextInt();
			
			////input=8 exception:ArrayIndexOutOfBoundsException
			System.out.println("Enter the index: ");
			int index = scan .nextInt();
			ar = null;
			
			ar[index] = ele;//throws ecception in these line
			System.out.println(ar[index]);

		}
		catch(ArithmeticException e) {
			System.out.println("Enter valid denominator");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Enter positive integer");
		}
		catch(InputMismatchException e) {
			System.out.println("enter integer data");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter integer data");
		}
		////original exception handler to all exception 
		catch(Exception e) {
			System.out.println("Invalid input");
		}
		System.out.println("connection is terminated.");

	}

}
