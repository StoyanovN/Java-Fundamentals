import java.util.Scanner;


/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr04LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String[] input = one.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int bestCount = 1;
        int bestIndex = 0;
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > (numbers[i])) {
                    System.out.print(numbers[j] + " ");
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            if (bestCount < count) {
                bestCount = count;
                bestIndex = i - bestCount + 1;
            }
         System.out.println();
        }
        System.out.print("Longest: ");
        for (int i = bestIndex; i < bestCount + bestIndex; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
