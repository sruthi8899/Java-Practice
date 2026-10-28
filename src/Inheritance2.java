/**
 * 1
 * single Inheritance 
 * allowed in java
 */
//class Parent {
//	String hairColor = "Black";
//	String skinColor = "Brown";
//	float height = 6.58f;
//	String nose = "Wide";
//	
//	void readBooks(){
//		System.out.println("Reading Books.");
//	}
//	void smoking(){
//		System.out.println("No Smoking.");
//	}
//	void drinking(){
//		System.out.println("No Drinking.");
//	}
//}
//
//class Child extends Parent{
//	
//}
//public class Inheritance2 {
//
//	public static void main(String[] args) {
//		Child c = new Child();
//		System.out.println(c.hairColor);
//		System.out.println(c.skinColor);
//		System.out.println(c.height);
//		System.out.println(c.nose);
//		
//		c.readBooks();
//		c.smoking();
//		c.drinking();
//		
//		
//	}
//
//}



/**
 * 2
  * Multilevel Inheritance
  * allowed in java
  */
//class GrandParent{
//	 void cultivation(){
//		 System.out.println("Love cultivation.");
//	 }
// }
//	 class Parent extends GrandParent{
//	String hairColor = "Black";
//	String skinColor = "Brown";
//	float height = 6.58f;
//	String nose = "Wide";
//	
//	void readBooks(){
//		System.out.println("Reading Books.");
//	}
//	void smoking(){
//		System.out.println("No Smoking.");
//	}
//	void drinking(){
//		System.out.println("No Drinking.");
//	}
//}
//
//class Child extends Parent{
//	
//}
//public class Inheritance2 {
//
//	public static void main(String[] args) {
//		Child c = new Child();
//		System.out.println(c.hairColor);
//		System.out.println(c.skinColor);
//		System.out.println(c.height);
//		System.out.println(c.nose);
//		
//		c.readBooks();
//		c.smoking();
//		c.drinking();
//		c.cultivation();
//		
//	}
//
//}

/**
 * 3
 * Hierarchical Inheritance
 * allowed in java
 */

//class Parent{
//	String hairColor = "Black";
//	String skinColor = "Brown";
//	float height = 6.58f;
//	String nose = "Wide";
//	
//	void readBooks(){
//		System.out.println("Reading Books.");
//	}
//	void smoking(){
//		System.out.println("No Smoking.");
//	}
//	void drinking(){
//		System.out.println("No Drinking.");
//	}
//}
//
//class Child1 extends Parent{
//	
//}
//class  Child2 extends Parent{
//	
//}
//class  Child3 extends Parent{
//	
//}
//public class Inheritance2 {
//
//	public static void main(String[] args) {
//		Child1 c1 = new Child1();
//		System.out.println(c1.hairColor);
//		System.out.println(c1.skinColor);
//		System.out.println(c1.height);
//		System.out.println(c1.nose);
//		
//		c1.readBooks();
//		c1.smoking();
//		c1.drinking();
//		
//		Child2 c2 = new Child2();
//		System.out.println(c2.hairColor);
//		System.out.println(c2.skinColor);
//		System.out.println(c2.height);
//		System.out.println(c2.nose);
//		
//		c2.readBooks();
//		c2.smoking();
//		c2.drinking();
//		
//		Child3 c3 = new Child3();
//		System.out.println(c3.hairColor);
//		System.out.println(c3.skinColor);
//		System.out.println(c3.height);
//		System.out.println(c3.nose);
//		
//		c3.readBooks();
//		c3.smoking();
//		c3.drinking();
//		
//		
//	}
//
//}
/**4
 * Hybrid Inheritance
 * allowed in java
 */
class GrandParent{
	 void cultivation(){
		 System.out.println("Love cultivation.");
	 }
 }
class Parent extends GrandParent{
	String hairColor = "Black";
	String skinColor = "Brown";
	float height = 6.58f;
	String nose = "Wide";
	
	void readBooks(){
		System.out.println("Reading Books.");
	}
	void smoking(){
		System.out.println("No Smoking.");
	}
	void drinking(){
		System.out.println("No Drinking.");
	}
}

class Child1 extends Parent{
	
}
class  Child2 extends Parent{
	
}
class  Child3 extends Parent{
	
}
public class Inheritance2 {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		System.out.println(c1.hairColor);
		System.out.println(c1.skinColor);
		System.out.println(c1.height);
		System.out.println(c1.nose);
		
		c1.readBooks();
		c1.smoking();
		c1.drinking();
		
		Child2 c2 = new Child2();
		System.out.println(c2.hairColor);
		System.out.println(c2.skinColor);
		System.out.println(c2.height);
		System.out.println(c2.nose);
		
		c2.readBooks();
		c2.smoking();
		c2.drinking();
		
		Child3 c3 = new Child3();
		System.out.println(c3.hairColor);
		System.out.println(c3.skinColor);
		System.out.println(c3.height);
		System.out.println(c3.nose);
		
		c3.readBooks();
		c3.smoking();
		c3.drinking();
		
		c1.cultivation();
		c2.cultivation();
		c3.cultivation();
		
		
	}

}

/**
 * 5
 * Multiple Inheritance
 * doesn't allowed in java
 */

//class Parent1{
//	String hairColor = "Black";
//	String skinColor = "Brown";
//	float height = 6.58f;
//}
//class Parent2{
//	String nose = "Wide";
//}
//class Child extends Parent1, Parent2{
//	
//}
//public class Inheritance2 {
//
//	public static void main(String[] args) {
//		Child c = new Child();
//		System.out.println(c.hairColor);
//		System.out.println(c.skinColor);
//		System.out.println(c.height);
//		
//		
//	}
//
//}

/**
 * 6
 * Cyclic Inheritance
 * doesn't allowed in java
 */

//class Parent extends Child{
//	String hairColor = "Black";
//	String skinColor = "Brown";
//	float height = 6.58f;
//}
//class Child extends Parent{
//	
//}
//public class Inheritance2 {
//
//	public static void main(String[] args) {
//		Child c = new Child();
//		System.out.println(c.hairColor);
//		System.out.println(c.skinColor);
//		System.out.println(c.height);
//		
//		
//	}
//
//}
/**
 * Constructors are not allowed in Inheritance
 */


