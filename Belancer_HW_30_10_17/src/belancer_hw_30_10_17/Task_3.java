
package belancer_hw_30_10_17;

//Write a java program that reads 10 numbers from the user, and then prints them in the
//reverse order.
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n");
        for(int i=9;i>=0;i--)
        {
            System.out.println("arr["+i+"] :"+arr[i]);
        }
        
    }
}
