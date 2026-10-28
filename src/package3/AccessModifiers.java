package package3;

import package1.Demo1;

class Demo4{
	void diplay() {
		Demo1 d = new Demo1();
		System.out.println(d.a);
		System.out.println(d.b);  // it not accessible outside the class 
		System.out.println(d.c);  // it not accessible outside the class
		System.out.println(d.d);  // it not accessible outside the class
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		
	}

}
