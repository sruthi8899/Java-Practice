package collectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
 

class  Restaurant{
	int id;
	String cuisineType;
	long phNo=998814280;
}

class Customer{
	int id;
	String name;
	String address;
}

public class Generics {

	public static void main(String[] args) {
		
		//restaurant
		Restaurant  meghanas = new Restaurant();
		Restaurant star = new Restaurant();
		Restaurant  ambur = new Restaurant();
		Restaurant  kfc = new Restaurant();
		Restaurant  mcD = new Restaurant();
		
		//Customer
		Customer mukesh = new Customer();
		Customer ramesh = new Customer();
		Customer sukesh = new Customer();
		Customer harish = new Customer();
		Customer abhishek = new Customer();
		
		//code flexibilty and using loose coupling (polymorphism)
		List<Restaurant> restaurant = new ArrayList<Restaurant>();
		restaurant.add(meghanas);
		restaurant.add(star);
		restaurant.add(ambur);
		restaurant.add(kfc);
		restaurant.add(mcD);
		
		List<Customer> Customer = new ArrayList<Customer>();
		Customer.add(mukesh);
		Customer.add(ramesh);
		Customer.add(sukesh);
		Customer.add(harish);
		Customer.add(abhishek);
		
			
		
		
		
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.add(150);
//		ts.add(200);
////	ts.add("TAP"); //exception will come ClassCastException , not store the heteregenous data
//		System.out.println(ts);
//		
//		Map<Integer, String> hm = new LinkedHashMap<Integer, String>();
//		hm.put(8, "Sruthi");
//		hm.put(9, "Renshihao");
//		System.out.println(hm);
		
		List al = new ArrayList();
		al.add(90);
		al.add(45);
		al.add(67);
		
//		System.out.println(Collections.min(al));
//		System.out.println(Collections.max(al));
//		System.out.println(Collections.frequency(al, 45));
//		System.out.println(Collections.replaceAll(al, 45, 450));
//		Collections.shuffle(al);
//		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
