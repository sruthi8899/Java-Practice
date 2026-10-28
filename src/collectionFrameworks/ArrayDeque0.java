package collectionFrameworks;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDeque0 {

	public static void main(String[] args) {
		
//		ArrayDeque ad = new ArrayDeque();
//		ad.add(12);
//		ad.add(12); 
//		ad.add('A');
//		ad.add(2.5f);
//		ad.add(Null);
		
//		System.out.println(ad);
		
////Accesing elements

////1.for loop ------------not work, because there is no indexing in arrayDeque (it not implement the List)
//		ArrayDeque ad = new ArrayDeque();
//		ad.add(1);
//		ad.add(2); 
//		ad.add(3);
//		ad.add(4);
//		for(int i=0; i<5; i++) {
//			System.out.println(ad.get(i));  //list is not implement so, list methods are work.
//		}

////for each loop
//		ArrayDeque ad = new ArrayDeque();
//		ad.add(1);
//		ad.add(2); 
//		ad.add(3);
//		ad.add(4);      
//		for(Object a:ad) {
//			System.out.println(a);
//		}
		
////Iterator
//		ArrayDeque ad = new ArrayDeque();
//		ad.add(1);
//		ad.add(2); 
//		ad.add(3);
//		ad.add(4);
//		Iterator cursor = ad.iterator();
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
		
////ListIterator ----------not work(backwards), ListIterator doesn't exit in in ArrayDeque
//		ArrayDeque ad = new ArrayDeque();
//		ad.add(1);
//		ad.add(2); 
//		ad.add(3);
//		ad.add(4);
//		ListIterator cursor = ad.listIterator();
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
//		while(cursor.hasPrevoius()) {
//			System.out.println(cursor.previous());
//		}
		
////instead descendingIterator will work for the backward arrayDeque
//		ArrayDeque ad = new ArrayDeque();
//		ad.add(1);
//		ad.add(2); 
//		ad.add(3);
//		ad.add(4);
//		Iterator cursor = ad.descendingIterator();
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
////Deque
//		ArrayDeque ad = new ArrayDeque();
//		ad.addFirst(1);
//		ad.add(2); 
//		ad.add(3);
//		ad.addLast(4);
//		System.out.println(ad);
//		System.out.println(ad.getFirst());
//		System.out.println(ad.getLast());
//		System.out.println(ad.removeFirst());
//		System.out.println(ad.removeLast());
//		ad.offerFirst(5);
//		ad.offerLast(6);
//		System.out.println(ad);
		
////stack
//		ArrayDeque ad = new ArrayDeque();
//		ad.push(1);
//		ad.push(2); 
//		ad.push(3);
//		ad.push(4);
//		System.out.println(ad.pop());

////queue
		ArrayDeque ad = new ArrayDeque();
		ad.add(1);
		ad.add(2); 
		ad.add(3);
		ad.add(4);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		
	}

}
