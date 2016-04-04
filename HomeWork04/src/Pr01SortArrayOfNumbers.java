import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NRG on 29.3.2016 г..
 */
public class Pr01SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int n = one.nextInt();
        one.nextLine();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = one.nextInt();
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
