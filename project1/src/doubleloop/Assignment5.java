package doubleloop;

public class Assignment5 {

	public static void main(String[] args) {
	
		
		int row;
		int coloumn,k;
		
		

		for(row=1;row<=5;row++)
		{
			for(coloumn=5;coloumn>=row;coloumn--)
			{

			
				System.out.print(" ");
				}
			for(k=1;k<=row;k++)
			{
			
			System.out.print("*");
			}
			System.out.println();
		}
		

	}
}


