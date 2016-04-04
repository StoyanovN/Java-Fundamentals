import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NRG on 3.4.2016 г..
 */
public class Pr01FilterArray {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String[] input = one.nextLine().split(" ");
        Arrays.stream(input)
                .filter(p -> p.length()> 3)
                .forEach(p -> System.out.print(p + " "));
    }
}
