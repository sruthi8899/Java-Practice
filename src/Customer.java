//class Customer1{
//	 private int cId;
//	 private String cName;
//	 private long cPhone;
//	 
//	 public void setData(int x,String y,long z) {
//		 cId = x;
//		 cName = y;
//		 cPhone = z;
//	 }
//	 
//	 public int getcId() {
//		 return cId;
//	 }
//	 
//	 public String getcName() {
//		 return cName;
//	 }
//	 
//	 public long getcPhone() {
//		 return cPhone;
//	 }
//}
//
//public class Customer {
//
//	public static void main(String[] args) {
//		
//		Customer1 c = new Customer1();
//		c.setData(1, "ren", 99881441428l);
//		
//		System.out.println(c.getcId());  // i
//		System.out.println(c.getcName());  // ren
//		System.out.println(c.getcPhone()); //9988141428
//	}
//
//}

/**
the above is program is not convention, make it convention
**/


//class Customer1{
//	 private int cId;
//	 private String cName;
//	 private long cPhone;
//	 
//	 public void setData(int cId,String cName,long cPhone) {
//		 cId = cId;
//		 cName = cName;
//		 cPhone = cPhone;
//	 }
//	 
//	 public int getcId() {
//		 return cId;
//	 }
//	 
//	 public String getcName() {
//		 return cName;
//	 }
//	 
//	 public long getcPhone() {
//		 return cPhone;
//	 }
//}
//
//public class Customer {
//
//	public static void main(String[] args) {
//		
//		Customer1 c = new Customer1();
//		c.setData(1, "ren", 99881441428l);
//		
//		System.out.println(c.getcId());  // 0
//		System.out.println(c.getcName()); // null
//		System.out.println(c.getcPhone()); // 0
//	}
//
//}

/**
the above code (setData ) have shadowing problem
 to resolve shadowing problem we use (this. Keyword);
**/

//class Customer1{
//	 private int cId;
//	 private String cName;
//	 private long cPhone;
//	 
//	 public void setData(int cId,String cName,long cPhone) {
//		 this.cId = cId;
//		 this.cName = cName;
//		 this.cPhone = cPhone;
//	 }
//	 
//	 public int getcId() {
//		 return cId;
//	 }
//	 
//	 public String getcName() {
//		 return cName;
//	 }
//	 
//	 public long getcPhone() {
//		 return cPhone;
//	 }
//}
//
//public class Customer {
//
//	public static void main(String[] args) {
//		
//		Customer1 c = new Customer1();
//		c.setData(1, "ren", 99881441428l);
//		
//		System.out.println(c.getcId());  // 1
//		System.out.println(c.getcName());  //ren
//		System.out.println(c.getcPhone()); //9988141428
//	}
//
//}

/**
--the above code is not sufficient,we need Built-In setter to the code is called constructor.
--so, use the constructor(as customer to setData)
--constructor is a specialized method or specialized setter created by java
--constructor never have return type.
 **/

//class Customer1{
//	 private int cId;
//	 private String cName;
//	 private long cPhone;
//	 
//	 public Customer1(int cId,String cName,long cPhone) {
//		 this.cId = cId;
//		 this.cName = cName;
//		 this.cPhone = cPhone;
//	 }
//	 
//	 public int getcId() {
//		 return cId;
//	 }
//	 
//	 public String getcName() {
//		 return cName;
//	 }
//	 
//	 public long getcPhone() {
//		 return cPhone;
//	 }
//}
//
//public class Customer {
//
//	public static void main(String[] args) {
//		
//		Customer1 c = new Customer1(1, "ren", 99881441428l);
//		
//		
//		System.out.println(c.getcId());  // 1
//		System.out.println(c.getcName());  //ren
//		System.out.println(c.getcPhone()); //9988141428
//	}
//
//}

/**
Default constructor
**/

//class Customer1{
//	 private int cId;
//	 private String cName;
//	 private long cPhone;
//	  
//	 
//	 public int getcId() {
//		 return cId;
//	 }
//	 
//	 public String getcName() {
//		 return cName;
//	 }
//	 
//	 public long getcPhone() {
//		 return cPhone;
//	 }
//}
//
//public class Customer {
//
//	public static void main(String[] args) {
//		
//		Customer1 c = new Customer1(1, "ren", 99881441428l);
//		Customer1 c = new Customer1();
//		
//		
//		System.out.println(c.getcId());  // 1
//		System.out.println(c.getcName());  //ren
//		System.out.println(c.getcPhone()); //9988141428
//	}
//
//}

/**
 0 parameterized constructor
**/

class Customer1{
	 private int cId;
	 private String cName;
	 private long cPhone;
	  
	 public Customer1() {
		 cId  = 1;
		 cName = "ren";
		 cPhone = 9988141428l;
	 }
	 public Customer1(int cId, String cName, long cPhone) {
		 this.cId = cId;
		 this.cName = cName;
		 this.cPhone = cPhone;
	 }
	 
	 public int getcId() {
		 return cId;
	 }
	 
	 public String getcName() {
		 return cName;
	 }
	 
	 public long getcPhone() {
		 return cPhone;
	 }
}

public class Customer {

	public static void main(String[] args) {
		
		Customer1 c1 = new Customer1();
		
		System.out.println(c1.getcId());  // 1
		System.out.println(c1.getcName());  //ren
		System.out.println(c1.getcPhone()); //9988141428
		
		Customer1 c2 = new Customer1(2,"sru", 8899412814l);
		
		System.out.println(c2.getcId());  // 2
		System.out.println(c2.getcName());  //sru
		System.out.println(c2.getcPhone()); //8899412814
		
		

	}

}




