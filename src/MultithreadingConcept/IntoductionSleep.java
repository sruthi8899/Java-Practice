package MultithreadingConcept;

import java.util.Scanner;


class Add extends Thread{
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

class Char extends Thread{
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

class Nums extends Thread{
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

public class IntoductionSleep {

	public static void main(String[] args) {
		
		Add a = new Add();
		Char c = new Char();
		Nums n = new Nums();
		
		a.start();
		c.start();
		n.start(); 
		

	}

}
