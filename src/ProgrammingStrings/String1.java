package ProgrammingStrings;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		

		 String res = swapCharacters(s);
		 System.out.println(res);
		
		
	}
	/**
	 * remove special charcter
	 * @param s
	 * @return
	 */
	public static String removeSpecialCharacters(String s) {
		String t = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')) {
				t = t+ch;
			}
		}
		return t;
	}

	/**
	 * arrang character upper, lower, numnweric character
	 * @param s
	 * @return
	 */
	public static String removeSpecialCharactersandArrange(String s) {
		String t = "";
		String uc = "";
		String lc = "";
		String nc = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				uc = uc+ch;
			}
			else if(ch>='a' && ch<='z') {
				lc = lc+ch;
			}
			else if(ch>='0' && ch<='9') {
				nc = nc+(int)ch;
			}
			t = uc+lc+nc;
		}
		return t;
	}
	
/**
 * convert UpperCase into LowerCase	
 * @param s
 * @return
 */
		public static String covertsintoLowercase(String s) {
		    String t = "";
		    for(int i=0; i<s.length(); i++) {
		    	char ch = s.charAt(i);
		    	if(ch>='A' && ch<='Z') {
		    		t= t+(char)(ch+32);//conert upper to lower
		    	}
		    	else {
		    		t = t+ch;//if not upper
		    	}
		    }
		   
		    return t;
		    
	}
		
/**
 * convert LowerCase to UpperCase
 */
		
		public static String convertintoUpperCase(String s) {
			String  t ="";
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				if(ch>='a' && ch<='z') {
					t = t+(char)(ch-32); //convert lower to upper
				}
				else {
					t = t+ch;//if not lower 
				}
			}
			return t;
		}
		
		
/*
 * swap (upper to lower) and (lower to upper)
 */
		
		public static String swapCharacters(String s) {
			String t = "";
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				if(ch>='A' && ch<='Z') {
					t = t+(char)(ch + 32);
				}
				else if(ch>='a' && ch<='z') {
					t = t+(char)(ch - 32);
				}
				else {
					t = t+ch;
				}
			}
			return t;
		}

}
