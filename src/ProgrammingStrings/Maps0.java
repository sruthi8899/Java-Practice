package ProgrammingStrings;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Maps0 {

	public static void main(String[] args) {
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("India", 9000);
//		map.put("China", 8000);
//		map.put("Japan", 1000);
//		map.put("Korea", 4000);
//		System.out.println(map.getOrDefault("Taiwan", 7000));
		
//		Set<String> keys = map.keySet();
//		
//		for(String key: keys) {
//			System.out.println(key+" "+map.get(key));
//		}
		
//		 Set<Entry<String, Integer>> entries = map.entrySet();
//		for(Entry<String, Integer> entry: entries) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
	
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
//		
//	int n = scan.nextInt();
//	int[] ar = new int[n];
//	for(int i=0; i<ar.length; i++) {
//		ar[i] = scan.nextInt();
//	}
	
	
	

	
//	countCharacter(s);
	
//	countNumbers(ar);
	
//	countStrings(s);
	
	countStrings1(s);
	
	}
	
//-----------------------------------------------------------------------------------------------
	
     public static void countCharacter(String s){
    	 LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    	 for(int i=0; i<s.length(); i++) {
    		 char ch = s.charAt(i);
    		 if(map.containsKey(ch)) {
    			 int c = map.get(ch);
    			 map.put(ch, c+1);
    		 }
    		 else {
    			 map.put(ch, 1);
    		 }
    	 }
//    	 System.out.println(map);
    	 Set<Entry<Character, Integer>> entries = map.entrySet();
    	 for(Entry<Character, Integer> e: entries) {
    		 System.out.print(e.getKey()+""+e.getValue());
    	 }
    	 System.out.println(" "+s.length());
     }
 
//-------------------------------------------------------------------------------------
     
     public static void countNumbers(int[] ar) {
    	 HashMap<Integer, Integer> tmap = new HashMap<Integer, Integer>();
    	 for(int i=0; i<ar.length; i++) {
    		 if(tmap.containsKey(ar[i])) {
    			 int c = tmap.get(ar[i]);
    			 tmap.put(ar[i], c+1);
    		 }
    		 else {
    			 tmap.put(ar[i], 1);
    		 }
    	 }
    	 Collection<Integer> values = tmap.values();
    	 
    	 int count = 0;
    	 for(int value: values) {
    		 count = count + value/2;
    	 }
    	 System.out.println(count);
     }
 
//----------------------------------------------------------------------------------------
     //1.one way to count words or strings
     public static void countStrings(String s) {
    	 String[] ar = s.split(" ");
    	 LinkedHashMap<String, Integer> smap = new LinkedHashMap<String, Integer>();
    	 for(int i=0; i<ar.length; i++) {
    		 if(smap.containsKey(ar[i])) {
    			 int c = smap.get(ar[i]);
    			 smap.put(ar[i], c+1);
    		 }
    		 else {
    			 smap.put(ar[i], 1);
    		 }
    	 }
    	 
		Set<Entry<String, Integer>> entries = smap.entrySet();
		for(Entry<String, Integer>e: entries) {
			if(e.getValue() > 3) {
				System.out.println(e.getKey());
			}
		}
		
		
		Set<Entry<String, Integer>> entries1 = smap.entrySet();
		int max = 0;
		String maxk = "";
		for(Entry<String, Integer>e: entries1) {
			if(e.getValue() >= max) {
				max = e.getValue();
				maxk = e.getKey();
			}
		}
		System.out.println(maxk +" "+ max);
     }
     
//------------------------------------------------------------------------------------------------
     //2.another way to count strings or words 
     public static void countStrings1(String s) {
    	 String[] ar = s.split(" ");
    	 LinkedHashMap<String, Integer> smap = new LinkedHashMap<String, Integer>();
    	 for(int i=0; i<ar.length; i++) {
    		 if(smap.containsKey(ar[i])) {
    		
    			 smap.put(ar[i], smap.getOrDefault(ar[i], 0)+1);
    		 }
    		 else {
    			 smap.put(ar[i], 1);
    		 }
    	 }
//    	 System.out.println(smap);
    	 Set<Entry<String, Integer>> entries = smap.entrySet();
    	 for(Entry<String, Integer> e:entries) {
    		if(e.getValue() > 3) {
    			System.out.println(e.getKey());
    		}
    	 }
     }
     
}


