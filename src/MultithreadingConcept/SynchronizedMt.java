package MultithreadingConcept;

class Bathroom extends Thread{
	synchronized void bathroom() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+" has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(t.getName()+" is using the bathroom");
			Thread.sleep(3000);
			System.out.println(t.getName()+" has existing from the bathroom");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Boy extends Thread{
	Bathroom ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Boy(Bathroom ba) {
		this.ba = ba;
	}
}
class Girl extends Thread{
	Bathroom ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Girl(Bathroom ba) {
		this.ba = ba;
	}
}
class Others extends Thread{
	Bathroom ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Others(Bathroom ba) {
		this.ba = ba;
	}
}
public class SynchronizedMt {

	public static void main(String[] args) throws Exception{
		
		Bathroom ba = new Bathroom();
		Boy b = new Boy(ba);
		b.setName("Boy");
		Girl g = new Girl(ba);
		g.setName("Girl");
		Others o = new Others(ba);
		o.setName("Others");
		b.start();
//		b.join();
		g.start();
//		g.join();
		o.start();
//		o.join();
		
		

	}

}
