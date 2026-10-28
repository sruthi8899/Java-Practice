import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n%3 == 0 && n%5 == 0) {
			System.out.println("BTM");
		}
		else if(n%3 == 0) {
			System.out.println("ACAD");
		}
		else if(n%5 == 0) {
			System.out.println("TAP");
		}

	}

}
