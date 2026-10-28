package collectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		
//		LinkedList ll = new LinkedList();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
//		
//		ArrayList al = new ArrayList(ll);
//		
//		System.out.println(al);
		
/**********both will work****************/
		
//		ArrayList al = new ArrayList();
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		
//		LinkedList ll = new LinkedList(al);
//		
//		System.out.println(ll);
		
/**Accesing Element****/
		
////1.for loop

//		LinkedList ll = new LinkedList();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);	
//		for(int i=0; i<ll.size(); i++) {
//			System.out.print(ll.get(i)+" ");
//		}
////2.for each loop

//		LinkedList ll = new LinkedList();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
//		for(Object a:ll) {
//			System.out.println(a);
//		}
		
////3.Iterator (only for forward)

//		LinkedList ll = new LinkedList();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
		
//		Iterator cursor = ll.iterator();
//		
//		while(cursor.hasNext()) {
//			
//			System.out.println(cursor.next());
//
//		}
       


///4.ListIterator (forward and backward) is brother if Iterator
//   ListIterator cursor = ll.listIterator();
//		
//		while(cursor.hasNext()) {
//			
//			System.out.println(cursor.next());
//
//		}
//		
//		while(cursor.hasPrevious()) {
//			
//			System.out.println(cursor.previous());
//			
//		}
		
//// best for insertion at any end , output: [1, 100, 2]

		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(1, 100);
		
		System.out.println(ll);
		
	}

} 
