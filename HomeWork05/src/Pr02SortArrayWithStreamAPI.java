import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NRG on 3.4.2016 г..
 */
public class Pr02SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String[] input = one.nextLine().split(" ");
        String sortOrder = one.next().toLowerCase();
        if (sortOrder.equals("ascending")){
            Arrays.stream(input)
                    .sorted()
                    .forEach(x -> System.out.print(x + " "));
        }else {
            Arrays.stream(input)
                    .sorted((x1, x2) -> x2.compareToIgnoreCase(x1))
                    .forEach(x -> System.out.print(x + " "));
        }
    }
}
