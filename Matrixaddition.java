import java.util.*;
public class matrixaddition
{

public static void main(String args[])
{
	int i,j;
	Scanner ck=new Scanner(System.in);
	System.out.println("Enter number of rows");
	int rows=ck.nextInt();
	System.out.println("Enter number of columns");
	int cols=ck.nextInt();

	int ar[][]=new int[rows][cols];
	int br[][]=new int[rows][cols];
	int cr[][]=new int[rows][cols];
	
	System.out.println("Enter the first matrix elements");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			ar[i][j]=ck.nextInt();
		}
	}	

	System.out.println("Enter the second matrix elements");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			br[i][j]=ck.nextInt();
		}
	}

	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			cr[i][j]=ar[i][j]+br[i][j];
		}
	}
	
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			System.out.print(cr[i][j]+" ");
		}
		System.out.println("");
	}
}
}
