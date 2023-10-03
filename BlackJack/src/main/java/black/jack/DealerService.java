package black.jack;

import static black.jack.Messages.showCards;
import static black.jack.Messages.showCardsWithBack;

public class DealerService {

    public static int showDealerHand(int [][] cards, int playerScore, boolean show) {
        int dealerScore = calculateDealerScore(cards);
        System.out.println("Dealer Hand :");
        if (playerScore > 21 || (dealerScore >= 17 && show)) {
            showCards(cards);
        } else {
            showCardsWithBack(cards);
        }
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
