import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		
		long res = sumOfDigits(n);
		System.out.println(res);
		
	}
	
	public static long sumOfDigits(long n) {
		long sum = 0;
		long rem = 0;
		
		while(n>0) {
		rem = n%10;
		sum = sum+rem;
		n = n/10;
	}
		return sum;

}
}
