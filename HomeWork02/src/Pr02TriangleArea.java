import java.util.Scanner;

/**
 * Created by NRG on 21.3.2016 г..
 */
public class Pr02TriangleArea {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int ax = one.nextInt();
        int ay = one.nextInt();
        int bx = one.nextInt();
        int by = one.nextInt();
        int cx = one.nextInt();
        int cy = one.nextInt();
        double area = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by))/2;
        area = Math.abs(area);
        int result = (int)area;
        System.out.println(result);
    }
}