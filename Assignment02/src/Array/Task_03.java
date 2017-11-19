/*
 Create a java program which will calculate the sum and average of the elements of the array
 */
package Array;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How much number of input : ");int n1=sc.nextInt();
        
        double[] num2=new double[10];
        double result=0;
        
        for(int i=0;i<n1;i++)
        {
            System.out.print("Input Number :");
            num2[i]=sc.nextDouble();
            System.out.println("");
        }
        System.out.println("Output of The Result :");
        for(int j=0;j<n1;j++)
        {
            result+=num2[j];
        }
        System.out.println("Sum :"+result);
         System.out.println("Average :"+(result/n1));
    }
}
