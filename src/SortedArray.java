import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar = new int[n];
 		
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		int res = smallestOddRepeatingElement(ar);
		System.out.println(res);

	}
	
	public static int largestReaptingElement(int[] ar) {
		for(int i=ar.length-1; i>=1; i--) {
			if(ar[i] == ar[i-1]) {
				return ar[i];
			}
		}
//		return -1;
		//i don,t want -1 ,i want largest element in the array
		return ar[ar.length-1];
	}
	
	
	public static int smallestReaptingElement(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i] == ar[i+1]) {
				return ar[i];
			}
		}
//		return -1;
		return ar[0];
	}
	
	
	public static int largestEvenRepeatingElement(int[] ar) {
		for(int i=ar.length-2; i>=1; i--) {
			if(ar[i] == ar[i-1] && ar[i]%2 == 0) {
				return ar[i];
			}
		}
		return -1;
	}
	
	public static int smallestEvenRepeatingElement(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i] == ar[i+1] && ar[i]%2 == 0) {
				return ar[i];
			}
		}
		return -1;
	}
	
	public static int largestOddRepeatingElement(int[] ar) {
		for(int i=ar.length-2; i>=1; i--) {
			if(ar[i] == ar[i-1] && ar[i]%2 != 0) {
				return ar[i];
			}
		}
		return -1;
	}
	
	public static int smallestOddRepeatingElement(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i] == ar[i+1] && ar[i]%2 != 0) {
				return ar[i];
			}
		}
		return -1;
	}
	
	
	
}
