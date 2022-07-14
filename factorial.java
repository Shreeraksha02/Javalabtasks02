import java.util.*;
class factorial
{
  public static void main(String arg[])
{
  int fact,num,i;
  Scanner bs=new Scanner(System.in)
  System.out.println("enter a number to print its factorial");
  num=bs.nextInt();
  for(i=1;i<=num;i++)
  {
    fact=fact*i;
  }
  System.out.println("Factorial of"+num"is"+fact);
}
}
