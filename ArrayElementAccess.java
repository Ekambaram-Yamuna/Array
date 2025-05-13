package Array;


import java.util.Scanner;

public class ArrayElementAccess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Ask user for array size
		System.out.println("Enter the size array of element:");
		int n=sc.nextInt();
		int [] arr =new int[n];
		
		//Read array elements
		System.out.println("Element"+" "+n+" "+"elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		//Ask for the index to access
		System.out.println("Enter the index of the element you want to access(0 to (n-1))");
		int index =sc.nextInt();
		// check if index is valid
		if(index >=0 && index<n)
		{
			System.out.println("Element at index"+index+"is:"+arr[index]);
			
		}
		else {
			System.out.println("Invalid index! Please enter value between 0 and n"+(n-1));
		}
		sc.close();

	}

}
