import java.text.SimpleDateFormat;
import java.util.Date;
public class DateExample {
    public static void main(String[] args) {
       Date date=new Date();
       System.out.println("current date and time is"+date);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
        String newdate=sdf.format(date);
        System.out.println("newdate is"+newdate);    
    }
}
