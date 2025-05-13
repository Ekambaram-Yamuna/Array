package Array;



public class ArrayBasic {

	public static void main(String[] args) {
		//declares an array of Integer
		//data [] arrayname
		int [] arr;
		//allocating memory
		arr=new int[5]; //correct way
		//Initialize the values
		arr[0]=12;
		arr[1]=22;
		arr[2]=25;
		arr[3]=20;
		arr[4]=29;
		//arr.length to find the array length
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at index"+" "+i+" "+"is"+" "+arr[i]);
		}
		

	}

}
