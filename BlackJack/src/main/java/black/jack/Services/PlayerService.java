package black.jack.Services;

import black.jack.Enums.Colors;
import black.jack.Player;
import black.jack.Services.CardService;
import black.jack.Services.DealerService;

import java.util.Scanner;
import static black.jack.Game.compareScores;
import static black.jack.Messages.*;

public class PlayerService {

    public int showPlayerHand(int [][] cards) {
        System.out.println(Colors.RESET.getColor() +"Player Hand :");
        showCards(cards);
        int playerScore = calculatePlayerScore(cards);
        System.out.print(Colors.RESET.getColor() +"\nPlayer Score : "+ Colors.GREEN.getColor() + + playerScore + "\n\n");
        return playerScore;
    }
    public int calculatePlayerScore(int[][] playerHand) {
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
    public Object[] playerHit(int[][] deck, int[][] dealerHand, int[][] playerHand, int dealerScore, int playerScore, int bet, int count, Player player) throws InterruptedException {
        Object[] result = new Object[2];
        int bank = player.getBank();
        int loseCount;
        if (playerScore > 21) {
            loseMessage();
            player.setBank(bank -= bet);
            loseCount = player.getLoseCount() + 1;
            player.setLoseCount(loseCount);
            waitForEnter();
        } else {
            hitOrStand(deck, playerHand, dealerHand, playerScore, dealerScore, bet, count, player);
        }
        result[0] = player.getBank();
        result[1] = deck;
        return result;
    }

    public Object[] hitOrStand(int[][] deck, int[][] playerHand, int[][] dealerHand, int playerScore, int dealerScore, int bet, int count, Player player) throws InterruptedException {
        Object[] result = new Object[2];
        CardService cardService = new CardService();
        DealerService dealerService = new DealerService();
        playerOptions();
        count++;
        Scanner scanner = new Scanner(System.in);
        System.out.print(Colors.RESET.getColor() + "\n\nEnter Your Choice : " + Colors.GREEN.getColor());
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int[][][] drawResult = cardService.draw_n_cards(deck, 1);
                int[][] newCard = drawResult[0];
                deck = drawResult[1];
                boolean show = false;
                playerHand = cardService.discardCards(playerHand, newCard);
                playerScore = showPlayerHand(playerHand);
                dealerScore = dealerService.showDealerHand(dealerHand, playerScore, show);
                result = playerHit(deck, dealerHand, playerHand, dealerScore, playerScore, bet, count, player);
                break;
            case 2:
                result = compareScores(deck, dealerHand, playerHand, dealerScore, playerScore, bet, count, player);
                break;
            default:
                System.out.println(Colors.RED.getColor() + "\n\nInvalid choice. Please try again.");
                waitForEnter();
        }
        return result;
    }

}
