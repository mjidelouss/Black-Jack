package black.jack;

import static black.jack.Messages.showCard;

public class DealerService {

    public static int showDealerHand(int [][] cards) {
        System.out.println("Dealer Hand :");
        for (int[] card : cards) {
            int cardValue = card[0];
            int cardSuit = card[1];
            showCard(cardValue, cardSuit);
        }
        int dealerScore = calculateDealerScore(cards);
        System.out.print("\nDealer Score :\n");
        System.out.println(dealerScore);
        return dealerScore;
    }
    public static int calculateDealerScore(int[][] dealerHand) {
        int score = 0;
        int numAces = 0;
        for (int[] card : dealerHand) {
            int cardValue = card[0];
            if (cardValue >= 10) {
                score += 10;
            } else if (cardValue == 1) {
                score += 11;
                numAces++;
            } else {
                score += cardValue;
            }
        }
        while (score > 21 && numAces > 0) {
            score -= 10;
            numAces--;
        }
        return score;
    }


}
