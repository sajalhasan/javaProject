/*
 Create an object array.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Task_07 {
    int task_id;
    String task_name;
    String task_date;
    
     Task_07(int id,String name,String date){
        System.out.println("Task ID: "+id + " - Task Name :"+name+" -Date :"+date);
    }
  
    public static void main(String[] args) {
        //Task_07 obj=new Task_07();
        Task_07[] arr=new Task_07[2];  //Array Object
        int[] id=new int[10];
        String [] name=new String[10];
        String [] date=new String[10];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++)
        {
           System.out.println("Input ID :");
            id[i]=sc.nextInt();
           System.out.println("Input Name :");
            name[i]=sc.next();
           System.out.println("Input Date :");
            date[i]=sc.next();
           arr[i]=new Task_07(id[i],name[i],date[i]);
        }
    }
}
