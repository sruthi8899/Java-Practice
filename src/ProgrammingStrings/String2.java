package ProgrammingStrings;

import java.util.Scanner;

public class String2 {
	private static char ch;

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String s1 = scan.nextLine();
    
    String res = checkVowels(s1);
    System.out.println(res);
	}
/**
 * remove the starting and ending spaces
 * @param s1
 * @return
 */
	public static String trim(String s1) {
		int si = 0;
		int ei = 0;
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != ' ') {
				si = i;
				break ;
			}
		}
		
		
		for(int i=s1.length()-1; i>=0; i--) {
			if(s1.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		
		String t ="";
		for(int i=si; i<ei; i++) {
			t = t+s1.charAt(i);
		}
		return t;
		
	}
	
/**
 * remove all spaces only one space between the words
 */
	
	public static String trimAll(String s1) {
		int si = 0;
		int ei = 0;
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		for(int i=s1.length()-1; i>=0; i--) {
			if(s1.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		String t = "";
		for(int i=si; i<=ei; i++) {
			if(s1.charAt(i) != ' ' || (s1.charAt(i) == ' ' && s1.charAt(i+1) != ' ')) {
				t = t + s1.charAt(i);
			}
		}
		return t;
	}
/**
 * print * before a in String s(banana)
 * b*an*an*a
 */
	
	public static String printstarBeforeA(String s1) {
		String t = "";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == 'a') {
				t = t + '*' + s1.charAt(i);
//				t = t + "*";
				
			}
			else {
				t = t + s1.charAt(i);
			}
		}
		return t;
	}
	
/**
 * check and print the only consonants in String 
 * and replace with * the vowels
 * @param s1
 * @return
 */
	public static String checkConsonats(String s1) {
		String t ="";
		for(int i =0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' ) {
				t = t + s1.charAt(i);
			}
			else {
				t = t+"*";
			}
		}
		return t;
	}
	
/**
 * check and print the only vowels in the String 
 * and replace with * the consonants
 */
	
	public static String checkVowels(String s1) {
		String t = "";
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch == 'a' || ch == 'e' || ch =='i'  || ch == 'o' || ch == 'u') {
				t = t + s1.charAt(i);
			}
			else {
				t = t+ "*";
			}
		}
		return t;
	}
}
