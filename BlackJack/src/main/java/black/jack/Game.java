package black.jack;

import black.jack.Enums.Colors;

import java.util.Arrays;
import java.util.Scanner;

import static black.jack.CardService.*;
import static black.jack.CardService.draw_n_cards;
import static black.jack.DealerService.showDealerHand;
import static black.jack.Messages.*;
import static black.jack.PlayerService.hitOrStand;
import static black.jack.PlayerService.showPlayerHand;

public class Game {
    public static void startGame () throws InterruptedException {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        player.setBank(900);
        while (true) {
            gameMenu();
            System.out.print(Colors.RESET.getColor() +"\n\nEnter Your Choice : " + Colors.GREEN.getColor());
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int[][] deck = readyDeck();
                    clearScreen();
                    System.out.println("INITIALE DECK :");
                    System.out.println(Arrays.deepToString(deck));
                    playerBank(player.getBank());
                    Object[] result = playBlackjack(deck, player);
                    int [][] newdeck = (int [][]) result[1];
                    player.setBank((int) result[0]);
                    while (newdeck.length > 3) {
                        Object[] game = playBlackjack(newdeck, player);
                        newdeck = (int[][]) game[1];
                        System.out.println("NEW DECK :");
                        System.out.println(Arrays.deepToString(newdeck));
                        player.setBank((int) game[0]);
                    }
                    break;
                case 2:
                    gameRules();
                    break;
                case 3:
                    quitApp();
                    break;
                default:
                    System.out.println(Colors.RED.getColor() +"\n\nInvalid choice. Please try again.");
                    waitForEnter();
            }
        }
    }
    public static Object[] compareScores(int[][] deck, int[][] dealerHand, int [][]playerHand, int dealerScore, int playerScore, int bet, int count, Player player) throws InterruptedException {
        Object[] result = new Object[2];
        int bank = player.getBank();
        while (dealerScore < 17) {
            int[][][] drawResult = draw_n_cards(deck, 1);
            int[][] newCard = drawResult[0];
            deck = drawResult[1];
            boolean show = true;
            count++;
            dealerHand = discardCards(dealerHand, newCard);
            playerScore = showPlayerHand(playerHand);
            dealerScore = showDealerHand(dealerHand, playerScore, show);
        }
        if (count == 1) {
            boolean show = true;
            playerScore = showPlayerHand(playerHand);
            dealerScore = showDealerHand(dealerHand, playerScore, show);
        }
        if (dealerScore > 21) {
            winMessage();
            bet = bet * 2;
            player.setBank(bank += bet);
            waitForEnter();
        } else {
            if (dealerScore == playerScore) {
                tieMessage();
                waitForEnter();
            } else if (dealerScore < playerScore && playerScore <= 21) {
                winMessage();
                bet = bet * 2;
                player.setBank(bank += bet);
                waitForEnter();
            } else {
                loseMessage();
                player.setBank(bank -= bet);
                waitForEnter();
            }
        }
        result[0] = player.getBank();
        result[1] = deck;
        return result;
    }
    public static int betOptions() throws InterruptedException {
        betMoney();
        int bet = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(Colors.RESET.getColor() + "\n\nEnter Your Choice : " + Colors.GREEN.getColor());
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                bet += 1;
                break;
            case 2:
                bet += 5;
                break;
            case 3:
                bet += 25;
                break;
            case 4:
                bet += 50;
                break;
            case 5:
                bet += 100;
                break;
            case 6:
                bet += 500;
                break;
            default:
                System.out.println(Colors.RED.getColor() + "\n\nInvalid choice. Please try again.");
                waitForEnter();
        }
        return bet;
    }
    public static Object[] playBlackjack(int [][] deck, Player player) throws InterruptedException {
        Object[] result = new Object[2];
        int bet = betOptions();

        // Initialize player and dealer hands
        int[][] playerHand;
        int[][] dealerHand;

        // Deal the initial cards
        int[][][] dealResult = draw_n_cards(deck, 2);
        playerHand = dealResult[0];
        deck = dealResult[1];

        dealResult = draw_n_cards(deck, 2);
        dealerHand = dealResult[0];
        deck = dealResult[1];
        int count = 0;
        boolean show = false;
        int playerScore = showPlayerHand(playerHand);
        int dealerScore = showDealerHand(dealerHand, playerScore, show);
        result = hitOrStand(deck, playerHand, dealerHand, playerScore, dealerScore, bet, count, player);
        player.setBank((int)result[0]);
        playerBank(player.getBank());
        return result;
    }
}
