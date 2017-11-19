/*
 Write a program which reads 5 numbers into an array and prints the largest number.
 If the user enters 7, 13, 2, 10, 6 then your program should print 13.
 */
package belancer_hw_30_10_17;

import java.util.Scanner;
public class Task_12 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
         
        int arr[]=new int[5];
   
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+ " no number :");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("\n");
        int max=0;
        for(int j=0;j<5;j++)
        {
           if(arr[j]>max)
           {
               max=arr[j];
           }else{
             //  max=arr[j];
           }
        }
        System.out.println("Max Values : "+max);
    }
}
