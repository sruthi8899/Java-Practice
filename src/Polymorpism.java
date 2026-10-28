
class Plane1{
	public void takeoff(){
		System.out.println("the plane is taking off..");
	}
	public void fly() {
		System.out.println("the plane is flying...");
	}
	public void land() {
		System.out.println("the plane is landing on....");
	}
}
class CargoPlane extends Plane1{
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
class PassengerPlane extends Plane1{
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
class FighterPlane extends Plane1{
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
////1.code reduction and 2.code flexibility
class Airport{
	void permission(Plane1 ref){
		    ref.takeoff();
	        ref.fly();
	        ref.land();
	        //((CargoPlane)(ref)).carryCargo(); // these specialized method doesn't work in code flexibility
	}
}
public class Polymorpism {

	public static void main(String[] args) {
//		CargoPlane cp = new CargoPlane();
//		PassengerPlane pp = new PassengerPlane();
//		FighterPlane fp = new FighterPlane();
		
//// child object, parent reference (loose coupling).
//		Plane1 ref;
//		
//		ref = cp;
//		ref.fly();
//		ref.carryCargo(); // we can't access  parent reference (parent method)
//// DowmCasting
//		((CargoPlane)(ref)).carryCargo();//convert parent  reference into child reference to behave like chlid
//		cp.carryCargo(); // we can acess by child object reference
//		
//		ref = pp;
//		ref.fly();
//		((PassengerPlane)(ref)).carryPassenger();
////		
//		ref = fp;
//		ref.fly();
//		((FighterPlane)(ref)).carryWeapons();
		
//// child object, child reference (tight coupling).
//        cp.takeoff();
//        cp.fly();
//        cp.land();
//        cp.carryCargo();
//        
//        pp.takeoff();
//		pp.fly();
//		pp.land();
//		pp.carryPassenger();
//		
//		fp.takeoff();
//		fp.fly();
//		fp.land();
//		fp.carryWeapons();
		
////loose coupling
//        Plane1 ref;
//        
//        ref = cp;
//	    ref.takeoff();
//        ref.fly();
//        ref.land();
//        cp.carryCargo();
//        
//        ref = pp;
//        ref.takeoff();
//		ref.fly();
//		ref.land();
//		pp.carryPassenger();
//		
//		ref = fp;
//		ref.takeoff();
//		ref.fly();
//		ref.land();
//		fp.carryWeapons();

		//// code Reduction
		 
//		Plane1 ref;
//	        
//	      Airport a = new Airport();
//	      a.permission(cp);
//	      cp.carryCargo();
//	        
//	      a.permission(pp);
//	      pp.carryPassenger();
//	      
//	      a.permission(fp);
//		  fp.carryWeapons();
		  
 //// UpCasting
		 
      Plane1 ref = new CargoPlane();
      
      ref.takeoff();
      ref.fly();
      ref.land();
      ((CargoPlane)(ref)).carryCargo();
      
      Plane1 ref1 = new PassengerPlane();
      
      ref1.takeoff();
      ref1.fly();
      ref1.land();
      ((PassengerPlane)(ref1)).carryPassenger();
      
      Plane1 ref3 = new FighterPlane();
      
      ref3.takeoff();
      ref3.fly();
      ref3.land();
      ((FighterPlane)(ref3)).carryWeapons();
	}

}
