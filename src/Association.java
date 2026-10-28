/**
 * Aggregation and Composition
 */
class Charger{
	private String brand;
	private float voltage;
	
	public Charger() {
		
	}
	public Charger(String brand, float voltage) {
		this.brand = brand;
		this.voltage = voltage;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
}
class OS{
	private String name;
	private float size;
	
	public OS() {
		
	}
	public OS(String name, float size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; 
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
}
class Mobile{
	OS os = new OS("Andriod", 4.5f);  //Composition(tight bound)
	
	public void hasA(Charger ch){     // Aggregation(loose bound)
		System.out.println(ch.getBrand());
		System.out.println(ch.getVoltage());
	}
}
public class Association {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		Charger c=new Charger("Vivo", 45.5f);
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
	m.hasA(c);
		
		//m = null;
//		System.out.println(m.os.getName());
//		System.out.println(m.os.getSize());
		
//		System.out.println(c.getBrand());
//		System.out.println(c.getVoltage());
	}

}
