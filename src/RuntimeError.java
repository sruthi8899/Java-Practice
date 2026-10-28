
public class RuntimeError {

	public static void main(String[] args) {
		try {
			int[] ar = new int[Integer.MAX_VALUE];
		}
		catch(Error e){
			System.out.println("Handled");
		}
		

	}

}
