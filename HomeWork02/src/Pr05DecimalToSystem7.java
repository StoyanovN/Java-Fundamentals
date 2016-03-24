import java.util.Locale;
import java.util.Scanner;

/**
 * Created by NRG on 21.3.2016 г..
 */
public class Pr05DecimalToSystem7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner one = new Scanner(System.in);
        int decimalNumber = one.nextInt();
        String number = Integer.toString(decimalNumber, 7);
        System.out.println(number);
    }
}
