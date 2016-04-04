import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr07CombineListOfLetters {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String[] firstInput = one.nextLine().split(" ");
        String[] secondInput = one.nextLine().split(" ");
        ArrayList<Character> firstList = new ArrayList<>();
        ArrayList<Character> secondList = new ArrayList<>();
        for (int i = 0; i < firstInput.length; i++) {
            firstList.add(firstInput[i].charAt(0));
        }
        for (int i = 0; i < secondInput.length; i++) {
            secondList.add(secondInput[i].charAt(0));
        }
        for (Character character : secondList) {
            if (!firstList.contains(character)){
                firstList.add(character);
            }
        }
        for (Character ch : firstList) {
            System.out.print(ch + " ");
        }

    }
}
