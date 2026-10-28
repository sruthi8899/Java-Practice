/**
 * Regular class
 */
//@FunctionalInterface
//interface Vechile{
//	void ride();
//}
//
//class Bicycle implements Vechile{
//
//	@Override
//	public void ride() {
//		System.out.println("Pedal the cycle");
//		
//	}
//	
//}
//public class Fuvtionalinterface {
//
//	public static void main(String[] args) {
//		Bicycle b = new Bicycle();
//		b.ride();
//	}
//
//}

/**
 * Inner class
 */
//@FunctionalInterface
//interface Vechile{
//	void ride();
//}

//taking another class and creating an object for the Main method class in outside class.
//class House{
//	void access() {
//		Fuvtionalinterface fi = new Fuvtionalinterface();
//	}
//}
//
//
//public class Fuvtionalinterface { //outer class
//	
//	public static void main(String[] args) {
//		
//		class Bicycle implements Vechile{ //Inner class
//
//			@Override
//			public void ride() {
//				System.out.println("Pedal the cycle");
//				
//			}
//			
//		}
//
//		Bicycle b = new Bicycle();
//		b.ride();
//	}
//
//}

/**
 * Anonymous inner class
 */
//@FunctionalInterface
//interface Vehicle{
//	void ride();
//}
//
//class House{
//	void access() {
//		Fuvtionalinterface fi = new Fuvtionalinterface();
//	}
//}
//
//
//public class Fuvtionalinterface { 
//	
//	public static void main(String[] args) {
//		
//		Vehicle  b = new Vehicle() { 
//
//			@Override
//			public void ride() {
//				System.out.println("Pedal the cycle");
//				
//			}
//		};
//
//		
//		b.ride();
//	}
//
//}

/**
 * Lamda Expression
 * (int a)->{ }; -----correct
 * (a)->{ };-------correct
 * a->{ };--------correct
 * a, b->{ };-------No
 * 
 *some interfaces created by java
 *Runnable
 *Comparable<T>
 *Comparator
 *
 */

@FunctionalInterface
interface Vehicle{
	void ride();
}

class House{
	void access() {
		Fuvtionalinterface fi = new Fuvtionalinterface();
	}
}


public class Fuvtionalinterface { 
	
	public static void main(String[] args) {
		
		Vehicle  b = () -> {System.out.println("Pedal the cycle");};

		
		b.ride();
	}

}






