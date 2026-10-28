interface Calculator5{
    void add();
	void sub();
}

////Rule 7: an interface can't implement another interface, because an interface cannot provide methods with the body inside it.
/// 
/// interface Calculator50 implements Calculator5{

////Rule 8:An interface can extends another interface 
interface Calculator50 extends Calculator5 {
    void mul();
	void div();
}

//// Rule 8: not only this can inherit from multiple interface because diamond shape problem doesn't exist
/// multiple interface in  java can be indirectly achieved by making use of interface
interface Calculator51 extends Calculator50,Calculator5{
	void mod();
}

class Calc implements Calculator51{

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
	}
	
}



////Rule 5: if a class partially implements interface , it must be declare utself as abstract
/// mean implement only one method of interface , the class must be abstract or implement all methods 
//abstract class MyCalc implements Calculator5{
//	public void add() {
//		System.out.println("hello");
//	}
//}





////Rule 6: a class can implements multiple interface , because diamond shape problem does not exist as interface will not have parent
 class MyCalc implements Calculator5,Calculator50{
	public void add() {
		System.out.println("addition");
	}
	public void sub() {
		System.out.println("subtraction");
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class Interface1{

	public static void main(String[] args) {
		

	}

}
