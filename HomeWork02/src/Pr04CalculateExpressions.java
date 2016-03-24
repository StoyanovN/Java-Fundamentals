import java.util.Locale;
import java.util.Scanner;

/**
 * Created by NRG on 21.3.2016 г..
 */
public class Pr04CalculateExpressions {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner one = new Scanner(System.in);
        double a = one.nextDouble();
        double b = one.nextDouble();
        double c = one.nextDouble();

        double formulaOne = Math.pow((a*a + b*b)/(a*a - b*b), (a + b + c)/Math.sqrt(c));
        double formulaTwo = Math.pow((a*a + b*b - c*c*c), (a - b));
        double avgFormulas = (formulaOne + formulaTwo)/2;
        double numbersAvg =(a + b + c)/3;

        double difference = Math.abs(numbersAvg - avgFormulas);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formulaOne, formulaTwo, difference);
    }
}
