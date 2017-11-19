package belancer_hw_30_10_17;

import java.util.Scanner;

/*
Task 2
Write a java program that reads 10 numbers from the user. The program then reads a
number between 0 to 9, and shows the number at the corresponding index number. For
instance, if the array is a and the user enters 3, your program should print the value
a[3]. 
*/
public class Task_2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        
        for(int i=0;i<10;i++)
        {
            System.out.println(i  +" number :");
            arr[i]=sc.nextInt();
        }
        System.out.println("\n");
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println("\n");
        int n=sc.nextInt();
        
        System.out.println("arr["+n+"] :"+arr[n]);
        
    }
    
    
}
