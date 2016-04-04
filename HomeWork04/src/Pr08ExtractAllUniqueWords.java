import java.util.*;

/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr08ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String input = one.nextLine().toLowerCase();
        List<String> line = new ArrayList<>(Arrays.asList(input.split("\\W+")));
        Set<String> result = new TreeSet<>(line);
        Iterator<String> print = result.iterator();
        while(print.hasNext()){
        System.out.print(print.next() + " ");
        }
    }
}
