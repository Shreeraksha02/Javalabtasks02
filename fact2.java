import java.util.Scanner;
public class factorial {
    public static void main(String arg[]) 
    {
        int number,temp=1;
        long fact = 1;
        Scanner bs=new Scanner(System.in);
        System.out.println("enter a number to print its factorial");
        number=bs.nextInt();
        while(temp<=number)
        {
            fact = fact * temp;
            temp++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
