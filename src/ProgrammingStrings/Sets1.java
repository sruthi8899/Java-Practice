package ProgrammingStrings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;


public class Sets1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add(150);
		hs.add(50);
		hs.add(25);
		
//		System.out.println(hs);
//		
//LinkedHashSet hs1 = new LinkedHashSet();
//		
//		hs1.add(100);
//		hs1.add(150);
//		hs1.add(50);
//		hs1.add(25);
//		
//		System.out.println(hs1);
		
//		for(int i=0; i<hs.size(); i++) {
//			System.out.println(hs.get(i));
//		}
//		
		for(Object x : hs ) {
			System.out.println(x);
		}
		
		Iterator cursor = hs.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
//		ListIterator cursor = hs.listIterator(hs.size());
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
//		
		
	}
	

}
