package collectionFrameworks;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
////stack (push, pop) LIFO, FILO
//		LinkedList ll = new LinkedList();
//		ll.push(10);
//		ll.push(20);
//		ll.push(30);
//		
//		System.out.println(ll.poll());
//		System.out.println(ll);
//	
//		System.out.println(ll.poll());
//		System.out.println(ll);
//		
//		System.out.println(ll.poll());
//		System.out.println(ll);
		
////Queue (addFirst, getFirst) FIFO, LILO
//		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		System.out.println(ll.getFirst());
		
////de-que (addFirst, getFirst, addLast, getLast) double ended que
//		LinkedList ll = new LinkedList();
//		ll.addFirst(100);
//		ll.add(200);
//		ll.addFirst(300);
//		ll.addLast(400);
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll);
///de-que(offerFirst, offerLast) --------adding elements 
//		LinkedList ll = new LinkedList();
//		ll.offer(10);
//		ll.offer(20);
//		System.out.println(ll);
///(peekFirst, peekLast, Poll) ---------retrieving elements, removing elements(poll)
//		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		System.out.println(ll.poll());
//		System.out.println(ll);
//		System.out.println(ll.peekFirst());
//		System.out.println(ll.peekLast());
		
		
////ArrayDeque
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		System.out.println(ad);
		

	}

}
