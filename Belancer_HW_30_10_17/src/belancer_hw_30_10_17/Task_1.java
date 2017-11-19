
package belancer_hw_30_10_17;

import java.util.Scanner;

/*Write a java program that would input three numbers from the user and print sum,
then the first number, then the 2 nd number followed by 3rd number. If user enters 10,
20, 30. Then output should be 60, 10, 20, and 30.
*/
public class Task_1 {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("First Number :");
       int first=sc.nextInt();
       System.out.println("Second Number :");
       int second=sc.nextInt();
       System.out.println("Third Number :");
       int third=sc.nextInt();
       
       System.out.println("Sum :"+(first+second+third));
       System.out.println("First Number :"+first);
       System.out.println("Second Number :"+second);
       System.out.println("Third Number :"+third);
       
        System.out.println((first+second+third)+", "+first+", "+second+", "+third);
    }
    
}
