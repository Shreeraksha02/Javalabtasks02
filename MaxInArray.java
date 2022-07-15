import java.util.*;
class MaxInArray
{

public static void main(String args[])
{
	Scanner ck=new Scanner(System.in); // a scanner object 
	System.out.println("Enter the length of an array"); 
	int len=ck.nextInt(); 
	int arr[]=new int[len]; // initializing the length of array
	System.out.println("Enter the "+len+" elements"); // to get elements of an array
		
	for(int i=0;i<len;i++) //loop for the elements in array
	{
	arr[i]=ck.nextInt(); //to read the array elements
	}
	
	int max=arr[4]; 
	for(int j=0;j<len;j++)
	{
		if(max<arr[j]) // comparing the values
		{	
		max=arr[j]; // swapping
		}
	}
	System.out.println("The maximum value of array is "+max);
}
}
