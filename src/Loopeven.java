import java.util.Scanner;

public class Loopeven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int n = scan.nextInt();
		System.out.println("Even");
		
		
	//one method
			for(int i=1; i<=n; i++)
			{
				if(i%2 == 0) {
					System.out.print(i + " ");
				}
			}
	
			System.out.println();
			
	// another method
			
			for(int i=2; i<=n; i=i+2) {
				System.out.print(i + " ");
			}
			
			
			System.out.println();
			
			
			// Loop Odd
	
	//one method		
			System.out.println("Odd");

			for(int i=1; i<=n; i++)
			{
				if(i%2 != 0) {
					System.out.print(i + " ");
				}
			}
	
			System.out.println();
			
	// another method
			
			for(int i=1; i<=n; i=i+2) {
				System.out.print(i + " ");
			}
	}

}
