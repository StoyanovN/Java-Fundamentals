import java.util.*;

/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr09MostFrequentWord {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String[] words = one.nextLine().toLowerCase().split("\\W+");
        List<String> result = new ArrayList<>();
        int bestCount = 1;
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int currentCount = 1;
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                String checkedWord = words[j];
                if (checkedWord.equals(currentWord)) {
                    currentCount++;
                }
            }
            if (currentCount > bestCount) {
                bestCount = currentCount;
                result.clear();
                result.add(currentWord);
            }
            if (currentCount == bestCount) {
                if (!result.contains(currentWord)) {
                    result.add(currentWord);
                }
            }
        }
        Collections.sort(result);
        for (String word : result) {
            System.out.printf("%s -> %d times\n", word, bestCount);
        }
    }
}
