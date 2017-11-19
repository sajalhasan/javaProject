/*
Write a program which asks the user how many numbers to take. Then takes that many numbers and prints the
median value. Read http://www.mathsisfun.com/median.html
If the user gives 10, 50, 40, 20, 30. Then the median is 30 (because 30 falls in middle 10, 20, 30, 40, 50)
If the user gives 30, 10, 40, 20. Then the median is 25 because, (20+30)/2=25(average of two middle values
from 10, 20, 30, 40)
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
        int arr[]=new int[5];
   
        for(int i=0;i<num;i++)
        {
            System.out.println((i+1)+ " no number :");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Problem arise");
    }
}
