package collectionFrameworks;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		////methods
		
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(100));
		System.out.println(ts.tailSet(100));
		System.out.println(ts.subSet(50, 150));
		System.out.println(ts.ceiling(48));
		System.out.println(ts.floor(48));
		System.out.println(ts.higher(50));
		System.out.println(ts.lower(50));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		
		
		

	}

}
