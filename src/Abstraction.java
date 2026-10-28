abstract class Plane2{
	abstract public void takeoff();
	
	abstract public void fly(); 
	
	abstract public void land() ;
}
class CargoPlane1 extends Plane1{
	@Override
	public void takeoff(){
		System.out.println("the plane is taking off from long runway..");
	}
	@Override 
	public void fly() {
		System.out.println("the plane is flying at the low height...");
	}
	@Override
	public void land() {
		System.out.println("the plane is landing on long runway....");
	}
	public void carryCargo() {
		System.out.println("carry goods...");
	}
}
class PassengerPlane1 extends Plane1{
	@Override
	public void takeoff(){
		System.out.println("the plane is taking off from medium runway..");
	}
	@Override
	public void fly() {
		System.out.println("the plane is flying at the medium height...");
	}
	@Override
	public void land() {
		System.out.println("the plane is landing on medium runway....");
	}
	public void carryPassenger() {
		System.out.println("carry passengers...");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	public void takeoff(){
		System.out.println("the plane is taking off from small runway..");
	}
	@Override
	public void fly() {
		System.out.println("the plane is flying at the height height...");
	}
	@Override
	public void land() {
		System.out.println("the plane is landing on small runway....");
	}
	public void carryWeapons() {
		System.out.println("carry weapons...");
	}
}
//class Airport{
//	void permission(Plane2 ref){
//		    ref.takeoff();
//	        ref.fly();
//	        ref.land();
//	}
//}
public class Abstraction {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
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
