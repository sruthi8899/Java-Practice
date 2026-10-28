package MultithreadingConcept;

import java.util.Scanner;

/**
 * Inbuild methods of Thread class
 */
class Alpha extends Thread{
	@Override
	public void run() {
//		Thread t = Thread.currentThread();
//		System.out.println(t.getPriority());
//		System.out.println(t.getName());
		
		System.out.println("Java Thread started to execute");
		try {
			System.out.println("Java Thread is executing");
			Thread.sleep(2000);
			System.out.println("Java Thread is executing");
			Thread.sleep(2000);
			System.out.println("Java Thread is executing");
			Thread.sleep(2000);
			System.out.println("Java Thread is executing");
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println("Java Thread completed to execute");
	}
}

/**
 * only one run()
 */
class SingleRun extends Thread{
	@Override
	public void run() {
		String name = getName();
		if(name.equals("ADD")) {
			adding();
		}
		else if(name.equals("CHAR")){
			printChar();
		}
		else {
			printNums();
		}
		
	}
	public void adding() {
		System.out.println("Adding started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1= scan.nextInt();
		System.out.println("Entyer the number2");
		int num2 = scan.nextInt();
		System.out.println(num1+num2);
		System.out.println("Adding completed");
	}
	public void printChar() {
		System.out.println("Printing chars started");
		for(int i=65; i<=69; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("printing chars completed");
	}
	public void printNums() {
		
			System.out.println("Printing Nums started");
			for(int i=1; i<=5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(3000);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			System.out.println("printing Nums completed");
	}
}


public class OneRunMethodToAchieveMT {

	public static void main(String[] args)  {
////Inbuild method of the thread class		
//		System.out.println("Main thread started to execute");
//		Alpha a = new Alpha();
//		a.setName("Java");
//		a.setPriority(2);
//		a.start();
//		a.join();
//		System.out.println(a.isAlive());
//		System.out.println("Main Thread completed the executed");

////SingleRun()

		SingleRun s1 = new SingleRun();
		SingleRun s2 = new SingleRun();
		SingleRun s3 = new SingleRun();
		s1.setName("ADD");
		s2.setName("CHAR");
		s3.setName("NUM");
		s1.start();
		s2.start();
		s3.start();
		
		}

}
