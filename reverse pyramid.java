import java.util.Scanner;
class ReversePyramid{

public static void main(String args[])
{
	int lines,i,j;	//init
	Scanner ck=new Scanner(System.in);	//creating an object to get the input
	System.out.print("Enter number of lines:");	//to get the number of lines
	lines=ck.nextInt();

	for(i=1;i<=lines;i++)	//loop for lines
	{
		for(j=lines;j>=i;j--)	//loop for stars
		{
		System.out.print("*");	//print star pyramid
		}
			System.out.println(" ");
		}
	}
