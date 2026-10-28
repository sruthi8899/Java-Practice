class Demo02{
	//static variable
	static int a;
	static int b;
	
	//static block
	static {
		System.out.println("Inside the static block.");
		a = 10;
		b = 20;
		}
	//static method
	static void fun1(){
		System.out.println("Inside the static Method.");
	}
	
	//instance variable
	int x;
	int y;
	
	//instance block
	{
		System.out.println("Inside the instance variable.");
	}
	
	//Instance method
	void fun2() {
		System.out.println("Inside the instance method.");
	}
	
	//constructor
	public  Demo02(){
		System.out.println("Inside the constructor.");
		x = 99;
		y = 100;
	}
	
}

// the program start at main method
public class Demo01 {

	public static void main(String[] args) {
		
		Demo02.fun1();
		
		Demo02 d = new Demo02();
		d.fun2();
		

	}

}
