import java.util.Scanner;

/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr03LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] input = scn.nextLine().split(" ");
        int bestCount = 1;
        String result = input[0];
        for (int i = 0; i < input.length; i++) {
            int count = 1;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j].equals(input[i])) {
                    count++;
                    if (bestCount < count) {
                        bestCount = count;
                        result = input[j];
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < bestCount; i++) {
            System.out.print(result + " ");
        }
    }
}
