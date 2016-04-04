import java.util.Scanner;

/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr06CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String line = one.nextLine().toLowerCase();
        String word = one.next();
        String[] input = line.split("\\W+");
        int count = 0;
        for (int i = 0; i < input.length ; i++) {
            if (input[i].equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
