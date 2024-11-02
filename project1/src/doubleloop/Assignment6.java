package doubleloop;

public class Assignment6 {
	
public static void main(String[] args) {
	
	
	int row;
	int coloumn,k,j;
	
	

	for(row=1;row<=5;row++)
	{
		for(coloumn=5;coloumn>=row;coloumn--)
		{

		System.out.print(" ");
			}
		for(k=1;k<=row;k++)
		{
			for(j=1;j<=k;j++) 
			{
				
			System.out.print("*");
		
			}
		}
		System.out.println();
	}
	
}
	
}
