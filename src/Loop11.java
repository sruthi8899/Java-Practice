import java.util.Scanner;

public class Loop11 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		
		int temp; 
		
		//swapping a into b and b into a
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);

	}

}
