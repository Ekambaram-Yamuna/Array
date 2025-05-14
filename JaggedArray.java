package Array;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of arrays");
		//[][] //1.row 2.column
		int[][] jag=new int[3][]; //3 row but column not defined
		jag[0]=new int[] {1,2,3};
		jag[1]= new int[] {4,5};
		jag[2]=new int[] {6,7,8,9};
		for(int i=0; i<jag.length;i++)
		{ //i-row
			//j based on i due to jagged array
			for(int j=0;j<jag[i].length;j++) 
			{ //j-column
				System.out.print(jag[i][j]+" ");
			}
			    System.out.println();
			
		}
		}
	

	}


