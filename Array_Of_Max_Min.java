package Array;


import java.util.Scanner;
public class Array_Of_Max_Min {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of an array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the number:");
	
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]<min) {
				min=arr[i];
		}
			else
			{
				max=arr[i];
			}
			
			
		}
		System.out.println("max value"+max);
		System.out.println("min value"+min);
		

	}

}
