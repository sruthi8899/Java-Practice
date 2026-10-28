import java.util.Scanner;

public class Twovalue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n>=10 && n<=99) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
