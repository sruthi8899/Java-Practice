import java.util.Scanner;

public class Subarray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] ar = new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		longestConsecutiveSubarrayPrime(ar);
	}
	
	public static void consecutiveSubarray(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i+1]-ar[i]==1) {
				System.out.print(ar[i]+" ");
			}
			else {
				System.out.println(ar[i]);
				
			}
		}
		System.out.print(ar[ar.length-1]);
	}

	public static void consecutiveSubarrayLength(int[] ar) {
		int count =1;
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i+1]-ar[i]==1) {
				count++;
				
			}
			else {
				
				System.out.println(count);
				count = 1;
			}
		}
		System.out.print(count);
	}
	public static void consecutiveSubarrayLengthLongest(int[] ar) {
		int count =1;
		int max = 0;
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i+1]-ar[i]==1) {
				count++;
				
			}
			else {
				if(count > max) {
					max = count;
				}
				count = 1;
			}
		}
		System.out.print(max);
	}
	public static void longestConsecutiveSubarray(int[] ar) {
		int count =1;
		int max = 0;
		int ei = 0; //ending index
		int si = 0;  //starting index
		
		for(int i=0; i<ar.length-1; i++) {
//			if(ar[i+1]-ar[i]==1)
			if(ar[i+1]>ar[i])
			{
				count++;	
			}
			else {
				if(count > max) {
					max = count;
					ei = i;
				}
				count = 1;
			}
	     }
		if(count > max) {
			max = count;
			ei = ar.length-1;
		}
		si = ei - max +1;
		
		for(int i=si; i<=ei; i++) {
			System.out.print(ar[i]+" ");
		}
  }
	public static void longestConsecutiveSubarrayPrime(int[] ar) {
		int count =1;
		int max = 0;
		int ei = 0; //ending index
		int si = 0;  //starting index
		
		if(!isPrime(ar[0])) {
			count = 0;
		}
		for(int i=0; i<ar.length-1; i++) {
//			if(ar[i+1]-ar[i]==1)
			if(isPrime(ar[i+1]) && isPrime(ar[i]))
			{
				count++;	
			}
			else {
				if(count > max) {
					max = count;
					ei = i;
				}
				count = isPrime(ar[i+1])? 1 : 0;
			}
	     }
		if(count > max) {
			max = count;
			ei = ar.length-1;
		}
		si = ei - max +1;
		
		for(int i=si; i<=ei; i++) {
			System.out.print(ar[i]+" ");
		}
  }
	public static boolean isPrime(int n) {
	    if(n < 2)
	    	return false;
	    if(n == 2)
	    	return true;
	    if(n%2 == 0)
	    	return false;
	    for(int i = 3; i*i<=n; i+=2) {
	    	if(n%2 == 0)
	    		return false;
	   }
	    return true;
	}

}
