public class Dog {
    
    String name;
    String breed;
    float cost;
    
 public class Main {  
    public static void main(String[] args) {
        
        
        Dog d = new Dog();
        
       
        d.name = "Puppy";
        d.breed = "Labrador";
        d.cost = 400.0f; 
        
       
        System.out.println(d.name);
        System.out.println(d.breed);
        System.out.println(d.cost);
    }
 }
}