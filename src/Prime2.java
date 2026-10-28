import java.util.Scanner;

public class Prime2 {
	
	public static void firstPrimeNum(int n) {
		int count = 0;
		for(int i=2; count<n; i++) {
			if(checkprime(i)) {
				System.out.print(i + " " );
				count++;
			}
		}
	}
	
	public static boolean checkprime(int n) {
		if(n<=0) {
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
		
		firstPrimeNum(n);
	}

}
