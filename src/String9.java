
public class String9 {

	public static void main(String[] args) {
		String s1 = "SHIHAO";
		String s2 = "SHIHAO";
		
		int res = s1.compareTo(s2);
		System.out.println(res);
		
		if(res == 0) {
			System.out.println("Strings are equal");
		}
		else if(res > 0) {
			System.out.println("postive value");
		}
		else {
			System.out.println("Negative value");
		}

	}

}
