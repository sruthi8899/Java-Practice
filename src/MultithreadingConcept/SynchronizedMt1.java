package MultithreadingConcept;

class Warrior extends Thread{
	String res1 = "Brahmastra";
	String res2 = "Sarpastra";
	String res3 = "Pashupastra";
	@Override
	public void run() {
		String name = getName();
		if(name.equals("Arjuna")) {
			arjuna();
		}
		else {
			karna();
		}
	}
	
	public void arjuna(){
		try {
			Thread.sleep(5000);
			synchronized(res3){
				System.out.println("Arjuna has acquried "+res3);
				Thread.sleep(5000);
				synchronized(res2) {
					System.out.println("Arjuna has acquried "+res2);
					Thread.sleep(5000);
					synchronized(res1) {
						System.out.println("Arjuna has acquried "+res1);
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void karna(){
		try {
			Thread.sleep(5000);
			synchronized(res1){
				System.out.println("Karna has acquried "+res1);
				Thread.sleep(5000);
				synchronized(res2) {
					System.out.println("Karna has acquried "+res2);
					Thread.sleep(5000);
					synchronized(res3) {
						System.out.println("Karna has acquried "+res3);
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}



public class SynchronizedMt1 {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		w1.setName("Arjuna");
		w2.setName("Karna");
		w1.start();
		w2.start();
		
		
		
	}

}
