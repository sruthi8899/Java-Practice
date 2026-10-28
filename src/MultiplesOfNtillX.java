import java.util.Scanner;

public class MultiplesOfNtillX {
	
	public static void multiplenumbers(int x, int n) {
		for(int i=n;i<=x; i=i+n) {
			
			System.out.print(i + " ");
			}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		
		multiplenumbers(x, n);
	}

}

/**
 * another method
 */

//
//for(int i=1;i<=x; i++) {
//	if(i%n==0){
//	System.out.print(i + " ");
//	}
// }
