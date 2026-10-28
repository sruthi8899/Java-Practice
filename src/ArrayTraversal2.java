import java.util.Scanner;

public class ArrayTraversal2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++) {
			ar[i] =scan.nextInt();
		} 
		
		System.out.println(bothLargestAndSmallestProd(ar));
	}
	/** 
	 * Second Largest Element
	 */
	
	public static int secondLargestElement(int[] ar) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] > max) {
				min = max;
				max = ar[i];
			}
			else if(ar[i] > min && ar[i] != max){
				min = ar[i];
			}
		}
		return min;
	}


	/**
	 * Second smallest Element
	 */
	public static int secondSmallestElement(int[] ar) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] < max) {
				min = max;
				max = ar[i];
			}
			else if(ar[i] < min && ar[i] != max) {
				min = ar[i];
			}
		}
		return min;
	}
	
/**
 * sum of largest first and second element
 */
	public static int largestSumPair(int[] ar) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] > max) {
				min = max;
				max = ar[i];
			}
			else if(ar[i] > min && ar[i] != max){
				min = ar[i];
			}
		}
		return max+min;
	}
	
    /**
	 * sum of smallest first and second element
	 */	
	public static int smallestSumPair(int[] ar) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] < max) {
				min = max;
				max = ar[i];
			}
			else if(ar[i] < min && ar[i] != max) {
				min = ar[i];
			}
		}
		return min+max;
	}
	
	/**
	 * product of largest first and second element
	 */
	public static int largestProdPair(int[] ar) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] > max) {
				min = max;
				max = ar[i];
			}
			else if(ar[i] > min && ar[i] != max){
				min = ar[i];
			}
		}
		return max*min;
	}
	
	/**
	 * product of smallest first and second element
	 */
	public static int smallestProdPair(int[] ar) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] < max) {
				min = max;
				max = ar[i];
			}
			else if(ar[i] < min && ar[i] != max) {
				min = ar[i];
			}
		}
		return min*max;
	}
	
	/**
	 * 
	 */
	public static int bothLargestAndSmallestProd(int[] ar) {

			int fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
			
			int fs = Integer.MAX_VALUE, ss = Integer.MAX_VALUE;
			
			for(int i=0; i<ar.length; i++) {
				if(ar[i] > fl) {
					sl = fl;
					fl = ar[i];
				}
				else if(ar[i] > sl){
					sl = ar[i];
				}
			
			
			
				if(ar[i] < fs) {
					ss = fs;
					fs = ar[i];
				}
				else if(ar[i] < ss) {
					ss = ar[i];
				}
			}
			
			
			int max1 = fl*sl;
			int max2 = fs*ss;
			int max3 = fl*fs;
			
			
//			return max1 < max2 ? max1 : max2 ;
			return max3;//getting product of first largest and first smallest
			
//			int[] result = {max1, max2, max3};
//			return result;
			
	}
	
	public static int largestAndSmallestProd(int[] ar) {

		int fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
		
		int fs = Integer.MAX_VALUE, ss = Integer.MAX_VALUE;
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i] > fl) {
				sl = fl;
				fl = ar[i];
			}
			
		
		
			if(ar[i] < fs) {
				ss = fs;
				fs = ar[i];
			}
			
		}
		
		
		
		int max3 = fl*fs;
		
		return max3;
		
		
}
	
//	public static int  pairsOfArray(int[] ar) {
//		int pair = 0;
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<=i; j++) {
//				ar[i] = ar[j];
//				pair = ar[i];
//			}
//		}
//		return pair;
//	}
	

}
