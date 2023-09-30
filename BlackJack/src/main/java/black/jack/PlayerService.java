package black.jack;

import black.jack.Enums.Colors;
import java.util.Scanner;
import static black.jack.CardService.discardCards;
import static black.jack.CardService.draw_n_cards;
import static black.jack.DealerService.showDealerHand;
import static black.jack.Game.compareScores;
import static black.jack.Main.*;
import static black.jack.Messages.*;

public class PlayerService {

    public static int showPlayerHand(int [][] cards) {
        System.out.println("Player Hand :");
        for (int[] card : cards) {
            int cardValue = card[0];
            int cardSuit = card[1];
            showCard(cardValue, cardSuit);
        }
        int playerScore = calculatePlayerScore(cards);
        System.out.print("\nPlayer Score :\n");
        System.out.println(playerScore);
        return playerScore;
    }
    public static int calculatePlayerScore(int[][] playerHand) {
        int score = 0;
        int numAces = 0;
        for (int[] card : playerHand) {
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
    public static int playerHit(int[][] deck, int[][] dealerHand, int[][] playerHand, int dealerScore, int playerScore, int bet, int bank) throws InterruptedException {
        if (playerScore > 21) {
            loseMessage();
            bank -= bet;
            waitForEnter();
        } else {
            hitOrStand(deck, playerHand, dealerHand, playerScore, dealerScore, bet, bank);
        }
        return bank;
    }

    public static int hitOrStand(int[][] deck, int[][] playerHand, int[][] dealerHand, int playerScore, int dealerScore, int bet, int bank) throws InterruptedException {
        playerOptions();
        Scanner scanner = new Scanner(System.in);
        System.out.print(Colors.RESET.getColor() + "\n\nEnter Your Choice : " + Colors.GREEN.getColor());
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int[][][] drawResult = draw_n_cards(deck, 1);
                int[][] newCard = drawResult[0];
                deck = drawResult[1];
                playerHand = discardCards(playerHand, newCard);
                playerScore = showPlayerHand(playerHand);
                dealerScore = showDealerHand(dealerHand);
                bank = playerHit(deck, dealerHand, playerHand, dealerScore, playerScore, bet, bank);
                break;
            case 2:
                bank = compareScores(deck, dealerHand, playerHand, dealerScore, playerScore, bet, bank);
                break;
            default:
                System.out.println(Colors.RED.getColor() + "\n\nInvalid choice. Please try again.");
                waitForEnter();
        }
        return bank;
    }

}
