import java.util.Scanner;

/**
 * Created by NRG on 22.3.2016 г..
 */
public class Pr11GetFirstOddOrEvenElements {
    static Scanner one = new Scanner(System.in);

    public static void main(String[] args) {
        FirstOddOrEven();
    }

    static void FirstOddOrEven() {
        String[] firstLine = one.nextLine().split(" ");
        String[] secondLine = one.nextLine().split(" ");
        int n = Integer.parseInt(secondLine[1]);
        String oddOrEven = secondLine[2];
        int[] numbers = new int[firstLine.length];
        int counter = 1;
        for (int i = 0; i < firstLine.length; i++) {
            numbers[i] = Integer.parseInt(firstLine[i]);
        }
        if (oddOrEven.equals("odd")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0 && counter <= n) {
                    System.out.print(numbers[i] + " ");
                    counter++;
                }
            }
        }
        if (oddOrEven.equals("even")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0 && counter <= n) {
                    System.out.print(numbers[i] + " ");
                    counter++;
                }
            }
        }
    }
}

