package collectionFrameworks;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet0 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
//		ts.add(2004);
//		ts.add(2001);
//		ts.add(8);
//		ts.add(28);
//		ts.add(14);
//		ts.add(9);
//		ts.add("Sruthi");
//		ts.add("Renshihao");
//		ts.add(null); 
//		
//		System.out.println(ts);
		
////Accessing Element
/// for loop-------------it not work, it is requried indexes
//		ts.add("Sruthi");
//		ts.add("Renshihao");
//		for(int i=0; i<ts.size(); i++) {
//			System.out.println(ts.get(i));
//		}
		
////for each loop 
//		ts.add("Sruthi");
//		ts.add("Renshihao");
//		for(Object a:ts) {
//			System.out.println(a);
//		}
		
////Iterator
//		ts.add("Sruthi");
//		ts.add("Renshihao");
//		Iterator cursor=ts.iterator();
//		
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
/// ListIterator -------------not work
//		ts.add("Sruthi");
//		ts.add("Renshihao");
//		ListIterator cursor = ts.listiterator();
//		
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
//		while(cursor.hasPrevious()) {
//			System.out.println(cursor.previous());
//		}
////desending iterator
		ts.add("Sruthi");
		ts.add("Renshihao");
	Iterator cursor= ts.descendingIterator();
	
	while(cursor.hasNext()) {
		System.out.println(cursor.next());
	}
	}

}
