import java.util.Scanner;

public class ArrayTraversal3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		int sum = SumOfMaxMinElement(ar);//sum of array
		int max = largestElement(ar);
		int min = smalestElement(ar);
		System.out.println(sum-max);
		System.out.println(sum-min);
		
//		int[] res = productOfArr(ar); //product of array
//		for(int i=0; i<res.length; i++) {
//			System.out.print(res[i] + " ");
//		}
		
	}
	/**
	 * sum of the n-1 element present in the array
	 */
	
	public static int SumOfMaxMinElement(int[] ar) {
		int sum =0;
		for(int i=0; i<ar.length; i++) {
			sum = sum+ar[i];
		}
		return sum;
	}
	
	public static int largestElement(int[] ar) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		return max;
	}
	
	public static int smalestElement(int[] ar) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		return min;
	}
	
//------------------------------------------------------------------------------------------------------------------------------
   
	/**
	 * product of the n-1 element present in the array
	 */
	public static int[] productOfArr(int[] ar) {
	   int prod = 1;
	   for(int i=0; i<ar.length; i++) {
		   prod = prod * ar[i];
	   }
	   
	   int[] res = new int[ar.length];
	   
	   for(int i=0; i<ar.length; i++) {
		   res[i] = prod/ar[i];
	   }
	   return res;
   }


}
