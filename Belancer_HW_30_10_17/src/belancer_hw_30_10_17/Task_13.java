/*
Write a program which reads 5 numbers into an array and prints the largest number and its location in the array.
If the user enters 7, 13, 2, 10, 6 then your program should print “largest number 13 was found at location 1”.
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
        int arr[]=new int[5];
   
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+ " no number :");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("\n");
        int max=0;
        int position=0;
        
        for(int j=0;j<5;j++)
        {
           if(arr[j]>max)
           {
               max=arr[j];
               position=j;
           }else{
             //  max=arr[j];
           }
        }
        System.out.println("largest number : "+max+ " was found at location: "+(position+1));
    }
}
