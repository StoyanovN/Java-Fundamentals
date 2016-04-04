import java.util.*;

/**
 * Created by NRG on 30.3.2016 г..
 */
public class Pr10CardsFrequencies {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
      List<String> cards = Arrays.asList((one.nextLine().split(" ")));
        Map<String, Double> cardsFrequency = new LinkedHashMap<>();
        for (int i = 0; i < cards.size(); i++) {
            String currentCard = cards.get(i).substring(0, cards.get(i).length() - 1);
            double currentCardCount = 1;
            if (cardsFrequency.containsKey(currentCard)) {
                continue;
            }
            for (int j = 0; j < cards.size(); j++) {
                String checkedCard = cards.get(j).substring(0, cards.get(j).length() - 1);
                if (i == j ) {
                    continue;
                }
                if (currentCard.equals(checkedCard)) {
                    currentCardCount++;
                }
            }
            cardsFrequency.put(currentCard, currentCardCount / cards.size() * 100);
        }
        for (Map.Entry<String, Double> pair : cardsFrequency.entrySet()) {
            System.out.printf("%s -> %.2f%%\n", pair.getKey(), pair.getValue());
        }
    }
}
