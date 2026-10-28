import java.util.Scanner;

public abstract class Greaterandlessthan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a > b) {
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}

}
