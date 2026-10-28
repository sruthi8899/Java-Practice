package ProgrammingStrings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Set2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int n = scan.nextInt();
//		int[] ar = new int[n];
//		for(int i=0; i<ar.length; i++) {
//			ar[i] = scan.nextInt();
//		}
		
		String s = scan.nextLine();
		
//		removeDuplicatesURl(s);
		removeDuplicatesWords(s);
			
	}
	
	public static void removeDuplicates(int[] ar) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		for(int i=0; i<ar.length; i++) {
			set.add(ar[i]);
		}
//		System.out.println(set);
		
		for(int x:set) {
			System.out.print(x+" ");
		}
	}
	
	public static void removeDuplicatesURl(String s) {
		String[] ar = s.split(",");
		
		TreeSet<String> set = new TreeSet<String>();
		
////output:
/// www.fb.com
///www.google.com
///www.insta.com
///www.tap.com
//		for(String url: ar) {
//			set.add(url);
//		}
//		for(String url: set) {
//			System.out.println(url);
//		}

////output:
///fb
///google
///insta
///tap
		for(int i=0; i<ar.length; i++) {
			String[] urlA = ar[i].split("\\.");
			set.add(urlA[1]);
		}
		for(String url: set) {
			System.out.println(url);
		}
			
	}
///remove duplicates in given string paragraph
	public static void removeDuplicatesWords(String s) {
		String[] ar= s.split(" ");
		
		LinkedHashSet<String>  set = new LinkedHashSet<String>();
		
		for(String x: ar) {
			set.add(x);
		}
		
		System.out.println(String.join(" ", set));
	}
	
	
}
