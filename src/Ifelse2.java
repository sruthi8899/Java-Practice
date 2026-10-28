import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n >= 91 && n <= 100) {
			System.out.println("A+");
		}
		else if(n >= 81 && n <= 90) {
			System.out.println("A");
		}
		else if(n >= 71 && n <= 80) {
			System.out.println("B+");
		}
		else if(n >= 61 && n <= 70) {
			System.out.println("B");
		}
		else if(n >= 51 && n <= 60) {
			System.out.println("C+");
		}
		else if(n >= 35 && n <= 50) {
			System.out.println("C");
		}
		else {
			System.out.println("Fail");
		}
	}
}
