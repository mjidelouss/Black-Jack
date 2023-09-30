package black.jack;

import black.jack.Enums.Colors;

import java.util.Scanner;

import static black.jack.CardService.*;
import static black.jack.CardService.draw_n_cards;
import static black.jack.DealerService.showDealerHand;
import static black.jack.Messages.*;
import static black.jack.PlayerService.hitOrStand;
import static black.jack.PlayerService.showPlayerHand;

public class Game {
    public static void startGame () throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            gameMenu();
            System.out.print(Colors.RESET.getColor() +"\n\nEnter Your Choice : " + Colors.GREEN.getColor());
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    clearScreen();
                    playBlackjack();
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
    public static int compareScores(int[][] deck, int[][] dealerHand, int [][]playerHand, int dealerScore, int playerScore, int bet, int bank) throws InterruptedException {
        while (dealerScore < 17) {
            int[][][] drawResult = draw_n_cards(deck, 1);
            int[][] newCard = drawResult[0];
            deck = drawResult[1];
            dealerHand = discardCards(dealerHand, newCard);
            playerScore = showPlayerHand(playerHand);
            dealerScore = showDealerHand(dealerHand);
        }
        if (dealerScore > 21) {
            winMessage();
            bet *= 2;
            bank += bet;
            waitForEnter();
        } else {
            if (dealerScore == playerScore) {
                tieMessage();
                waitForEnter();
            } else if (dealerScore < playerScore && playerScore <= 21) {
                winMessage();
                bet *= 2;
                bank += bet;
                waitForEnter();
            } else {
                loseMessage();
                bank -= bet;
                waitForEnter();
            }
        }
        return bank;
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
    public static void playBlackjack() throws InterruptedException {
        int bank = 900;
        playerBank(bank);
        int bet = betOptions();
        int[][] deck = readyDeck();

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
        int playerScore = showPlayerHand(playerHand);
        int dealerScore = showDealerHand(dealerHand);
        bank = hitOrStand(deck, playerHand, dealerHand, playerScore, dealerScore, bet, bank);
        playerBank(bank);
    }
}
