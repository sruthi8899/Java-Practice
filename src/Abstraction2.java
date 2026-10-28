abstract class Bird{ // abstract class
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird{//inheritance
	
	public void fly() {
		System.out.println("the eagle are flies at great height.");
	}
}
class SerpentEagle  extends Eagle{
	
	public  void eat() {
		System.out.println("the eagle eats snakes.");
	}
}

class GoldenEagle extends Eagle{
	@Override
	public void eat() {
		System.out.println("the eagle eats over ocean like fish,etc...");
	}
}
class Animal{ // Polymorphism
	public void wings(Bird ref) {
		ref.eat();
		ref.fly();
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		SerpentEagle s = new SerpentEagle();
		GoldenEagle g = new GoldenEagle();
		
	    Animal a = new Animal();
	    
	    a.wings(s);
		a.wings(g);

	}

}
