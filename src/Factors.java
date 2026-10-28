import java.util.Scanner;
/** 
 * method 
 **/
public class Factors {
	public void PrintFactors(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i== 0) {
				System.out.print(i  + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Factors d = new Factors();
		
		d.PrintFactors(n);
		
	}
}

/**
 without method we can print factors by using only if condition
 */
	
//  for(int i=1; i<=n; i++) {
//	if(n%i== 0) {
//		System.out.println(i);
//	}
//}


//input : 5
//output : 1 2 5 10