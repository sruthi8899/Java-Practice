import java.util.Scanner;

public class Rearrange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] ar = new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		rearrangeArray2(ar);
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+ " ");
		}
	}

	public static void rearrangeArray(int[] ar) {
		int i = ar.length-1;
		int j = ar.length-1;
		while(i>=0) {
			if(ar[i] == -1) {
				i--;
			}
			else {
				ar[j] = ar[i];
				i--;
				j--;	
			}
		}
		while(j>=0) {
			ar[j] = -1;
			j--;
		}
	}
	public static void rearrangeArray1(int[] ar) {
		int i = ar.length-1;
		int j = ar.length-1;
		while(i>=0) {
			if(ar[i] == -1) {
				i--;
			}
			else {
				ar[j--] = ar[i--];
					
			}
		}
		while(j>=0) {
			ar[j--] = -1;
			
		}
	}
	public static void rearrangeArray2(int[] ar) {
		int i =0;
		int j =0;
		while(i < ar.length) {
			if(ar[i] == 0) {
				i++;
			}
			else {
				ar[j] = ar[i];
				i++;
				j++;
			}
		}
		while(j<ar.length) {
			ar[j] = 0;
			j++;
		}
	}
}
