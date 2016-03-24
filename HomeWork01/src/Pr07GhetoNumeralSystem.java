import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

/**
 * Created by NRG on 18.3.2016 г..
 */
public class Pr07GhetoNumeralSystem {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String number1 = one.nextLine();
        char[] number = number1.toCharArray();
        StringBuilder x = new StringBuilder(number1.length());
        for (int i = 0; i < number1.length(); i++) {

            switch (number[i]){
                case '0': x.append("Gee"); break;
                case '1': x.append("Bro"); break;
                case '2': x.append("Zuz"); break;
                case '3': x.append("Ma"); break;
                case '4': x.append("Duh"); break;
                case '5': x.append("Yo"); break;
                case '6': x.append("Dis"); break;
                case '7': x.append("Hood"); break;
                case '8': x.append("Jam"); break;
                case '9': x.append("Mack"); break;
            }

        }
        String final_string = x.toString();
        System.out.println(final_string);
    }
}
