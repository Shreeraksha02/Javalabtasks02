import java.util.*;
public class findingelementposition {

    public static void main(String args[]) {
        Scanner ck=new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int len=ck.nextInt();
        int arr[]=new int[len];
        int count=0;
        System.out.println("Enter the array elements:");

        for(int i=0; i<len; i++) {
            arr[i]=ck.nextInt();
        }
        System.out.println("Enter element to find the position:");
        int elem=ck.nextInt();

        for(int i=0; i<len; i++) {
            if(arr[i]==elem) {
                System.out.println(elem+" position is " +i);
            }
        }
    }
}
