import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan .nextInt();
		
		int res = reverseNumber(n);//reverse
		System.out.println(res);
		
//		System.out.print(sumNumber(n));

	}
	
	public static int reverseNumber(int n) {
		int rev = 0;
		while(n!=0) {  //while(n>0) for postive numbers(if negative it return 0),while(n!=0) is to negative and postive 
			int last = n%10;
			rev = rev*10+last;
			n = n/10;
		}
		return rev;
	}
	
	public static int sumNumber(int n) {
		int sum =0;
		while(n>0) {
			sum += n%10;
			n/=10;
		}
		return sum;
	}

}
