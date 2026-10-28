import java.util.Scanner;

public class Prime1 {
	
	public static void primeNumber(int n, int m) {
		for(int i=n; i<=m; i++) {
			if(checkprime(i)) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
	public static boolean  checkprime(int n) {
		if(n <= 1) {// these for to check 1, 0, -ve values are prime or not
			return false;
		}
		for(int i=2; i*i<=n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		
	      primeNumber(n, m);
		

	}

}
