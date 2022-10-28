package inheritence2;

public class OneTime extends Appointment{
    String appointmentName;
    int day;
    int month;
    int year;

    public OneTime(String appointmentName, int day, int month, int year){
        this.appointmentName = appointmentName;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public String getAppointmentName(){
        return appointmentName;
    }
}
