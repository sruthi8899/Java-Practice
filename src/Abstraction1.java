import java.util.Scanner;

abstract class Shape{  //abstract class
	float area;

	public Shape(){
		
	}
	abstract public void acceptInput();
	abstract public void calcArea();
	public void dispArea() {  //Inherited method - concrete method(having full body and method signature)
		System.out.println(area);
	}
	
}
class Square extends Shape{  //Inheritance
	private float side; // Encapsulation
	
	public Square() {
		super();
	}
	
	@Override  //Override method
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side of the square: ");
		side = scan.nextFloat();
	}
	@Override
	public void calcArea() {
		area = side * side;
	}
	
	
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	@Override
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		length = scan.nextFloat();
		System.out.println("Enter the breadth of the rectangle: ");
		breadth = scan.nextFloat();
	}
	@Override
	public void calcArea() {
		area = length * breadth;
	}
	
	
}
class Circle extends Shape{
	private float radius;
	
	@Override
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		radius = scan.nextFloat();
		
	}
	@Override
	public void calcArea() {
		area = 3.142f * radius * radius;
	}
	
	
}
class Geometery{  //Polymorphism
	public void calculation(Shape ref){
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Geometery g = new Geometery();
		
		g.calculation(s);
		g.calculation(r);
		g.calculation(c);
		
		
		

	}

}
