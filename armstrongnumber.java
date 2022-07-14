import java.util.*;
import java.lang.*;
public class armstrongNumber
{
    public static void main(String arg[]) 
    {
        int number,digit=0,temp1,temp2,sum=0,reminder;
        Scanner bs=new Scanner(System.in);//scanner class
        System.out.println("enter a number");//input the number to check whether the given number is armstrong or not
        number=bs.nextInt();
        temp1=number;
        temp2=number;
        //find the number of digits
        while(number!=0)
        {
            number=number/10;// for iteration
            digit++;//to store the number of digits
        }
        //to find armstrong number or not
        while (temp1!=0)
        {
            reminder=temp1%10;
            sum+=Math.pow(reminder,digit);
            temp1=temp1/10;
        }
        if(sum==temp2)
        {
            System.out.println(temp2+"is armstrong number");
        }
        else
        {
            System.out.println(temp2+" is not armstrong number");
        }
    }
}
  
