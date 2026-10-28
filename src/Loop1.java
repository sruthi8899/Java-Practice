import java.util.Scanner;

// MNC Question
public class Loop1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		
		int temp; 
		
		//swapping a into b and b into a
		
		temp = a ;   // a is storing temp
		a = b;   // b is storing a
		b = temp;   // temp is storing b
		
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
