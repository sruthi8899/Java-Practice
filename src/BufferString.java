
public class BufferString {

	public static void main(String[] args) {
		
		//one type of giving values to StringBuffer class and with in object creation
				//default_capacity*2 + 2 formula(20 * 2 + 2 = 42)
				//in StringBuffer class capacity is 20,16 (default value) + 4 (java)

				StringBuffer st = new StringBuffer("Java");
				System.out.println(st.capacity());
				
				st.append(" JavaScript");
				System.out.println(st);
				
				st.append(" James Gosling");
				System.out.println(st);
				System.out.println(st.capacity());
				
				st.append("         ");
				System.out.println(st.capacity());
				
                //to reduce the spaces in StringBuffer object calss
				
				st.trimToSize();
				System.out.println(st.capacity());
				
				
				System.out.println();//giving space between two problems
				
				//another type giving values in StringBuffer class 
				//.append() ------ adding a string
				//default capacity 16
				//default_capacity*2 + 2 formula (16 * 2 + 2 = 34)
				
				StringBuffer st1 = new StringBuffer();
				System.out.println(st1.capacity());
				
				st1.append("Java");
				System.out.println(st1);
				
				st1.append(" JavaScript");
				System.out.println(st1);
				
				st1.append(" James Gosling");
				System.out.println(st1);
				System.out.println(st1.capacity());
				
				st1.append("         ");
				System.out.println(st1.capacity());
				
				//to reduce the spaces in StringBuffer object calss
				
				st1.trimToSize();
				System.out.println(st1.capacity());
				
				st1.delete(1,10);
				System.out.println(st1);

	}

}
