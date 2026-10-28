public class Car1 {
    
    String name;
    float cost;
    float mileage;
    
   
    public void start() {
        System.out.println("car is Starting.....");
    }
    
    public void accelerate() {
        System.out.println("car is accelerating.......");
    }
    
    public void stop() {
        System.out.println("car is stopping......");
    }

    
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        
        c1.name = "Maruthi";
        c1.cost = 18.02f;
        c1.mileage = 20.01f;
        
        System.out.println(c1.name);
        System.out.println(c1.cost);
        System.out.println(c1.mileage);
        
        c1.start();
        c1.accelerate();
        c1.stop();
        
        Car1 c2 = new Car1();
        
        c2.name="kia";
        c2.cost=11.11f;
        c1.mileage = 2.01f;
        

        System.out.println(c2.name);
        System.out.println(c2.cost);
        System.out.println(c2.mileage);
        
        c2.start();
        c2.accelerate();
        c2.stop();
    }
}