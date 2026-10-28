//class Car9{
//	 static public float milesToKm(float miles) {
//		float km = miles*1.6f;
//				return km;
//	}
//	public float mileage(float km) {
//		return km;
//	}
//}
//public class Car {
//
//	public static void main(String[] args) {
//		System.out.println(Car9.milesToKm(380));
//	}
//
//}

//static method execute without creating a object.
//allocated efficient memory utilization .
//static method will execute before controls comes to the main method.


/**
 *Interview question: java followed by python 
 */

class Car{
	static {
		System.out.println("Java");
	}
	
	public static void main(String[] args) {
		System.out.println("Python");
	}
//	static {
//		System.out.println("Java");
//	}
}
