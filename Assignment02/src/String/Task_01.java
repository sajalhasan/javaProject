/*
 Create a program which will convert ASCII to char & char to ASCII.
 */
package String;
public class Task_01 {
    public static void main(String[] args) {
       String name="Line the world";
       char [] arr=name.toCharArray();
       int [] num=new int[100];
       
       //char to ASCII.
       for(int i=0;i<arr.length;i++)
       {
           num[i]=arr[i];
           //arr[i]=
       }
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(num[i]+ " ");
           //arr[i]=
       }
       
       //ASCII to char 
       for(int i=0;i<arr.length;i++)
       {
          arr[i]=(char) num[i];
           //arr[i]=
       }
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+ " ");
           //arr[i]=
       }
       
    }
}
