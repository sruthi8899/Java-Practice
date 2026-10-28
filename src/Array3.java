import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[8];
		
		for(int i=0; i<a.length; i++) 
		{	
		System.out.println("Enter the age of" + i + "th student:");
		a[i] = scan.nextInt();
		}
		
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
