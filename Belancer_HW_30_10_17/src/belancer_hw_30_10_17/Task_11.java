/*
Task 11
Write a java program that reads 10 numbers from the user, but does not allow the user to enter duplicates. This
means that if a number has been entered already, the program will not accept it as input again and instead ask
the user to enter a different number.
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_11 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int arr2[]=new int[10];
        int j=0;
        
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1) +"th input :");
            arr[i]=sc.nextInt();
            
            for(int k=0;k<=i;k++)
            {
                if(arr[k]==arr[i])
                {
                    break;
                }else{
                     arr2[j]=arr[i];
                }
            }
            
        }
        
            System.out.println("\n");
            for(int l=0;l<5;l++){
                System.out.println(arr2[l]);
            }
        
    }
}
