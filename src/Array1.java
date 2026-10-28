import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[2][5];
		
		for(int i=0; i<2; i++) 
		{
			for(int j=0; j<5; j++)
			{
				System.out.println("Enter the age of classroom " + i  + " student " + j);
				a[i][j] = scan.nextInt();			
			}
		}
        
		for(int i=0; i<2; i++) 
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
