import java.util.*;
public class SumOfArray
{

public static void main(String args[])
{
	Scanner ck=new Scanner(System.in); 
	System.out.println("Enter the length of an array"); 
	int len=ck.nextInt(); 
	System.out.println("Enter the "+len+" elements"); 
	int arr[]=new int[len];

	for(int i=0;i<len;i++) 
	{
	arr[i]=ck.nextInt(); 
	}

	int sum=0; 
	for(int j=0;j<len;j++)
	{	
		sum=sum+arr[j]; 
	}
	System.out.println("Sum of all the elements of an array is " +sum);
}
}
