import java.util.Scanner;

/**
 * Created by NRG on 18.3.2016 г..
 */
public class Pr06SumNumbers {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number = Integer.parseInt(one.nextLine());
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
