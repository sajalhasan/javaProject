
package Array;

import java.util.Scanner;

/* 1.Create a java program which will done all the operations like:
addition, subtraction, multiplication and division of an array.
*/
public class Task_01 
{
    static void multiplication(double n1,double n2){
       double d=n1*n2;
        System.out.println(d);
    }
    static void divition(double n1,double n2){
       double d=n1/n2;
        System.out.println(d);
    }
    public static void main(String[] args) 
    {
        double [] num1=new double[11];
        double [] num2=new double[11];
        double result=0;
        double[] result2=new double[11];
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Addition \n 2. subtraction \n 3. multiplication \n 4. division");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                for(int i=0;i<2;i++)
                {
                    System.out.print(i+1 +" position Input: ");
                    num1[i]=sc.nextDouble();
                    result+=num1[i];
                }
                System.out.println(result);
                break;
            case 2:
                for(int i=0;i<2;i++)
                {
                    result=num1[i];
                    System.out.print(i+1 +" position Input: ");
                    num1[i]=sc.nextDouble();
                    result=num1[i]-result;
                }
                System.out.println(result);
                break;
             case 3:
                System.out.print(1 +"st position Input: ");
                      num2[0]=sc.nextDouble();
                System.out.print(2 +"st position Input: ");
                      num2[1]=sc.nextDouble();
                 
                 multiplication(num2[0], num2[1]);
                
                break;
                
                 case 4:
                System.out.print(1 +"st position Input: ");
                      num2[0]=sc.nextDouble();
                System.out.print(2 +"nd position Input: ");
                      num2[1]=sc.nextDouble();
                 divition(num2[0], num2[1]);
                break;
                
              default:
                
                break;
                   
        }
    }
    
}
