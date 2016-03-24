import java.util.Locale;
import java.util.Scanner;

/**
 * Created by NRG on 21.3.2016 г..
 */
public class Pr06System7ToDecimal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner one = new Scanner(System.in);
        String number = one.nextLine();
        int decimalNumber = Integer.valueOf(number, 7);
        System.out.println(decimalNumber);
    }
}
