//import java.util.Scanner;
//
//public class ArrayTraversal {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		int[] ar = new int[n];
//		
//		for(int i=0; i<ar.length; i++) {
//			ar[i] = scan.nextInt();
//			System.out.print(ar[i] + " ");
//		}
//
//	}
//}

/**
 * reverse array index logic--->for(int i=ar.length-1; i>=0; i--)
 */

//public class ArrayTraversal {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//			int n = scan.nextInt();
//			int[] ar = new int[n];
//			
//			for(int i=0; i<ar.length; i++) {
//				ar[i] = scan.nextInt();
//			}
//			
//			for(int i=ar.length-1; i>=0; i--) {
//				System.out.print(ar[i] + " ");
//			}
//	}
//
//}

/**
 * odd index logic------->if(i%2 == 0)
*/

//public class ArrayTraversal {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//			int n = scan.nextInt();
//			int[] ar = new int[n];
//			
//			for(int i=0; i<ar.length; i++) {
//				ar[i] = scan.nextInt();
//			}
//			
////			for(int i=0; i<ar.length; i++) {
////				if(i%2 == 0) {
////				System.out.print(ar[i] + " ");
////				}
////			}
//			
//			for(int i=ar.length-2; i>=0; i=i-2) { // reverse array odd index
//				
//				System.out.print(ar[i] + " ");
//			}
//	}
// }

/**
 * even index logic------>if(i%2 != 0)
  */ 

//public class ArrayTraversal {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//			int n = scan.nextInt();
//			int[] ar = new int[n];
//			
//			for(int i=0; i<ar.length; i++) {
//				ar[i] = scan.nextInt();
//			}
//			
//			for(int i=0; i<ar.length; i++) {
//				if(i%2 != 0) {
//				System.out.print(ar[i] + " ");
//				}
//			}
//			
//			for(int i=ar.length-1; i>=0; i=i-2) { // reverse array odd index
//				
//				System.out.print(ar[i] + " ");
//				
//			}
//			
//	}
//
//}


/**
* odd element array logic---->if(ar[i]%2 != 0)
*/

//public class ArrayTraversal {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] ar = new int[n];
//		
//		for(int i=0; i<ar.length; i++) {
//			ar[i] = scan.nextInt();
//		}
//		
//		for(int i=0; i<ar.length; i++) {
//			if(ar[i]%2 !=0) {
//			System.out.print(ar[i] + " ");
//		  }
//		}
//		
////		for(int i=ar.length-1; i>=0; i--) { //reverse array
////			if(ar[i]%2 != 0) {
////				System.out.print(ar[i] + " ");
////			}
////		}
//	}
//}

/**
*even element array logic----->if(ar[i]%2 == 0)
*/


//public class ArrayTraversal {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] ar = new int[n];
//		
//		for(int i=0; i<ar.length; i++) {
//			ar[i] = scan.nextInt();
//		}
//		
//		for(int i=0; i<ar.length; i++) {
//			if(ar[i]%2 ==0) {
//				System.out.print(ar[i] + " ");
//			}
//		}
//		
////		for(int i=ar.length-1; i>=0; i--) { //reverse array
////			if(ar[i]%2 != 0) {
////				System.out.print(ar[i] + " ");
////			}
////		}
//	}
//}

/** 
 * array input : 1 2 3 4 5 output :	1 2 (i<ar.length/2)
 * output: 1 2 3 (i<=ar.length/2)
 */

//public class ArrayTraversal {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] ar = new int[n];
//		
//		for(int i=0; i<ar.length; i++) {
//			ar[i] = scan.nextInt();
//		}
		
//		for(int i=0; i<ar.length/2; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		
//		for(int i=0; i<=ar.length/2; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		
//////		------reverse--------
////		
//		for(int i=ar.length-1; i>=ar.length/2; i--) {
//			System.out.print(ar[i] + " ");
//		}
//		
////		for(int i=ar.length-1; i>ar.length/2; i--) {
////			System.out.print(ar[i] + " ");
////		}
//		
//	}
//}