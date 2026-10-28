/**
 Constructor chaining
 **/

//class Customer2{
//	private int cId;
//	private String cName;
//	private long cPhone;
//	
//	public Customer2() {
//		cId = 1;
//		cName = "ren";
//		cPhone = 9988141428l;
//	}
//	public Customer2(int cId,String cName, long cPhone) {
//		this();
//	}
//	
//	public int getcId() {
//		return cId;
//	}
//	public String getcName() {
//		return cName;
//	}
//	public long getcPhone() {
//		return cPhone;
//	}
//	
//}
//
//public class Customer0 {
//
//	public static void main(String[] args) {
//		
//		Customer2 c = new Customer2(2, "sru", 8899412814l);
//		
//		System.out.println(c.getcId());
//		System.out.println(c.getcName());
//		System.out.println(c.getcPhone());
//		
//
//	}
//
//}

/**
 update the values giving in the constructor object
 **/

//class Customer2{
//	private int cId;
//	private String cName;
//	private long cPhone;
//	
//	public Customer2() {
//		cId = 1;
//		cName = "ren";
//		cPhone = 9988141428l;
//	}
//	public Customer2(int cId,String cName, long cPhone) {
//		this();
//		this.cId = cId;
//		this.cName = cName;
//		this.cPhone = cPhone;
//	}
//	
//	public int getcId() {
//		return cId;
//	}
//	public String getcName() {
//		return cName;
//	}
//	public long getcPhone() {
//		return cPhone;
//	}
//	
//}
//
//public class Customer0 {
//
//	public static void main(String[] args) {
//		
//		Customer2 c = new Customer2(2, "sru", 8899412814l);
//		
//		System.out.println(c.getcId());
//		System.out.println(c.getcName());
//		System.out.println(c.getcPhone());
//		
//
//	}
//
//}


/**
Constructor overloading
**/

class Customer2{
	private int cId;
	private String cName;
	private long cPhone;
	
	public Customer2() {
		cId = 1;
		cName = "ren";
		cPhone = 9988141428l;
	}
	public Customer2(String cName) {
		this();
		this.cName = cName; 
//		this.cName = cName;
//		this(); //java will throw a error this() will be on the first line 
	}
	public Customer2(int cId,String cName, long cPhone) {
		this(cName);// if we give this only java will give error (string is not defined),so we need to give constructor with only string name in ()
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

public class Customer0 {

	public static void main(String[] args) {
		
		Customer2 c = new Customer2(2, "sru", 8899412814l);
		
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcPhone());
		

	}

}

/**
 second example of Constructor overloading
 **/

//class Customer2{
//	private int cId;
//	private String cName;
//	private long cPhone;
//	
//	public Customer2() {
//		cId = 1;
//		cName = "ren";
//		cPhone = 9988141428l;
//	}
//	public Customer2(String cName) {
//		this();
//		this.cName = cName; 
//		this.cId = 20;// cId updated 20
//	}
//	public Customer2(int cId,String cName, long cPhone) {
//		this(cName);// if we give this only java will give error (string is not defined),so we need to give constructor with only string name in ()
//		this.cId = 10;//after cName update there is lines of code it will update cId as 10
//	}
//	
//	public int getcId() {
//		return cId;
//	}
//	public String getcName() {
//		return cName;
//	}
//	public long getcPhone() {
//		return cPhone;
//	}
//	
//}
//
//public class Customer0 {
//
//	public static void main(String[] args) {
//		
//		Customer2 c = new Customer2(2, "sru", 8899412814l);
//		
//		System.out.println(c.getcId());
//		System.out.println(c.getcName());
//		System.out.println(c.getcPhone());
//		
//
//	}
//
//}

