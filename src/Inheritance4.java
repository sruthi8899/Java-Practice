/**
 * Type of method in inheritance
 * @Override--used for (documentation )and (avoid the misspell code)
 */

class Plane{
	public void takeoff(){
		System.out.println("the plane is taking off.");  //1.Inherited method
	}
	public void fly() {
		System.out.println("the plane is flying.");  //1.Inherited method
	}
	public void land() {
		System.out.println("the plane is landing.");  //1.Inherited method
	}
}

class Cargoplane extends Plane{
	@Override
	public void fly() {
		System.out.println("the plane is flying at low height."); //2.Override method
	}
	public void carryCargo() {
		System.out.println("the plane is carrying cargo."); //3.Specialized method
	}
	
}
class Passengerplane extends Plane{
	@Override
	public void fly() {
		System.out.println("the plane is flying at medium height."); //2.Override method
	}
	public void carryPassenger() {
		System.out.println("the plane is carrying passengers."); //3.Specialized method
	}
	
}
class Fighterplane extends Plane{
	@Override
	public void fly() {
		System.out.println("the plane is flying at high height."); //2.Override method
	}
	public void carryWeapons() {
		System.out.println("the plane is carrying weapons."); //3.Specialized method
	}
	
}
public class Inheritance4 {

	public static void main(String[] args) {
		
		Cargoplane cp = new Cargoplane();
		Passengerplane pp = new Passengerplane();
		Fighterplane fp = new Fighterplane();
		
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryPassenger();
		
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		
		
	}

}
