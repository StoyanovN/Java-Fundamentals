import java.util.Scanner;

/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr05CountAllWords {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String[] input = one.nextLine().split("\\W+");

        System.out.println(input.length);
    }
}
