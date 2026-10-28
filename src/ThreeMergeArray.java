import java.util.Scanner;

public class ThreeMergeArray {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] ar1 = new int[n];
		for(int i=0; i<ar1.length; i++) {
			ar1[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] ar2 = new int[m];
		for(int i=0; i<ar2.length; i++) {
			ar2[i] = scan.nextInt();
		}
		
        int s = scan.nextInt();
		int[] ar3 = new int[s];
		for(int i=0; i<ar3.length; i++) {
			ar3[i] = scan.nextInt();
		}
		
		int[] res = threeMergeArray(ar1, ar2, ar3);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
		
	}
	
	 public static int[] threeMergeArray(int[] ar1, int[] ar2, int[] ar3) {
        int i = 0, k = 0;
        int[] res = new int[ar1.length + ar2.length+ar3.length];

        while (k < res.length) {
            if(i<ar1.length) {
            	res[k++] = ar1[i];
            	
            }
            if(i<ar2.length) {
            	res[k++] = ar2[i];
            }
            if(i<ar3.length) {
            	res[k++] = ar3[i];
                i++;
            }
            
        }
        return res;
     }
}
	
    


