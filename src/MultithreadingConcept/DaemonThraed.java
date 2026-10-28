package MultithreadingConcept;

class Captain extends Thread{
	@Override
	public void run() {
		try {
			BattingCoach bac = new BattingCoach();
			BowlingCoach boc = new BowlingCoach();
			bac.setName("Bat");
			boc.setName("Bow");
			bac.setDaemon(true);
			boc.setDaemon(true);
			bac.start();
			boc.start();
			System.out.println("Captain goes to ground");
	        Thread.sleep(3000);
	        System.out.println("Captain will do some warm-up");
	        Thread.sleep(3000);
	        System.out.println("Captain will do batting practice");
	        Thread.sleep(3000);
	        System.out.println("Captain will do bowling practice");
	        Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        System.out.println("Captain will go back to hotel");
	}
}
class BattingCoach extends Thread{
	@Override
	public void run() {
		for(; ; ) {
			System.out.println("bac is there in the ground");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class BowlingCoach extends Thread{
	@Override
	public void run() {
		for(; ;) {
			System.out.println("boc is there in the ground");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonThraed {

	public static void main(String[] args) {
		
		Captain c = new Captain();
		
		c.setName("Cap");
		
		c.start();
		
		
		
	}

}
