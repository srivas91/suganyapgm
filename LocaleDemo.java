import java.text.NumberFormat;
import java.util.Locale;
public class LocaleDemo {
    public static void main(String[] args) {
        Locale loc=new Locale("hi","IN");
        double amount=46734.34554;
        NumberFormat nf=NumberFormat.getNumberInstance(loc);
        String s=nf.format(amount);
        System.out.println("amount is"+s);
    }
    
}
