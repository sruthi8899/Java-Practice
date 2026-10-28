class Heart{
	private float weight;
	private float bpm;
	
	public Heart() {
		
	}

	public Heart(float weight, float bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getBpm() {
		return bpm;
	}

	public void setBpm(float bpm) {
		this.bpm = bpm;
	}
	
}
class Brain{
	private float weight;
	private String color;
	
    public Brain() {
		
	}

	public Brain(float weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
}
class  Bike{
	private String brand;
	private float mileage;
	
    public Bike() {
		
	}

	public Bike(String brand, float mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
    
}
class Book{
	private String name;
	private String author;
	
	public Book() {
		
	}

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
class Student{
	Heart h = new Heart(20.0f, 72.0f);//composition
	Brain b = new Brain(35.4f, "red");
	
	public void hasA(Bike bi) { // aggregation
		System.out.println(bi.getBrand());
		System.out.println(bi.getMileage());
	}
	public void hasA(Book bo) {
		System.out.println(bo.getName());
		System.out.println(bo.getAuthor());
	}
}
public class Association1 {

	public static void main(String[] args) {
		Student s = new Student(); //
		Bike b = new Bike("ktm", 128.9f);
		
		Book bk = new Book("japanese", "sruthi");
		
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColor());
		
		s.hasA(b);
		s.hasA(bk);
		
		s = null;
		System.out.println(b.getBrand());
		System.out.println(b.getMileage());
		System.out.println(bk.getName());
		System.out.println(bk.getAuthor());

	}

}
