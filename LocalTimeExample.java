import java.time.LocalTime;
public class LocalTimeExample {
    public static void main(String[] args) {
       LocalTime lt=LocalTime.now();
        System.out.println("local time is"+lt);
        System.out.println("hour is"+lt.getHour());
        System.out.println("minute is"+lt.getMinute());
        System.out.println("second is"+lt.getSecond());
        System.out.println("nano second"+lt.getNano());
    }
}