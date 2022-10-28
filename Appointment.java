package inheritence2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Appointment {
    int day, month, year;

    public Appointment(){
        LocalDate ob = LocalDate.now();
        day = ob.getDayOfMonth();
        month = ob.getMonthValue();
        year = ob.getYear();
    }
    public boolean occursOn(int day, int month, int year){
        if(this.day == day && this.month == month && this.year == year) return true;
        else return false;
    }
}
