import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		// for a and b team is w1
		int w1 = (a>b)? a : b;
		// for c and d team is w2
		int w2 = (c>d)? c : d;
		
		// Mar winner of w1 and w2
		int max = (w1>w2)? w1 : w2;
		
		System.out.println(max);
	}

}











//if(a < b) {
//	System.out.print(a);
//}
//else if(b < c) {
//	System.out.print(b);
//}
//else if(c > d) {
//	System.out.print(c);
//}
//else if(d > a) {
//	System.out.print(d);
//}