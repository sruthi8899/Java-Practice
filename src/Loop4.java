import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1; i<=20; i++)
		{
				System.out.println(n + " * " + i + " = " + n*i);
		}

	}

}
