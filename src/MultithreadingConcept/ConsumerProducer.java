package MultithreadingConcept;

class Queue{
	private int data;
	boolean dataIsPresent = false;
	
	synchronized public void setData(int data) {
//		this.data = data;
//		System.out.println("Producer produced the data "+data);
		
		if(dataIsPresent == false) {
			this.data = data;
			System.out.println("Producer produced the data "+data);
			dataIsPresent = true;
			notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	synchronized public void getData() {
//		System.out.println("Consumer consumed the data "+data);
		
		if(dataIsPresent == true) {
			System.out.println("Consumer consumed the data "+data);
			dataIsPresent = false;
			notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Producer extends Thread{
	Queue q;
	@Override
	public void run() {
		int i = 1;
		for(; ;) {
			q.setData(i++);
		}
	}
	
	public Producer(Queue q) {
		this.q = q;
	}
}

class Consumer extends Thread{
	Queue q;
	@Override
	public void run() {
		for( ; ;) {
			q.getData();
		}
	}
	
	public Consumer(Queue q) {
		this.q = q;
	}
}


public class ConsumerProducer {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.setName("Producer");
		c.setName("Consumer");
		p.start();
		c.start();
		

	}

}
