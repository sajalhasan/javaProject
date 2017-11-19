/*
Task 16
Write a program which reads 5 numbers into an array, sorts/arranges the numbers from high to low and prints
all numbers in the array.
If the user enters 7, 13, 2, 10, 6 then your program should print 13, 10, 7, 6, 2.
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        int arr[]=new int[5];
   
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+ " no number :");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("\n");
        
         //   int a, b;
           int temp;
          // int sortTheNumbers = len - 1;

           for (int a = 0; a < 5-1; a++) 
           {
               for (int b = 0; b < 5-1; b++) 
               {
                   if (arr[b] < arr[b + 1]) 
                   {
                       temp = arr[b];
                       arr[b] = arr[b + 1];
                       arr[b + 1] = temp;
                   }
               }
           }
           for(int a=0;a<5;a++){
               System.out.print(arr[a]+", ");
           }
        
    }
}
