import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
	int[] a = new int[5];
	
	for(int i=0; i<5; i++)
	{
		System.out.println("Enter the number: ");
		a[i] = scan.nextInt();
	}
	
	for(int i=0; i<5; i++)
	{
		System.out.print(a[i]+" ");
	}
	

	}

}
