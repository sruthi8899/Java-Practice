package ProgrammingStrings;

import java.util.Scanner;

public class String3 {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
//		char k = scan.next().charAt(0);
		String s2 = scan.nextLine();

		
		String res = subSequenceOfTwoStrings(s1, s2);
		System.out.println(res);
		
	}

	/**
	 * Index of the k
	 * @param s
	 * @param k
	 * @return
	 */
	public static int  indexOfK(String s, char k) {
	
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) == k) {
				return i;
			}
		}
		return -1;
	}
	
/**
 * last index of k
 * @param s
 * @param k
 * @return
 */
	
	public static int lastIndexOfK(String s, char k) {
		for(int i=s.length()-1; i>=0; i--) {
			
			if(s.charAt(i) == k) {
				return i;
			}
		}
		return -1;
	}

/**
 * checking the Subsequence of the two Strings
 * @param s1
 * @param s2
 * @return
 */
	public static String subSequenceOfTwoStrings(String s1, String s2) {
		int i = 0;
		int j = 0;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		return j == s2.length() ? "yes":"no";
	}

}
