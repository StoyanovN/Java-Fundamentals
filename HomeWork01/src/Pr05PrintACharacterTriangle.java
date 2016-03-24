import java.util.Scanner;

/**
 * Created by NRG on 17.3.2016 г..
 */
public class Pr05PrintACharacterTriangle {
    public static void main(String args[]){
        Scanner one = new Scanner(System.in);
        int number = Integer.parseInt(one.nextLine());
        number += 96;
        char letter = (char)number;
        for (char i = 'a'; i <= letter; i++) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (char k = (char)(letter-1); k >= 'a'; k--) {
            for (char c = 'a'; c <= k; c++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
