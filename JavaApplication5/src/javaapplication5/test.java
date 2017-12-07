
package javaapplication5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test{
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat sd = new SimpleDateFormat("dd:mm:yy");
        java.util.Date dd = new java.util.Date();
        String s = sdf.format(dd);
        String s2 = sd.format(dd);
        System.out.println(s);
         System.out.println(s2);
         
         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
            System.out.println(dateFormat.format(date));
    }
}
