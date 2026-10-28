
public class String6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "MySql";
		String s3 = "Java" + "MySql";
		String s4 = "Java" + "MySql";
		
		if(s3 == s4)
		{
			System.out.println("Ref are equal");
		}
		else
		{
			System.out.println("Ref are not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
	}

}
