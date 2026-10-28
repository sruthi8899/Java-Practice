import java.util.Scanner;

public class Exceptionhandling0{
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   
//	   int n = scan.nextInt();
//	   
//	   int[] ar = new int[n];
//	   for(int i=0; i<ar.length; i++) {
//		   ar[i] = scan.nextInt();
//	   }
//	   
//	   int k = scan.nextInt();
//	   
//	   
//	   try {
//		  System.out.println(ar[k]);
//	   }
//	   catch(Exception e) {
//		   System.out.println("Invalid index entered");
//	   }
	   
	   
	   
//	   String input = scan.nextLine();
//	   
//	  
//	   try {
//		   int n = Integer.parseInt(input);
//		   System.out.println(input);
//	   }
//	   catch(Exception e) {
//		   System.out.println("Invalid");
//	   }
	   
	   
	   
	   try {
		   int size = scan.nextInt();
		   int[] ar = new int[size];
		   System.out.println(size);
	   }
	   catch(Exception e) {
		   System.out.println("Invalid");
	   }
    }
}