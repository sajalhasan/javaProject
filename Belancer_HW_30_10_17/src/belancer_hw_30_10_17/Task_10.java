/*
Task 10
 * Write a java program that reads 10 numbers from the user. After reading each number, print all the numbers
that have been entered so far.
After user enters 11, print 11
After user enters 22, print 11, 22
...
After user enters 99, print 11, 22 ..... 99
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
        //int parr[]=new int[10];
        //int j=0;
        
        int arr[]=new int[10];
        
        for(int i=0;i<10;i++)
        {
            System.out.println(i +" input :");
            arr[i]=sc.nextInt();
        }
        System.out.println("\n");
        
        System.out.println("Input The Number :");
        int num=sc.nextInt();
         for(int i=0;i<10;i++)
        {
           if(arr[i]==num)
           {
               for(int j=0;j<=i;j++)
               {
                System.out.print(": "+arr[j]+": ");
               }
           }else
           {
               
           }
           
        }
    }
}
