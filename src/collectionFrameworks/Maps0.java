package collectionFrameworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Maps0 {
	
/**
 * three classes
 * HashMap
 * LinkedHashMap
 * TreeMap
 * @param args
 */

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(8, "Sruthi");
		hm.put(9, "Renshihao");
		hm.put(11, "Supree");
		hm.put(7, "Harsha");
		hm.put(3, "Bannu");
		hm.put(2, "Nandhu");
		hm.put(6, "Akhila");
//		hm.put("sru", "ren");
//		hm.put(1.4f, "rensru");
//		hm.put(1.14f, "rensru");
//		hm.put(null, "rensru");
//		hm.put(1, null);
		
//		System.out.println(hm);
		
//		for(int i=0; i<hm.size(); i++) { //it work
//			System.out.println(hm.get(i));
//		}
//		for(Object x : hm ) {//It won't work
//			System.out.println(x);
//		}

////methods 
/// put
/// KeySet
/// entrySet
/// values
/// conatainsValues
/// containsValues
/// 

//		Set s = hm.entrySet();  //to get both key and values output
//		Iterator cursor = s.iterator();
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
		
//		Collection s = hm.values();  //to get only values output
//		Iterator cursor = s.iterator();
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
		
//		Collection s = hm.keySet();  //to get only keys output
//		Iterator cursor = s.iterator();
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
		
//		System.out.println(hm.containsValue("Renshihao"));
//		
//		System.out.println(hm.containsKey(8));
//		
//		System.out.println(hm.isEmpty());
//		
		
//		LinkedHashMap lhm = new LinkedHashMap();
//		lhm.put(8, "Sruthi");
//		lhm.put(9, "Renshihao");
//		lhm.put(11, "Supree");
//		lhm.put(7, "Harsha");
//		lhm.put(3, "Bannu");
//		lhm.put(2, "Nandhu");
//		lhm.put(6, "Akhila");
//		
//		System.out.println(lhm);
		
		TreeMap tm = new TreeMap();
		tm.put(8, "Sruthi");
		tm.put(9, "Renshihao");
		tm.put(11, "Supree");
		tm.put(7, "Harsha");
		tm.put(3, "Bannu");
		tm.put(2, "Nandhu");
		tm.put(6, "Akhila");
		
		System.out.println(tm);
		

	}

}
