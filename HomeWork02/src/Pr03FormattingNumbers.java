import java.util.Locale;
import java.util.Scanner;


/**
 * Created by NRG on 21.3.2016 г..
 */
public class Pr03FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner one = new Scanner(System.in);
        int a = one.nextInt();
        float b = one.nextFloat();
        float c = one.nextFloat();
        String hex_a = Integer.toHexString(a).toUpperCase();
        String bin_a = Integer.toBinaryString(a);
        while (bin_a.length()< 10){
            bin_a = "0" + bin_a;
        }

        System.out.println(hex_a);
        System.out.println(bin_a);
        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", hex_a, bin_a, b, c);
    }
}

