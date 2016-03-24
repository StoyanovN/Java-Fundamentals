import java.util.Scanner;

/**
 * Created by NRG on 22.3.2016 г..
 */
public class Pr09HitTheTarget {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number = one.nextInt();
        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if (i + j == number){
                    System.out.printf("%d + %d = %d\n", i, j, number);
                }
                if (i - j == number){
                    System.out.printf("%d - %d = %d\n", i, j, number);
                }
            }
        }
    }
}
