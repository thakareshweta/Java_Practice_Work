import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int nrOfElements ;
		System.out.println("Please enter total nr of elements in the array:");
		nrOfElements = scanner.nextInt();
		int[] numbers = new int [nrOfElements];
		System.out.println("Enter all numbers seperated by space:");
		for(int i = 0 ; i<nrOfElements; i++)
		{	
			numbers[i] = scanner.nextInt();
			
		}
		
		System.out.println("Enter the number to be searched:");
		int nrToBeSearched ;
		
		
		nrToBeSearched = scanner.nextInt();
		//Code for Sequential search
		/*for (int i = 0 ; i<nrOfElements;i++)
		{
			if( numbers[i] == nrToBeSearched)
			{
				System.out.println("Nr to be searched is present at index : " +i);
				break;
			}
				
			
		}*/
		
		//Code for Binary Search
		System.out.println("Nr to be Searched is : " +nrToBeSearched);
		int low,high,middle;
		if (nrOfElements < 0)
		{
		System.out.println("There are no elements in the array");
		}
		else
		{
			low = 0;
			high = nrOfElements - 1;
			while(high >= low)
			{
				System.out.println("High : " + high);
				middle = (high+low)/2;
				if(nrToBeSearched < numbers[middle])
				{
					high = middle-1;
				}
				else if (nrToBeSearched > numbers[middle])
				{
					low = middle+1;
				}
				else if (nrToBeSearched == numbers[middle])
				{
					System.out.println("Nr to be searched is present at index : " +middle);
					break;
				}
					
					
			}
		}
		
		
		
		
	}
	
}
