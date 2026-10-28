interface Calculator3{
	
	////Rule 10: an interface can contain constant variable and method signature .
	/// an variable within an interface is automatically (public static final).
	public static final int count = 3;
	
	public abstract void add();
	void sub();
}
class Calculator31{
	public void mul() {
		
	}
	public void div() {
		
	}
}
////Rule 9: A class can both extends class as well as implements interface 
/// order should be extends first and implements later.
class Mycalc extends Calculator31 implements Calculator3 {
   
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}

////Rule 11: An empty interface in java is referred to as marker interface or tagged interface 
/// it is used to provide special properties to the object of the class 
/// some interface: runnable, (serializable), compartable, set, list, comparate, queue
interface Serializable{
	
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



////Rule 12: an object of an interface cannnot be created ,because an interface is a collection of abstract method
/// however, reference can be created so that loose coupling, ploymorphism and it,s advantages can be achieved.
