import java.util.Locale;
import java.util.Scanner;

/**
 * Created by NRG on 22.3.2016 г..
 */
public class Pr08OddAndEvenPairs {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner one = new Scanner(System.in);
        String[] input = one.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        if (numbers.length %2 != 0) {
            System.out.println("Invalid lenght");
        } else{
            int counter = 1;
            for (int i = 0; i < numbers.length - 1 ; i+= 2) {
                if (numbers[i] % 2 == 0 && numbers[counter] % 2 == 0){
                    System.out.printf("%d, %d -> both are even\n", numbers[i], numbers[counter]);

                }else if (numbers[i] % 2 != 0 && numbers[counter] % 2 != 0){
                    System.out.printf("%d, %d -> both are odd\n", numbers[i], numbers[counter]);

                }else{
                    System.out.printf("%d, %d -> different\n", numbers[i], numbers[counter]);

                }

                counter += 2;
            }
        }
    }
}
