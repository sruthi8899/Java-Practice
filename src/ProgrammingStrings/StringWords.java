package ProgrammingStrings;

import java.util.Arrays;
import java.util.Scanner;

public class StringWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		
//		String[] res = reverseOfArrayWords(s);
//		String[] res = splitString(s);
		
		////splitString and  count words
//		for(int i=0; i<res.length; i++) {
//			System.out.println(res[i]);
//		}
		////India is my country
//		for(int i=0; i<res.length; i++) {//output:India is my country
//			System.out.print(res[i]+" ");
//		}
//		System.out.println();
//		
//		for(int i=0; i<res.length; i++) { //output: aidnI si ym yrtnuoc
//			System.out.print(reverse(res[i]+" "));
//		}
//		System.out.println();
//		
//		for(int i=res.length-1; i>=0; i--) {//output: country my is India 
//			System.out.print(res[i]+" ");
//		}
//		System.out.println();
//		
//		for(int i=res.length-1; i>=0; i--) {//output:yrtnuoc ym si aidnI 
//			System.out.print(reverse(res[i]+" "));
//		}
//        System.out.println();
//		
//		for(int i=1; i<res.length; i=i+2) {//output: isIndia countrymy 
//			System.out.print(res[i] + res[i-1]+" ");
//		}
//		System.out.println();
//		
//		for(int i=1; i<res.length; i=i+2) {//output: isaidnI countryym 
//			System.out.print(res[i] + reverse(res[i-1])+" ");
//		}
//        System.out.println();		
//		for(int i=0; i<res.length; i++) {//output: India5 is2 my2 country7
//			System.out.print(res[i] + res[i].length()+" ");
//		}
//		System.out.println();	
//		int sum = 0;
//		for(int i=0; i<res.length; i++) {//output: India is my country 16
//			System.out.print(res[i] + " ");
//			sum = sum + res[i].length();
//		}
//		System.out.println(sum);
//		for(int i=0,j=res.length-1; i<j; i++, j--) {//output: Indiacountry ismy 
//			System.out.print(res[i]+res[j]+" ");
//		}

////mississippi
		String res = removeDuplicates(s);
		System.out.println(res);
		
		
      
	}

	public static String[] splitString(String s) {
		int count = countWords(s);
		String[] ar = new String[count];
		
		String t = "";
		int j = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != ' ') {
				t = t+s.charAt(i);
			}
			else if(t.length()>0){
				ar[j] = t;
				j++;
				t = "";
			}
		}
		ar[j] = t;
		return ar;
		
	}
	
	public static int countWords(String s) {
		int count =0;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		return s.charAt(0) == ' '? count : count+1;
	}

////////////////////////////////////////////////////////////////////////////////// 

public static String[] reverseOfArrayWords(String s) { 
	int count = countWords1(s);
	String[] ar = new String[count];
	
	String t = "";
	int j = 0;
	
	
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i) != ' ') {
			t = t+s.charAt(i);
		}
		else if(t.length()>0){
			ar[j] = t;
			j++;
			t = "";
		}
	}
	ar[j] = t;
	return ar;
	
}



public static String reverse(String s) {
	String t = "";
	for(int i=s.length()-1; i>=0; i--) {
		t = t+ s.charAt(i);
	}
	return t;
}

public static int countWords1(String s) {
	int count =0;
	for(int i=0; i<s.length()-1; i++) {
		if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
			count++;
		}
	}
	return s.charAt(0) == ' '? count : count+1;
 }


///
/// @return ////////////////////////////////////////////////////////////////
public static String removeDuplicates(String s) {
	String t ="";
	for(int i=0; i<s.length(); i++) {     //misp
		char c = s.charAt(i);
		if(t.indexOf(c) == -1) {
			t = t+c;
		}
	}
	for(int i=s.length()-1; i>= 0; i--) {   //ipsm
		char c = s.charAt(i);
		if(t.indexOf(c) == -1) {
			t = t+c;
		}
	}
	for(int i=0; i<s.length(); i++) {   //psim
		char c = s.charAt(i);
		if(t.indexOf(c) == -1) {
			t = c+t;
		}
	}
	return t;
}
//----------------------------------------------------------------------------------	
//	for(int i=0; i<s.length(); i++) {
//		char c = s.charAt(i);
//		if(t.indexOf(c) == -1) {
//			t = t+c;
//		}
//	}
//	String t1 ="";  //psim
//	for(int i = t.length()-1; i>=0; i--) {
//		t1 = t1+t.charAt(i);
//	}
//	 char[] chars = t1.toCharArray();  //imps
//     Arrays.sort(chars);
//     String result = new String(chars);
//
//    return result;
//	}
//-----------------------------------------------------------------------------------	
//	for(int i=0; i<s.length(); i++) {
//		char c = s.charAt(i);
//		if(t.indexOf(c) == -1) {
//			t = t+c;
//		}
//	}
	
//	for(int i=0; i<t.length(); i++) {
//		char c = t.charAt(i);
//		int count = 0;
//		for(int j=0; j<s.length(); j++) {
//			if(s.charAt(j) == c) {
//				count++;
//			}
//		}
//		return c+count+" ";
//	}
//	return t;
//}
}


