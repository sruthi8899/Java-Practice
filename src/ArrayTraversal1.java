import java.util.Scanner;

public class ArrayTraversal1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();

		}
		System.out.println(sum(ar));
	}
        
//-----------------------------------------------------------------------------------------------------------
		
		/**
		 * sum of the element present in array
		 */
		
		public static int sum(int[] ar) {
			int sum = 0;
			for(int i=0; i<ar.length; i++) {
				sum = sum+ar[i];
			}
			return sum;
	}

		/**
		 * another method to sum 
		 */
		

//		int sum = 0;
//		for(int i=0; i<ar.length; i++) {
//			sum = sum+ar[i];
//		}
//		System.out.print(sum);
//	}
// }
		
////------------------------------------------------------------------------------------------------------------------------		
/**
 * product of the element present in array
 */
		
		
		
		public static long prod(int[] ar) {
			long prod = 1;
			for(int i=0; i<ar.length; i++) {
				prod = prod*ar[i];
			}
			return prod;
	}



		
		/**
		 * another method to product
		 */
//		for(int i=0; i<ar.length; i++) {
//			ar[i] = scan.nextInt();
//
//		}
//		int prod = 1;
//		for(int i=0; i<ar.length; i++) {
//			prod = prod*ar[i];
//		}
//		System.out.print(prod);
//	}
//}
// 

////----------------------------------------------------------------------------------------------------------------------
/**
 * largest element in the array
 */


    public static int largestElement(int[] ar) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

/**
 *  Largest element present in the array and print the index
 */
        
    
    public static int indexOfLargestElement(int[] ar) {
    	int max = Integer.MIN_VALUE;
    	int index = 0;
    	for(int i=0; i<ar.length; i++) {
    		if(ar[i] > max) {
    			max = ar[i];
    			index = i;
    		}
    	}
    	return  index;
    }

////----------------------------------------------------------------------------------------------------------------------
/**
 * smallest element in the array
 */

    
    public static int smallestElement(int[] ar) {
    	int min = Integer.MAX_VALUE;
    	for(int i=0; i<ar.length; i++) {
    		if(ar[1]<min) {
    			min = ar[i];
    		}
    	}
    	return min;
    }


/**
 * smallest element present in the array and print the index
 */
   
     public static int indexOfSmallestElement(int[] ar) {
       	int min = Integer.MAX_VALUE;
       	int index = 0;
     	for(int i=0; i<ar.length; i++) {
     		if(ar[i]<min) {
     			min = ar[i];
     			index =i;
     		}
     	}
     	return index;
     }
 }



