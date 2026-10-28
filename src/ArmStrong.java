import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for(int i=n; i<m; i++) {
			if(armStrong(i)) {
				System.out.println(i);
			}
		}

	}
	
	public static int count(int n) {
		int count =0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	public static boolean armStrong(int n) {
		int arm = 0, last = 0;
		int count = count(n);
		int temp = n;
		
			while(n>0) {
				last = n%10;
				arm = arm + (int)Math.pow(last, count);
				n = n/10;
			}
			return arm == temp;
		
	}

}
