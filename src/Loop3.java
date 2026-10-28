import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%a == 0 || i%b == 0) {// or means in a and in b
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		
		for(int i=1; i<=n; i++) {
			if(i%a == 0 && i%b == 0) {//and means same both a and b
				System.out.print(i + " ");
			}
		}


	}

}
