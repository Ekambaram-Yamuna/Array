package Array;


import java.util.Scanner;

public class Array_Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size");
		int size=sc.nextInt();
		int [] arr=new int[size];
		
		System.out.print("Enter"+size +" array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//get old and new values from user
		System.out.print("enter the value to replace:");
		
		int oldValue=sc.nextInt();
		System.out.print("Enter the new value:");
		int newValue=sc.nextInt();
		//Replace manually
		for(int i=0;i<size;i++) {
			if(arr[i]==oldValue) {
				arr[i]=newValue;
			}
		}
		//output the modified array
		System.out.println("Updated array:");
		for (int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
		
		
		

	}

}
