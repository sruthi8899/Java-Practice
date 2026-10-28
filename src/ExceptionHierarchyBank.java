
//	int count = 10;
//	public void disp(){
//		if(count == 0) {
//			return ;
//		}
//		System.out.println(count);
//		count--;
//		disp();
//	}

//ExceptionHierarchy e = new ExceptionHierarchy();
//		e.disp();
		////both are the runtime Error:
		/// forcount=StackOverflowError
		/// array=OutOfMemoryError
//		try {
//			int[] ar = new int[Integer.MAX_VALUE];
//		}
//		catch(Exception e) {
//			System.out.println("handled");
//		}
		
		////Runtime Exception:ex: java.lang.ArithmeticException
//		int c= 100/0; 
//		System.out.println(c);
		
		////compile time Exception:(java.lang.NullPointerException)
//		try {
//			Class.forName(null);
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}

import java.util.Scanner;

////to check valid or invalid example with atm to enter the pin only three time
/// Custom Exception
class Atm{
	int cardNum = 12345;
	int pin = 999;
	
	int accN;
	int pswd;
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the account number:");
		accN = scan.nextInt();
		System.out.println("Enter the pin:");
		pswd = scan.nextInt();
	}
//	public void validate() throws InvalidUserException //it is for the checkes exception
	public void validate() throws InvalidUserException  {
		if(accN == cardNum && pswd == pin) {
			System.out.println("Collect the cash...");
		}
		else {
			System.out.println("Invalid Input");
			InvalidUserException iue = new InvalidUserException();
			throw iue;
			
			////getmessage(); usage
//			InvalidUserException iue = new InvalidUserException();
//			System.out.println(iue.getMessage());
//			throw iue;
			
		}
	}
}

class Bank1{
	public void permit() {
	Atm	a = new Atm();
	
	a.validate();
	try {
		a.acceptInput();
		a.validate();//compiletimeException will come
	}
	catch(Exception e1) {
		try {
			a.acceptInput();
			a.validate();
		}
		catch(Exception e2) {
			try {
				a.acceptInput();
				a.validate();
			}
			catch(Exception e3) {
				
					System.err.println("Card Blocked..please visit your bank");
				}
			}
		}
	}
}

class InvalidUserException extends RuntimeException{
////getmessage() usgae
//	@Override
//	public String getMessage() {
//		// TODO Auto-generated method stub
//		return "Invlid user";
//	}
	
}
public class ExceptionHierarchyBank {

	public static void main(String[] args) {

		Bank1 b = new Bank1();
		b.permit();
		
	}

}
