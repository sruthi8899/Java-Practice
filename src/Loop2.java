import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		//Increment 
		
		for(int i=1; i<=n; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		// Decrement
		
		for(int i=5; i>=1; i--) 
		{
			System.out.print(i);
		}

	}

}
