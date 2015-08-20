import java.util.Scanner;

public class Matrix {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("First Matrix Program ");
		int[][] matrix = new int [2][2];
		int rownum;
		int colnum;
		for(rownum=0;rownum<2;rownum++)
		{
			for(colnum=0;colnum<2;colnum++)
			{
				System.out.println("Enter value for [" +rownum +"] ["+colnum+"] : " );
				matrix[rownum][colnum] = scanner.nextInt();
				
			}
		}	
		
		
		for(rownum=0;rownum<2;rownum++)
		{
			for(colnum=0;colnum<2;colnum++)
			{
				System.out.println("[" +rownum +"] ["+colnum+"] : " +matrix[rownum][colnum] );
		//		matrix[rownum][colnum] = scanner.nextInt();
				
			}
		}
		
	}
	
}
