import java.util.Scanner;
public class factorial {
    public static void main(String arg[]) {
        int num, digit=0,temp;
        Scanner bs=new Scanner(System.in);
        System.out.println("enter a number to print its factorial");
        num=bs.nextInt();//the number for which factorial value has to be found
        temp=num;//temporary variable to calculate the value
      
        while(digit<=temp) 
        {
            temp=temp*digit;
            digit++;
        }
        System.out.println("Factorial of"+temp+"is"+digit);
    }
}
