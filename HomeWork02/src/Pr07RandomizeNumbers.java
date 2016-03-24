import java.util.*;

/**
 * Created by NRG on 21.3.2016 г..
 */
public class Pr07RandomizeNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner one = new Scanner(System.in);
        int n = one.nextInt();
        int m = one.nextInt();
        if (n == m){
            System.out.println(n);
        } else{

            int numberMin = Math.min(n, m);
            int numberMax = Math.max(n, m);
            List<Integer> result = new ArrayList<>();

            for (int i = numberMin; i <= numberMax; i++) {
                result.add(i);
            }
            Collections.shuffle(result);
            for (int x : result) {
                System.out.print(x + " ");
            }
        }

    }
}
