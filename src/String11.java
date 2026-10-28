
public class String11 {

	public static void main(String[] args) {
		
		// 1
		String s1 = "SRU";
		System.out.println(s1); // it storing in constant Pool with 1000 reference
	    s1.concat("REN");
	    System.out.println(s1); // it storing in Non-constant Pool with 2000 reference
	    
	    System.out.println(); // giving for space between models
	    
	    //2
	    String s2 = "SRU"; // it storing in constant Pool with 1000 reference
	    System.out.println(s2);
	    String s3 = s2.concat("REN"); // it storing in Non-constant Pool with 2000 reference
	    System.out.println(s3);
	    
	    System.out.println(); // giving for space between models
	    
	    //3
	    String s4 = "SRU"; //it storing in constant Pool, with 1000 reference,but s4 not refer SRU
	    s4 = s4.concat("REN"); // it storing in Non-constant Pool, with 2000 reference,Here s4 refer SRUREN
	    System.out.println(s4);
	}

}
