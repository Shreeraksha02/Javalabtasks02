import java.util.*;
public class store
{

public static void main(String args[])

{
	Scanner ck=new Scanner(System.in);
	System.out.println(" Enter the mobile model ");
	String Mmodel=ck.nextLine();
	System.out.println(" Enter the mobile Company ");
	String Mcompany=ck.nextLine();
	System.out.println(" Enter the mobile Price ");
	int Mprice=ck.nextInt();
	Mobile M1=new Mobile();
	M1.AddMobile(Mmodel,Mcompany,Mprice);
	M1.displayMobile();

}

}
