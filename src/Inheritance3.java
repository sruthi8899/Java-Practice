/**
 * Constructor chaining
 * calling one constructor  into another constructor present in the different class
 * by using super() call-- it must used in first line of a any constructor
 */

////Example:-1

//class Test1{
//	int x,y;
//	Test1(){
//		super();
//		x = 100;
//		y = 200;
//	}
//	Test1(int x, int y){
//		super();
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class Test2 extends Test1{
//	int a,b;
//	Test2(){
//		super();
//		a = 300;
//		b = 400;
//	}
//	Test2(int a, int b){
//		super();
//		this.a = a;
//		this.b = b;
//	}
//	void disp() {
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(a);
//		System.out.println(b);
//	}
//	
//}
//public class Inheritance3 {
//
//	public static void main(String[] args) {
//		Test2 t = new Test2();
//		t.disp();
//
//	}
//
//}

////Example:-2 (in object passing values)

//class Test1{
//	int x,y;
//	Test1(){
//		super();
//		x = 100;
//		y = 200;
//	}
//	Test1(int x, int y){
//		super();
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class Test2 extends Test1{
//	int a,b;
//	Test2(){
//		super();
//		a = 300;
//		b = 400;
//	}
//	Test2(int a, int b){
//		super();
//		this.a = a;
//		this.b = b;
//	}
//	void disp() {
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(a);
//		System.out.println(b);
//	}
//	
//}
//public class Inheritance3 {
//
//	public static void main(String[] args) {
//		Test2 t = new Test2(9,99);
//		t.disp();
//
//	}
//
//}

////Example:-3(super with parameters)

//class Test1{
//	int x,y;
//	Test1(){
//		super();
//		x = 100;
//		y = 200;
//	}
//	Test1(int x, int y){
//		super();
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class Test2 extends Test1{
//	int a,b;
//	Test2(){
//		super();
//		a = 300;
//		b = 400;
//	}
//	Test2(int a, int b){
//		super(a, b);
//		this.a = a;
//		this.b = b;
//	}
//	void disp() {
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(a);
//		System.out.println(b);
//	}
//	
//}
//public class Inheritance3 {
//
//	public static void main(String[] args) {
//		Test2 t = new Test2(9,99);
//		t.disp();
//
//	}
//
//}

////Example:-4 (this() call)used for the constructor chaining within the same class

class Test1{
	int x,y;
	Test1(){
		super();
		x = 100;
		y = 200;
	}
	Test1(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
}

class Test2 extends Test1{
	int a,b;
	Test2(){
		this(9,99);
		a = 300;
		b = 400;
	}
	Test2(int a, int b){
		super();
		this.a = a;
		this.b = b;
	}
	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class Inheritance3 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.disp();

	}

}
