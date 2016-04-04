import java.util.Scanner;

/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr12CalculateNFactorial {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number = one.nextInt();
        long result = factorial(number);
        System.out.println(result);
    }
    private static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
