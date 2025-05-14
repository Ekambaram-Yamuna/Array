package Array;


import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {
		int arr[]= {};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the array element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		//output or print
		for(int i=0;i<n;i++)
		{
			System.out.println("The array elements are");
			System.out.println(arr[i]+"");
		}
		sc.close();
		
		
		
		
		

	}

}
