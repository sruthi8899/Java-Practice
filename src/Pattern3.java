
public class Pattern3 
{
	
	public static void main(String[] args) 
	{
		int i;
		int j;
		int k;
		int n=5;
		for(i=1; i<=n; i++)
		{
			for(k=1; k<=n-i; k++)
			{
				System.out.print(" ");
			}
			
			for(j=1 ;j<=i; j++)
			{
				if(i==5 || j==1 || i==j )
				{
					System.out.print("* ");
			    }    
	            else 
	            {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
	}
}
		