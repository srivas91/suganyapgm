import java.time.LocalDate;
public class LocalDateExample {
    public static void main(String[] args) {
       LocalDate ld=LocalDate.now();
        System.out.println("local date is"+ld);
        System.out.println("year is"+ld.getYear());
        System.out.println("month is"+ld.getMonthValue());
        System.out.println("day is"+ld.getDayOfMonth());
    }
}
