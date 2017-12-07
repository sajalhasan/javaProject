/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importantcomponent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author root
 */
public class DateTimeFormate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Real Time
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");java.util.Date dd = new java.util.Date();
        String s = sdf.format(dd);
        System.out.println(s);
         
        //Todays Date
         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
         Date date = new Date();
         System.out.println(dateFormat.format(date));
    }
    
}
