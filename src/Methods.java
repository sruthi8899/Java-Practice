class Main {
	int c;
	int  add(int a, int b) {
		c=a+b;
		return c;
	}
}

public class Methods {

	public static void main(String[] args) {
		Main m = new Main();
		int num1 = 50;
		int num2 = 40;
		int res = m.add(num1, num2); {
			System.out.println(res);	
		}
	}

}
