/*
 Task 20
Create a String array (size 10) consisting of the words “zero”, “one”, “two”......, “nine”. Then take a number
(between 0 and 9) from the user and print that number in words from the array. If the user enters 5, you should
print a[5] and output should be “five”.
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] S_number=new String[11];
        S_number[0]="Zero";
        S_number[1]="One";
        S_number[2]="Two";
        S_number[3]="Three";
        S_number[4]="Four";
        S_number[5]="Five";
        
        S_number[6]="Six";
        S_number[7]="Seven";
        S_number[8]="Eight";
        S_number[9]="Nine";
        S_number[10]="Ten";
        
        System.out.print("Input the Number : ");
        int input=sc.nextInt();
        
        if(input==0){
            System.out.println("a[0] :"+S_number[0]);
        }
        else if(input==1)
        {
            System.out.println("a[1] :"+S_number[1]);
        }else if(input==2){
             System.out.println("a[2] :"+S_number[2]);
        }else if(input==3)
        {
            System.out.println("a[3] :"+S_number[3]);
        }else if(input==4){
             System.out.println("a[4] :"+S_number[4]);
        }
        else if(input==5)
        {
            System.out.println("a[5] :"+S_number[5]);
        }else if(input==6){
             System.out.println("a[6] :"+S_number[6]);
        }else if(input==7)
        {
            System.out.println("a[7] :"+S_number[7]);
        }else if(input==8){
             System.out.println("a[8] :"+S_number[8]);
        }
        else if(input==9){
             System.out.println("a[9] :"+S_number[9]);
        }else if(input==10)
        {
            System.out.println("a[10] :"+S_number[10]);
        }
    }
}
