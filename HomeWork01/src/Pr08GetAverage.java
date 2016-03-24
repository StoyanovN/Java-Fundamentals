import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by NRG on 18.3.2016 г..
 */
public class Pr08GetAverage {
    static Scanner one = new Scanner(System.in);
    public static void main(String[] args) {

        averageOfThreeNumbers();

    }
    public static void averageOfThreeNumbers(){
        double number1 = Double.parseDouble(one.nextLine());
        double number2 = Double.parseDouble(one.nextLine());
        double number3 = Double.parseDouble(one.nextLine());
        double avg = (number1 + number2 + number3)/3;
        System.out.printf("%.2f", avg);

    }
}
