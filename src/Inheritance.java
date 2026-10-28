class BankAccount{
	int accNum = 1234;
	int pin = 567;
}
class Hacker extends BankAccount{
	public void cData(){
		accNum = 7890;
		pin = 4567;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Hacker h = new Hacker();
//		h.cData(); //calling method after output cData
		System.out.println(h.accNum);
		System.out.println(h.pin);
	}

}
