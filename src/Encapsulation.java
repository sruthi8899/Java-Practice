class Bank {
	private  int bal;
	
	public void setData(int x) {
		if(x < 0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		else {
		bal = x;
		}
	}
	
	public int getData() {
		return bal;
	}
}

 class Encapsulation {

	public static void main(String[] args) {
		
		Bank ba = new Bank();
		ba.setData(-10000);// if(x < 0) invalid input
//		ba.setData(10000);
		
		int balance = ba.getData(); 
		System.out.println(balance); 

	}

}
