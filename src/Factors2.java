//import java.util.Scanner;
//
//public class Factors2 {
//	
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		int count = 0;
//		for(int i=1; i<=n; i++) {
//			if(n%i == 0) {
//				
//				 count++;
//			}
//		}
//		System.out.println(count);
//	}
//		
//}


/** 
 * or
 */

import java.util.Scanner;

public class Factors2 {
		public static int  countFactors(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				
				 count++;
			}
		}
		return count;
	}


   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   
	   int res = countFactors(n);
	   System.out.println(res);
	   
	   
   }	
}



