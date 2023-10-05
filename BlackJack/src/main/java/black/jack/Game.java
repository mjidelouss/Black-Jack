package black.jack;

import black.jack.Enums.Colors;
import black.jack.Services.CardService;
import black.jack.Services.DealerService;
import black.jack.Services.PlayerService;

import java.util.Scanner;
import static black.jack.Messages.*;

public class Game {
    public static void startGame () throws InterruptedException {
        Player player = new Player();
        CardService cardService = new CardService();
        Scanner scanner = new Scanner(System.in);
        player.setBank(900);
        player.setLoseCount(0);
        player.setWinCount(0);
        player.setTieCount(0);
        while (true) {
            gameMenu();
            System.out.print(Colors.RESET.getColor() +"\n\nEnter Your Choice : " + Colors.GREEN.getColor());
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int[][] deck = cardService.readyDeck();
                    clearScreen();
                    playerBank(player.getBank());
                    Object[] result = playBlackjack(deck, player);
                    int [][] newdeck = (int [][]) result[1];
                    player.setBank((int) result[0]);
                    while (newdeck.length > 3) {
                        Object[] game = playBlackjack(newdeck, player);
                        newdeck = (int[][]) game[1];
                        player.setBank((int) game[0]);
                    }
                    playerStatistiques(player);
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
        CardService cardService = new CardService();
        PlayerService playerService = new PlayerService();
        DealerService dealerService = new DealerService();
        int bank = player.getBank();
        int winCount;
        int loseCount;
        int tieCount;
        while (dealerScore < 17) {
            int[][][] drawResult = cardService.draw_n_cards(deck, 1);
            int[][] newCard = drawResult[0];
            deck = drawResult[1];
            boolean show = true;
            count++;
            dealerHand = cardService.discardCards(dealerHand, newCard);
            playerScore = playerService.showPlayerHand(playerHand);
            dealerScore = dealerService.showDealerHand(dealerHand, playerScore, show);
        }
        if (count == 1) {
            boolean show = true;
            playerScore = playerService.showPlayerHand(playerHand);
            dealerScore = dealerService.showDealerHand(dealerHand, playerScore, show);
        }
        if (dealerScore > 21) {
            winMessage();
            bet = bet * 2;
            player.setBank(bank += bet);
            winCount = player.getWinCount() + 1;
            player.setWinCount(winCount);
            waitForEnter();
        } else {
            if (dealerScore == playerScore) {
                tieMessage();
                tieCount = player.getTieCount() + 1;
                player.setTieCount(tieCount);
                waitForEnter();
            } else if (dealerScore < playerScore && playerScore <= 21) {
                winMessage();
                bet = bet * 2;
                player.setBank(bank += bet);
                winCount = player.getWinCount() + 1;
                player.setWinCount(winCount);
                waitForEnter();
            } else {
                loseMessage();
                player.setBank(bank -= bet);
                loseCount = player.getLoseCount() + 1;
                player.setLoseCount(loseCount);
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
        CardService cardService = new CardService();
        PlayerService playerService = new PlayerService();
        DealerService dealerService = new DealerService();
        int bet = betOptions();

        // Initialize player and dealer hands
        int[][] playerHand;
        int[][] dealerHand;

        // Deal the initial cards
        int[][][] dealResult = cardService.draw_n_cards(deck, 2);
        playerHand = dealResult[0];
        deck = dealResult[1];

        dealResult = cardService.draw_n_cards(deck, 2);
        dealerHand = dealResult[0];
        deck = dealResult[1];
        int count = 0;
        boolean show = false;
        int playerScore = playerService.showPlayerHand(playerHand);
        int dealerScore = dealerService.showDealerHand(dealerHand, playerScore, show);
        result = playerService.hitOrStand(deck, playerHand, dealerHand, playerScore, dealerScore, bet, count, player);
        player.setBank((int)result[0]);
        playerBank(player.getBank());
        return result;
    }
}
