/*
Write a program which reads 5 numbers into an array and prints the smallest and largest number and their
location in the array.
If the user enters 7, 13, -5, 10, 6 then your program should print
“Smallest number -5 was found at location 2”.
“Largest number 13 was found at location 1”.
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_14 {
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
        int min=0;
        int position=0;
        int position2=0;
        
        for(int j=0;j<5;j++)
        {
           if(arr[j]>max)
           {
               max=arr[j];
               position=j;
           }else{
               min=arr[j]; 
               position2=j;
           }
        }
        System.out.println("Smallest number : "+min+ " was found at location: "+(position2+1));
        System.out.println("largest number : "+max+ " was found at location: "+(position+1));
    }
}
