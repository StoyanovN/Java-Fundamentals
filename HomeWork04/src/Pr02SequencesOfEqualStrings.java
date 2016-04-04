import java.util.*;

/**
 * Created by NRG on 29.3.2016 г..
 */
public class Pr02SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        String[] input = one.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");

            for (int j = i + 1; j < input.length; j++) {
                if (input[j].equals(input[i])) {
                    System.out.print(input[j] + " ");
                    i++;
                }
            }
            System.out.println();
        };
    }
}
