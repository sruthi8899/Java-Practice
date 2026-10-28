
public class String10 {

	public static void main(String[] args) {
		String s1 = "REN";
		String s2 = "SRUTHI";
		
		int res = s1.compareTo(s2);
		System.out.println(res);
		
		if(res == 0) {
			System.out.println("String are equals");
		}
		else if(res > 0) {
			System.out.println("s1 is greater than s2");
		}
		else {
			System.out.println("s1 is less than s2");
		}
		
		
		String s3 = "SRUTHI";
		String s4 = "REN";
		
		int res1 = s3.compareTo(s4);
		System.out.println(res1);
		
		if(res1 == 0) {
			System.out.println("String are equals");
		}
		else if(res1 > 0) {
			System.out.println("s3 is greater than s4");
		}
		else {
			System.out.println("s3 is less than s4");
		}
		
		
		
		String s5 = "REN";
		String s6 = "ren";
		
		int res2 = s5.compareToIgnoreCase(s6);
		System.out.println(res2);
		
		if(res2 == 0) {
			System.out.println("String are equals");
		}
		else {
			System.out.println("String are not equals");
		}
	}

}
