package package2;

import package1.Demo1;

class Demo3 extends Demo1{
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);  // it is not accessible within the class and outside the page
		System.out.println(d);  // it not accessible within the subclass and outside the same page
	}
}
public class AccessModifiers {

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.disp();

	}

}
