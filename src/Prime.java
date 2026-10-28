//import java.util.Scanner;
//
//public class Prime{
//		public static int  primeNumber(int n) {
//		int count = 0;
//		for(int i=2; i<=n/2; i++) {
//			if(n%i == 0) {
//				
//				 count++;
//			}
//		}
//		if(count == 0) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("Not prime");
//		}
//		return count;
//	}
//
//
//   public static void main(String[] args) {
//	   Scanner scan = new Scanner(System.in);
//	   int n = scan.nextInt();
//	   
//	 
//	   primeNumber(n);
//	   
//   }	
//}


/**
efficient and simple without count
*/

//import java.util.Scanner;
//
//public class Prime{
//	public static String  checkNumber(int n) {
//		if(n <= 1) {// these for to check 1, 0, -ve values are prime or not
//			return "Not Prime";
//		}
//		for(int i=2; i*i<=n; i++) {
//			if(n%i == 0) {
//				return "Not Prime";
//			}
//		}
//		return "prime";
//	}
//		
//
//			
//			
//			
//	public static void main(String[] args) {
//				   Scanner scan = new Scanner(System.in);
//				   int n = scan.nextInt();
//				   
//				   String res = checkNumber(n);
//				   System.out.println(res);
//	}
//}



/**
 * another writing way print yes or not (prime?)
 */
	
import java.util.Scanner;

public class Prime{
	
	public static String checkprime(int n) {
		if(n<=0) {
			return "No";
		}
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) {
				return "No";
			}
		}
		return "Yes";
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String res = checkprime(n);
		System.out.println(res);		
	}
}
				
				
				
				
				
				
				
				
				
				
			