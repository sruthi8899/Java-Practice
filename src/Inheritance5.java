/**
 * Rules of method overriding
 * 1Rlue: Access Modifier(increase from private to public) or (should be same).
 * 2Rule: return type(should be same) primitive data type
 * 3Rule: Covarient return type(IS-A) there must me relationship  and return tupe can change (String--object)
 * 4Rule: Parameter (must be same)
 */
//class Animal{
//	
//}
//class Lion extends Animal{
//	
//}
//class Basedclass{
//	public Animal disp() {
//		System.out.println("Base Class");
//		Animal a = new Animal();
//		return a;
//		
//	}
//}
//class Derivedclass extends Basedclass{
//	@Override
//	public Lion disp() {
//		System.out.println("Derived Class");
//		Lion l = new Lion();
//		return l;
//	}
//}
//public class Inheritance5 {
//
//	public static void main(String[] args) {
//		Derivedclass d = new Derivedclass();
//		d.disp();
//	}
//
//}

/**
 * Final Keyword 
 * 1:-Variable[constant]---desn't change
 * 2:-method[can't override]---can't method as final and cannot override the final method
 * 3:-class[can't inhertance]---final class never participate in inheritance
 */

final class Calculator001{
	final float pi = 3.142f;
	final void disp() {
		System.out.println("parent");
		System.out.println(pi);
	}
}

class Calculator1 extends Calculator001{
	 void disp() {
		System.out.println("child");
	}
}
public class Inheritance5 {

	public static void main(String[] args) {
		Calculator1 c = new Calculator1();
		c.disp();
	}

}
