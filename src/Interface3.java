interface OpertingSystem{
	void boot();
	void shutdown();
//JDK: 1.8 //static method ,without creating object to method in interface
	//can't inherited and can't override
	static void checkCompatabilityOs() {  
		redundantCode();
	}
	
	
	
	default void installApp() { // concrete method (default method) it only allow in interface  and inherited method
		//it a inherited method it participate in interface
		//default method can be overridden 
		redundantCode();
		System.out.println("Install app....");
	}
	default void updateApp() { // concrete method (default method) it only allow in interface  and inherited method
		//it a inherited method it participate in interface
		//default method can be overridden 
		redundantCode();
		System.out.println("updating app....");
	}
	
	
	//JDK 9: private and private static are feature of the jdk 9
	//the method only access in the interfce , not anywhere in the outside 
	private static void redundantCode() {
		System.out.println("Check internet connection...");
		System.out.println("check storage...");
		System.out.println("chack hradware compatability....");
		System.out.println("check os compatability....");
	}
}

class Window implements OpertingSystem{
	public void boot() {
		System.out.println("window is booting up...");
	}
	public void shutdown() {
		System.out.println("window is shutting down....");
	}
//	@Override
//	public void installApp() { // override the default method
//		
//	}
}

class Mac implements OpertingSystem{
	public void boot() {
		System.out.println("mac is booting up...");
	}
	public void shutdown() {
		System.out.println("mac is shutting down....");
	}
}

class Linux implements OpertingSystem{
	public void boot() {
		System.out.println("linux is booting up...");
	}
	public void shutdown() {
		System.out.println("linux is shutting down....");
	}
}


public class Interface3 {

	public static void main(String[] args) {
		
		OpertingSystem.checkCompatabilityOs();//interfacename.staticmethod();
		
		Window w = new Window();
		Mac m = new Mac();
		Linux l = new Linux();
		
//		w.boot();
//		w.shutdown();
//		w.installApp();//inherited the default methods 
//		
//		m.boot();
//		m.shutdown();
//		
//		l.boot();
//		l.shutdown();
		
		
		
	}

}
