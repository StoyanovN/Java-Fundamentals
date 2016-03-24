import java.util.Scanner;

/**
 * Created by NRG on 21.3.2016 г..
 */
public class Pr01RectangleArea {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int sideOne = one.nextInt();
        int sideTwo = one.nextInt();
        int area = sideOne*sideTwo;
        System.out.println(area);
    }
}
