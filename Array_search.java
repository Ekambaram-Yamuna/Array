package Array;


import java.util.Scanner;
public class Array_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input array size
		System.out.print("Enter number of elements:");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		//input array elements
		System.out.println("enter"+size+"elements:");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Input search element
		System.out.println("enter number to search:");
		int search=sc.nextInt();
		//search  using index
		int index= -1;
		for(int i=0;i<=size;i++)
		{
			if(array[i]==search)
			{
				index=i;
				break;
			}
		}
	
		
		
		//In java (and most programming languages), index=-1 is a special
		//value we  use to indicate 'not found ' when searching in arrays or lits.
		//print result
		if(index !=-1) {
			System.out.println(search+"found at index"+index);
		}
		else {
			System.out.println(search+"not found in array");
		}

	}

}
