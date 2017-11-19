/*
 Create a program that will merge two arrays.
 */
package Array;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int [] arr1={1,2,3,4};
        int [] arr2={5,6,7,8};
        System.out.println("Input OF Two array :");
        for(int j=0;j<arr2.length;j++)
       {
           System.out.print(arr1[j]+" ,");
           // System.out.println(arr2[j]);
       }
        System.out.println("");
         System.out.println("Second Array :");
        for(int j=0;j<arr2.length;j++)
       {
           //System.out.println(arr1[j]);
            System.out.print(arr2[j]+" ,");
       }
        System.out.println("\n--------------------\n");
        int temp;
        for(int i=0;i<arr1.length;i++)
        {
            temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
        System.out.println("Output OF the Merge Two array :");
         System.out.println("First Array :");
       for(int j=0;j<arr2.length;j++)
       {
           System.out.print(arr1[j]+" ,");
           // System.out.println(arr2[j]);
       }
        System.out.println("");
         System.out.println("Second Array :");
        for(int j=0;j<arr2.length;j++)
       {
           //System.out.println(arr1[j]);
            System.out.print(arr2[j]+" ,");
       }
        System.out.println("");
    }
}
