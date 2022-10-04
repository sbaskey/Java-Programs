import java.time.*;

public class Times {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Local Date");
        System.out.println(date);
        System.out.println("Local Time");
        LocalTime localtime=LocalTime.now();
        System.out.println(localtime);

        System.out.println("Local Date with time");
        LocalDateTime current=LocalDateTime.now();
        System.out.println(current);

        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int hrs=current.getHour();
        int seconds = current.getSecond();
        System.out.println("Filtering the current date and time");
        System.out.println("month: "+ month + "day:"+day + " hrs:" + hrs );


        System.out.println("Printing time for different zones");
        System.out.println("time zone Asia/Kolkata");
        LocalTime t=LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(t);

        System.out.println("time zone utc");
        LocalTime t1=LocalTime.now(ZoneId.of("UTC"));
        System.out.println(t1);
    }
}