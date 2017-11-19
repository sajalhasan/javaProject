
package belancer_hw_30_10_17;

import java.util.Scanner;

/*Task 6
Write a java program that reads 10 numbers from the user and prints the last odd
number in the list.*/
public class Task_6 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
        int arr[]=new int[10];
        
        for(int i=0;i<10;i++)
        {System.out.println((i+1)+ " number :");
            arr[i]=sc.nextInt();
        }
        System.out.println("\n");
        
         for(int i=9;i>=0;i--)
        {
            if(arr[i]/2==0)
            {
                System.out.println("First odd arr["+i+"] : "+arr[i]);
                break;
            }
            
        }
    }
}
