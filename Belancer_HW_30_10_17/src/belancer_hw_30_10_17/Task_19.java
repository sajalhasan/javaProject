/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belancer_hw_30_10_17;

import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int[] num=new int[20];
        for(int i=0;i<10;i++)
            num[i]=sc.nextInt();

        for(int i=0;i<10-1;i=i+2)
            System.out.print(num[i]+" ");
        for(int i=1;i<10;i=i+2)
            System.out.print(num[i]+" ");
    }
}
