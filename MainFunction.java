package inheritence2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.time.LocalDate;

public class MainFunction {
    public static void main(String[] str){
        ArrayList<String> appointments = new ArrayList<>();
        OneTime[] oneTime = new OneTime[2];
        oneTime[0] = new OneTime("see the client1", 29, 10, 2022);
        oneTime[1] = new OneTime("see the client2", 29, 10, 2022);
        for(int i=0; i<oneTime.length; i++){
            if(oneTime[i].occursOn(oneTime[i].getDay(), oneTime[i].getMonth(), oneTime[i].getYear()) == true){
              appointments.add(oneTime[i].getAppointmentName());
            }
        }

        Daily[] dailies = new Daily[2];
        dailies[0] = new Daily("see the manager", 28, 10, 2022);
        dailies[1] = new Daily("see the boss", 28, 10, 2022);
        for(int i=0; i<dailies.length; i++){
                appointments.add(dailies[i].getAppointmentName());

        }

        Monthly[] monthlies = new Monthly[2];
        monthlies[0] = new Monthly("see the dentist", 29, 10, 2022);
        monthlies[1] = new Monthly("see the cardiologist", 29, 10, 2022);
        for(int i=0; i<monthlies.length; i++){
            if(monthlies[i].occursOn(monthlies[i].getDay(), monthlies[i].getMonth(), monthlies[i].getYear()) == true){
                appointments.add(monthlies[i].getAppointmentName());
            }
        }

        System.out.println("Todays Appointments are: ");
        for(String x: appointments){
            System.out.println(x);
        }


    }
}
