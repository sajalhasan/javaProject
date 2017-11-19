
package belancer_hw_30_10_17;

import java.util.Scanner;

/*Task 9
Write a java program that reads 10 numbers from the user. Then read another number
from the user, and print “yes” if this number exists among the first 10. Print “no”
otherwise.
 */
public class Task_9 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
        int arr[]=new int[10];
        
        for(int i=0;i<10;i++)
        {System.out.println((i+1)+ " number :");
            arr[i]=sc.nextInt();
        }
        System.out.println("\n");
       int num=sc.nextInt();
       
       for(int i=0;i<10;i++){
           if(arr[i]==num){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
       }
    }
}
