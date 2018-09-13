package kata1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    
    public Person (String name, Calendar birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName(){
    return name;    
    }

            
    public int getAge(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fn = LocalDate.parse("02/07/1994",fmt );
        LocalDate fa = LocalDate.now();
        int periodo = Period.between(fn, fa).getYears();
        return periodo;
        
        }        
}
