import java.util.*;
public class Matrixmultiplication
{

public static void main(String args[])
{
	int i,j,k;
	Scanner ck=new Scanner(System.in);
	System.out.println("Enter number of rows");
	int rows=ck.nextInt();
	System.out.println("Enter number of columns");
	int cols=ck.nextInt();

	int ar[][]=new int[rows][cols];
	int br[][]=new int[rows][cols];
	int cr[][]=new int[rows][cols];
	
	System.out.println("Enter the first array elements");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			ar[i][j]=ck.nextInt();
		}
	}	

	System.out.println("Enter the second array elements");
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
			cr[i][j]=0;		
			for(k=0;k<cols;k++)
			{
			cr[i][j]+=ar[i][k]*br[k][j];
			}
		}
	}
	
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{		
		System.out.print(cr[i][j]+" ");
		}
		System.out.println(" ");
	}
}
}
