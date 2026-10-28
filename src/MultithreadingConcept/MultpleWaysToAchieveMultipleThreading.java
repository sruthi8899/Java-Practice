package MultithreadingConcept;

import java.util.Scanner;

/**
 * Two ways
 * 1.extends class
 * 2.implements interface
 */


class Add2 implements Runnable{
	@Override
	public void run(){
			System.out.println("Adding started");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number1");
			int num1= scan.nextInt();
			System.out.println("Entyer the number2");
			int num2 = scan.nextInt();
			System.out.println(num1+num2);
			System.out.println("Adding completed");
	}
}

class Char2 implements Runnable{
	@Override
	public void run() {
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
}

class Nums2 implements Runnable{
	@Override
	public void run() {
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
public class MultpleWaysToAchieveMultipleThreading {

	public static void main(String[] args) {
		
		Add2 a = new Add2();
		Char2 c = new Char2();
		Nums2 n = new Nums2();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(n);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
