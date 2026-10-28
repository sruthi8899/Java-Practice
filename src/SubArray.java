import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] ar = new int[n];
        for(int i=0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int size = scan.nextInt();
        
        printSubarray(ar, size);
    }
    
    public static void printSubarray(int[] ar, int size) {
        for(int i=0; i <= ar.length-size; i++) {
            for(int j=i; j < i+size; j++) {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }

}
