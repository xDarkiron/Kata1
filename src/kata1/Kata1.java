package kata1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


public class Kata1 {
     
        public static void main (String [] args){
            Calendar date ;
            date = GregorianCalendar.getInstance();
                      
            Scanner scan = new Scanner (System.in);
            Person person = new Person ("Airam", date);
            System.out.println(person.getName() + " tiene " 
                    + person.getAge() + " años ");  
        
        
        }
}
