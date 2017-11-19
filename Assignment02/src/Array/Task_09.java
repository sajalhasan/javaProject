/*
 Create a program which will find the middle value of an array.
 */
package Array;

public class Task_09 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        
     int mid=arr.length/2;
     if(arr.length%2==0)
     {
         System.out.println("Number is :"+arr[mid-1]);
         System.out.println("Number is :"+arr[mid]);
         
     }else{
         System.out.println("Number is :"+arr[mid]);
     }
        
    }
}
