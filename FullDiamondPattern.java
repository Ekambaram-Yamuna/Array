package Array;

import java.util.Scanner;

public class FullDiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows");
		int rows=sc.nextInt();
		
		//upper half including middle row
		for(int i=1;i<=rows;i++)
		{
			//print spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			//print stars
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// Lower half
		for(int i=rows-1;i>=1;i--) {
			//print spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			//print stars
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print(1);
				
			}
			System.out.println();
		}
           sc.close();

	}

}
