/*Task 18
Write a java program that reads 15 numbers from the user, all the numbers within the range 0-9. Then print the
number of times each number has been entered by the user.
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         
        int arr[]=new int[15];
        int arr2[]=new int[15];
        
        int n=1;
        for(int i=0;i<n+2;i++)
        {
            System.out.println((i+1)+ " no number :");
            arr[i]=sc.nextInt();
            if(arr[i]>10 || arr[i]<0)
            {
                i=0;
            }else
            {
                arr2[i]=arr[i];
                n++;
                if(n==15){
                    break;
                }
            }
        }
        
        for(int i=0;i<15-1;i++){
            System.out.print(arr2[i]+", ");
        }
    }
}
