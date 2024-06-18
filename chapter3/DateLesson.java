package chapter3;
import java.time.*;

public class DateLesson {
    public static void main(String[] args) {
        LocalDate date1Now= LocalDate.now();
        LocalTime time1Now = LocalTime.now();
        LocalDateTime ldt1Now = LocalDateTime.now();
        System.out.println(date1Now+"\n"+time1Now+"\n"+ldt1Now);
        
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 4, 30);
        LocalTime time1 = LocalTime.of(12, 45);
        LocalTime time2 = LocalTime.of(12, 45, 10);
        LocalTime time3= LocalTime.of(12, 45, 10,100000000);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        LocalDateTime ldt1 = LocalDateTime.of(2022, 11, 2, 5, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(date2,time1);
        // date - plus or minus | Years Months Days Weeks
        System.out.println(date1Now.plusDays(30));
        System.out.println(date1Now);
        // time - plus or minus | Hours Minutes Seconds Nanos 
        System.out.println(time1Now.plusHours(21));
        // plus or minus | Years Months Days Weeks Hours Minutes Seconds Nanos
        System.out.println(date1Now.plusDays(1).minusMonths(2));
        // date get | DayOfMonth DayOfWeek DayOfYear Year Month 
        System.out.println(date1Now.getDayOfWeek());
        // time get | Hour Minute Second Nano
        System.out.println(time1Now.getHour());
        System.out.println(ldt1Now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }   

}
