
public class BuildInMethods {

	public static void main(String[] args) {
		
		String s = "SruthiRenshihao";
		
		// Build-In Methods in Strings
		
		System.out.println(s);
		
		System.out.println(s.length());  //Length()
		
		System.out.println(s.charAt(7)); //ChatAt()
		
		System.out.println(s.startsWith("Sru")); // StartIndex()
		
		System.out.println(s.endsWith("hao")); //EndsIndex()
		
		System.out.println(s.indexOf('r')); //IndexOf()
		
		System.out.println(s.lastIndexOf('s')); // LastIndexOf()
		
		System.out.println(s.toUpperCase()); //ToUpperCase()
		
		System.out.println(s.toLowerCase()); //ToLowerCase()
		
		System.out.println(s.trim()); //Trim()
		
		System.out.println(s.substring(6,10)); //SubString()
		
		System.out.println(s.replace('R','S'));
		
		System.out.println(s.replaceAll("Sru", "Ren"));
		

	}

}
