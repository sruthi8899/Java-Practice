package ProgrammingStrings;

import java.util.Scanner;

public class Substrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
//		int size = scan.nextInt();
//		String s2 = scan.nextLine();

//		int  res = countRepeatingStrings(s, s2);
//		System.out.println(res);
		
		longestPalindromeString(s);
	}
/**
 * SubString of the two Strings
 * @param s
 * @param size
 */
	public static void subStringOfString(String s, int size) {
		String t = "";
		for(int i=0; i<=s.length()- size; i++) {
			t = "";
			for(int j=i; j<i+size; j++) {
				t = t+s.charAt(j);
			}
			System.out.println(t);
		}
		
	}
/**
 * two Strings and check the String (mississippi)(issi)
 * @param s
 * @param s2
 * @return
 */
	public static String checkString(String s, String s2) {
		int size = s2.length();
		String t = "";
		for(int i=0; i<=s.length()-size; i++) {
			t = "";
			for(int j=i; j<size+i; j++) {
				t = t+s.charAt(j);
			}
			if(t.equals(s2)) {
				return "yes";
			}
		}
		return "no";
	}
/**
 * print the no.of occurence of String s2 in String s1
 * @param s
 * @param s2
 * @return
 */
	public static int countRepeatingStrings(String s, String s2) {
		int size = s2.length();
		String t = "";
		int count = 0;
		
		for(int i=0; i<s.length()-size; i++) {
			t = "";
			for(int j =i; j<size+i; j++) {
				t = t+s.charAt(j);
			}
			if(t.equalsIgnoreCase(s2)) {
				count++;
			}
		}
		return count;
	}
	/**
	 * printing all Sub Strings of hello
	 * @param s
	 * @param size
	 */
	public static void printSubStrings(String s, int size) {
		String t = "";
		for(int i=0; i<=s.length()-size; i++) {
			t = "";
			for(int j =i; j<size+i; j++) {
				t = t+s.charAt(j);
			}
			System.out.println(t);
		}
	}
	public static void printAllSubString(String s) {
		for(int size=1; size<=s.length(); size++) {
			printSubStrings(s, size);
		}
	}
/**
 * longest palindrome SubString
 * @param s
 */
	public static void longestPalindromeString(String s) {
		for(int size=s.length(); size>=1; size--) {
			for(int i=0; i<=s.length()-size; i++) {
				String t = "";
				for(int j=i; j<size+i; j++) {
					t = t+s.charAt(j);
				}
				if(checkPalindrome(t)) {
					System.out.println(t);
					return;
				}
//				System.out.println(t);
			}
		}
	}
	public static boolean checkPalindrome(String s) {
		int i=0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
