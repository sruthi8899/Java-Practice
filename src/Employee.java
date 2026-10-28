
/**1
 * POJO CLASS
 */
//class Employee0 {
//
//    private int empId;
//    private String empName;
//    private int empSal;
//
//    public Employee0() {
//
//    }
//
//    public Employee0(int empId, String empName, int empSal) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empSal = empSal;
//    }
//
//    public int getEmpId() {
//        return empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public int getEmpSal() {
//        return empSal;
//    }
//
//}  // Employee0 class ends here
//
//public class Employee {
//
//    public static void main(String[] args) {
//
//        Employee0 e1 = new Employee0(1, "sruthi", 80000);
//        Employee0 e2 = new Employee0(2, "renshihao", 90000);
//
//        System.out.println(e1.getEmpId());
//        System.out.println(e1.getEmpName());
//        System.out.println(e1.getEmpSal());
//
//        System.out.println(e2.getEmpId());
//        System.out.println(e2.getEmpName());
//        System.out.println(e2.getEmpSal());
//
//    }
//
//  }

import java.util.Scanner;

/** 
 * for more employee details
 * and this program is not the way to write the code to print more employee details
 * using the loop also
 * */

//class Employee0 {
//
//    private int empId;
//    private String empName;
//    private int empSal;
//
//    public Employee0() {
//
//    }
//
//    public Employee0(int empId, String empName, int empSal) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empSal = empSal;
//    }
//
//    public int getEmpId() {
//        return empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public int getEmpSal() {
//        return empSal;
//    }
//
//}  // Employee0 class ends here
//
//public class Employee {
//
//    public static void main(String[] args) {
//    	Scanner scan = new Scanner(System.in);
//    	
//    	System.out.println("Enter the number of employees: ");//for user,how many employee objects do u want?
//    	int n = scan.nextInt();
//    	
//    	for(int i=1; i<=n; i++) {
//    		
//    	System.out.println("Enter the emp id: ");	
//    	int empId = scan.nextInt();
//    	scan.nextLine();
//    	
//    	System.out.println("Enter the emp name: ");
//    	String empName = scan.nextLine();
//    	
//    	System.out.println("Enter the emp sal: ");
//    	int empSal = scan.nextInt();
//    	
//    	System.out.println(empId + " "+ empName + " " + empSal);//add all details using concat "+" 
//    	}
//
//    }
//
//  }

/**
 * line by line output
 */

//class Employee0 {
//
//    private int empId;
//    private String empName;
//    private int empSal;
//
//    public Employee0() {
//
//    }
//
//    public Employee0(int empId, String empName, int empSal) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empSal = empSal;
//    }
//
//    public int getEmpId() {
//        return empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public int getEmpSal() {
//        return empSal;
//    }
//
//}  // Employee0 class ends here
//
//public class Employee {
//
//    public static void main(String[] args) {
//    	Scanner scan = new Scanner(System.in);
//    	
//    	System.out.println("Enter the number of employees: ");//for user,how many employee objects do u want?
//    	int n = scan.nextInt();
//    	
//    	for(int i=1; i<=n; i++) {
//    		
//    	System.out.println("Enter the emp id: ");	
//    	int empId = scan.nextInt();
//    	scan.nextLine();
//    	
//    	System.out.println("Enter the emp name: ");
//    	String empName = scan.nextLine();
//    	
//    	System.out.println("Enter the emp sal: ");
//    	int empSal = scan.nextInt();
//    	
//    	Employee0 e = new Employee0(empId, empName, empSal);
//    	
//    	System.out.println(e.getEmpId());
//    	System.out.println(e.getEmpName());
//    	System.out.println(e.getEmpSal());
//    	
//    	}
//
//    }
//
//  }
/**
 * 2
 * excel sheet output(using array) 
 * example : s-->"1,sruthi,80000"
 * storing the homogeneous of data in array
 */

//class Employee0 {
//
//    private int empId;
//    private String empName;
//    private int empSal;
//
//    public Employee0() {
//
//    }
//
//    public Employee0(int empId, String empName, int empSal) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empSal = empSal;
//    }
//
//    public int getEmpId() {
//        return empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public int getEmpSal() {
//        return empSal;
//    }
//
//}  // Employee0 class ends here
//
//public class Employee {
//
//    public static void main(String[] args) {
//    	Scanner scan = new Scanner(System.in);
//    	
//    	System.out.println("Enter the number of Employee: ");
//    	int n = scan.nextInt();
//    	scan.nextLine();
//    	
//    	for(int i=1; i<=n; i++) {
//    	System.out.println("Enter the employee details: ");//for user,how many employee objects do u want?
//    	String s = scan.nextLine();
//    	
//    	String[] ar = s.split(",");   	
//    	
//    	int empId = Integer.parseInt(ar[0]);
//    	String empName = ar[1];
//    	int empSal = Integer.parseInt(ar[2]);
//    	
//    	Employee0 e = new Employee0(empId, empName, empSal);
//    	
//    	System.out.println(e.getEmpId());
//    	System.out.println(e.getEmpName());
//    	System.out.println(e.getEmpSal());
//    	
//    	}
//    
//
//    }
//
//  }

/**
 * 3
 * Storing the objects in array
 */

//class Employee0 {
//
//    private int empId;
//    private String empName;
//    private int empSal;
//
//    public Employee0() {
//
//    }
//
//    public Employee0(int empId, String empName, int empSal) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empSal = empSal;
//    }
//
//    public int getEmpId() {
//        return empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public int getEmpSal() {
//        return empSal;
//    }
//
//}  // Employee0 class ends here
//
//public class Employee {
//
//    public static void main(String[] args) {
//    	Scanner scan = new Scanner(System.in);
//    	
//    	System.out.println("Enter the number of Employee: ");
//    	int n = scan.nextInt();
//    	scan.nextLine();
//    	
//    	Employee0[] empAr = new Employee0[n];
//    	
//    	for(int i=0; i<n; i++) {
//    	System.out.println("Enter the employee details: ");//for user,how many employee objects do u want?
//    	String s = scan.nextLine();
//    	
//    	String[] ar = s.split(",");   	
//    	
//    	int empId = Integer.parseInt(ar[0]);
//    	String empName = ar[1];
//    	int empSal = Integer.parseInt(ar[2]);
//    	
//    	empAr[i] = new Employee0(empId, empName, empSal);
//    	//or
//    	//empAr[i] e = new Employee0(empId, empName, empSal);
//    	//empAr[i] = e
//    	
//    	System.out.println(empAr[i].getEmpId());
//    	System.out.println(empAr[i].getEmpName());
//    	System.out.println(empAr[i].getEmpSal());
//    	
//    	}
//    
//
//    }
//
//  }


/**
 * giving all inputs and getting all outputs at one time
 */

class Employee0 {

    private int empId;
    private String empName;
    private int empSal;

    public Employee0() {

    }

    public Employee0(int empId, String empName, int empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSal() {
        return empSal;
    }

}  // Employee0 class ends here

public class Employee {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter the number of Employee: ");
    	int n = scan.nextInt();
    	scan.nextLine();
    	
    	Employee0[] empAr = new Employee0[n];
    	
    	for(int i=0; i<n; i++) {
    	System.out.println("Enter the employee details: ");//for user,how many employee objects do u want?
    	String s = scan.nextLine();
    	
    	String[] ar = s.split(",");   	
    	
    	int empId = Integer.parseInt(ar[0]);
    	String empName = ar[1];
    	int empSal = Integer.parseInt(ar[2]);
    	
    	empAr[i] = new Employee0(empId, empName, empSal);
    	
    	
    	}
    	for(int i=0; i<empAr.length; i++) {
    		System.out.println(empAr[i].getEmpId()+ " "+empAr[i].getEmpName()+ " "+ empAr[i].getEmpSal());
        	
    	}
    

    }

  }

