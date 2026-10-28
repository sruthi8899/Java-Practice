package ProgrammingStrings;

import java.util.Scanner;

public class String0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
////for string output
//		String res = wordsInTheString(s);
//		System.out.print(res);
		
////for integer output
		int res = wordsInTheString(s);
		System.out.print(res);
		
		
//		allInTheString(s);
		
		
////palindrome
//		if(s.equals(res)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Plindrome");
//		}
		
		
		
//		for(int i=0; i<s.length(); i++) {
//			System.out.println(s.charAt(i));
//		}
		
	}
	
////reverse the String
	
	public static String reverseString(String s){
		String t = "";
		for(int i=s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}
	
////Palindrome 

	public static String palindrome(String s) {
		String t = "";
		for(int i=s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}
	
////anotherWay to check palindrome
    
	public static String palindromeOrNot(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return "not palindrome";
			}
		}
		return "Plaindrome";
	}

////Spaces in the String
	public static int  spacesInTheString(String s) {
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

////Words in the String
	public static int  wordsInTheString(String s) {
		int count = 0;
		
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		return count+1;
	}
	
////0th space count in words in the String
   public static int wordsInTheString0(String s) {
	   int count = 0 ;
	   for(int i=0; i<s.length()-1; i++) {
		   if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
			   count++;
		   }
	   }
	   return s.charAt(0)==' '? count:count+1;
   }
   
 ////vowels in the String
 /// uppercase vowels
    
   public static int vowelsInTheString(String s) {
	   int count = 0;
	   for(int i=0; i<s.length(); i++) {
		   int ch = s.charAt(i);
		   if(ch =='a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'
				   ||ch =='A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {
			   count++;
		   }
	   }
	   return count;
   }
   
////vowels and consonants in the String
/// uppercase and lowercase of the String
   
  public static int consonantsInTheString(String s) {
	   int vc = 0;
	   int cc = 0;
	   for(int i=0; i<s.length(); i++) {
		   int ch = s.charAt(i);
		   if((ch>='A' && ch<='z')||(ch>='a' && ch<='z')) {   //uppercase and lowercase
			   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||   
					   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') { // vowels are consonants
				   vc++;
			   }
			   else {
				   cc++;
				   }
			   }
		   }
	   return vc; //2
//	   return cc; //3
//	   return vc + cc; //5
//	   return vc - cc;  //-1
	   }
  
 ////vowels,consonants , numeric and special character
  public static void allInTheString(String s) {
	   int vc = 0;
	   int cc = 0;
	   int nc = 0;
	   int spc = 0;
	   for(int i=0; i<s.length(); i++) {
		   int ch = s.charAt(i);
		   if((ch>='A' && ch<='z')||(ch>='a' && ch<='z')) {   //uppercase and lowercase
			   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
					   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') { //not vowels
				   vc++;
				   }
			   else  {
				   cc++;
			      }
	           }
		   else if(ch>='0' && ch<='9') {
			   nc++;
		   }
		   else {
			   spc++;
		   }
	    }
	   System.out.println("vc: "+vc);
	   System.out.println("cc: "+cc);
	   System.out.println("nc: "+nc);
	   System.out.println("spc: "+spc);
	  
     }
}
  
