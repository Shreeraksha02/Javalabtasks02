import java.util.Scanner;
public class loginpassword
{
    public static void main(String args[])
    {
        String username,password;
        Scanner ck=new Scanner(System.in);
        System.out.print("enter the username");//input the username
        username=ck.nextLine();
        System.out.print("enter the password");//input the password
        password=ck.nextLine();
        if(password.equals("aaa"))//to check whether the password matches or not
        {
            System.out.println(username+"login successful");
        }
        else
        {
            System.out.println(username+"login denied");
        }
    }
}
