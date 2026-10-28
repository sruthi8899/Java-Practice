package ProgrammingStrings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Sets0 {
	
	private static Object set;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		removeDuplicatesSort(s);
	
		
//		HashSet<Integer> set = new HashSet<Integer>();
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
//		set.add(50);
//		for(int x : set){
//			System.out.println(x);
//		}
		
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
//		set.add(50);
//		for(int x : set) {
//			System.out.println(x);
//		}
		
//		TreeSet<Integer> set = new TreeSet<Integer>();
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
//		set.add(50);
//		for(int x : set) {
//			System.out.println(x);
//		}
		
	}
		
////input: mississippi and output: misp

   public static void removeDuplicates(String s) {
			LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			for(int i=0; i<s.length(); i++) {
				set.add(s.charAt(i));
			}
			String t = "";
			for(char x : set) {
				t = t+x;
			}
			System.out.println(t);
		}
	
	public static void removeDuplicatesSort(String s) {
		TreeSet<Character> set = new TreeSet<Character>();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		String t = "";
		for(char x : set) {
//			t = t+x;
			t = x+t;
		}
		System.out.println(t);
	}
			

}
