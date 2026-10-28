 class Mains {
	
	public void add(int a, float b){
		System.out.println(1);
		float c =  a+b;
		System.out.println(c);
	}
	public void add(float a, int b){
		System.out.println(2);
		float c =  a+b;
		System.out.println(c);
	}
//	public void add(int a, float b){
//		float c =  a+b;
//		System.out.println(c);
//	}
//	public void add(double a, double b){
//		double c =  a+b;
//		System.out.println(c);
//	}
//	public void add(double a, int b){ 
//		double c =  a+b;
//		System.out.println(c);
//	}
//	public void add(int a, int b,int c){
//		int d =  a+b+c;
//		System.out.println(d);
//	}
//	public void add(int a, float b, double c){
//		double d =  a+b+c;
//		System.out.println(d);
//	}
//	public void add(int a, float b, float c){
//		float d =  a+b+c;
//		System.out.println(d);
//	}
//	public void add(double a, double b, int c){
//		double d =  a+b+c;
//		System.out.println(d);
//	}
//	public void add(float a, float b, float c){
//		float d =  a+b+c;
//		System.out.println(d);
//	}
	
}




public class Calculator {

	public static void main(String[] args) {
		
		Mains calc = new Mains();
		
		calc.add(123, 123.4f);

	}

}
