import java.util.Scanner;

////rethrowing the exception(try-catch-throw-throws-finally)
class Demo99{
	public void fun1() throws Exception{

	////Exception hierarchy
	
		
			try {
				int c = 100/0;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());  e.getMessage();
				e.printStackTrace();
		}
		
		
		
		
		
		////scanner 
//		Scanner scan = null;
//		try {
//			scan = new Scanner(System.in);
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			int c = a/b;
//		}
//		finally {
//			scan.close();
//		}
		
		
//		System.out.println("connection2 is established...");
//			try {
//				Scanner scan = new Scanner(System.in);
//				
//				System.out.println("Enter the numenator:");
//				int a = scan.nextInt();
//
//				System.out.println("Enter the denominator:");
//				int b = scan.nextInt();
//				
//				int c = a/b;
//		        System.out.println(c);		
//			
//			}
////			catch(Exception e) {
////				System.out.println("Handled in ATM");
////			}
//			
//	        finally
//			{
//				System.out.println("connection2 is terminated...");
//			}
	}
}

public class ExceptionalMultipleWay { 

	public static void main(String[] args) throws Exception{
    Scanner scan = new Scanner(System.in);
		
        System.out.println("connection1 is established...");
		
		try {
			Demo99 d = new Demo99();
			d.fun1();
		}
		
		catch(Exception e) {
			System.out.println("Handled in bank");
		}
        System.out.println("connection1 is terminated...");

	} 
}




