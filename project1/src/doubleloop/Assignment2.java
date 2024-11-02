package doubleloop;

public class Assignment2 {

	public static void main(String[] args) {
		int row,coloumn;
		
		for(row=1;row<=5;row++)
		{
			for(coloumn=5;coloumn>=row;coloumn--)
			{

			
				System.out.print("*");
				}
			
			System.out.println();
		}
		
	}

}
