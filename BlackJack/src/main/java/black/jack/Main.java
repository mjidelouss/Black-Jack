package black.jack;
import black.jack.Enums.Colors;
import java.util.*;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int [][] deck = creatDeckCards();
        for (int i = 0; i < deck.length; i++) {
            System.out.print("(" + deck[i][0] + " " + deck[i][1] + ")");
        }
        System.out.print("\n\n");
        deck = shuffleDeck(deck);
        for (int i = 0; i < deck.length; i++) {
            System.out.print("(" + deck[i][0] + " " + deck[i][1] + ")");
        }
    }

    public static int[][] creatDeckCards() {
        int [][] deck = new int [52][2];
        int index = 0;
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 13; j++) {
                deck[index][0] = j;
                deck[index][1] = i;
                index++;
            }
        }
        return deck;
    }

    public static int[][] constructDeckFromCard(int cardNumber, int suit) {
        int size = (13 - cardNumber + 1) + (4 - suit) * 13;
        int [][] newDeck = new int [size][2];
        int index = 0;
        for (int i = suit; i <= 4 ; i++) {
            for (int j = (suit == i) ? cardNumber : 1; j <= 13; j++) {
                newDeck[index][0] = j;
                newDeck[index][1] = i;
                index++;
            }
        }
        return newDeck;
    }

    public static List<int [][]> extractIndexCard(int [][] deck, int index) {
        int size = deck.length - 1;
        int[][] extractedCard = new int[1][2];
        int[][] remainingDeck = new int[size][2];
        int count = 0;
        extractedCard[0][0] = deck[index][0];
        extractedCard[0][1] = deck[index][1];
        for (int i = 0; i < deck.length; i++) {
            if (i != index) {
                remainingDeck[count][0] = deck[i][0];
                remainingDeck[count][1] = deck[i][1];
                count++;
            }
        }
        List<int[][]> result = new ArrayList<>();
        result.add(extractedCard);
        result.add(remainingDeck);
        return result;
    }

    public static List<int [][]> drawCard(int [][] deck) {
        int n = new Random().nextInt(deck.length);
        List<int [][]> resList = extractIndexCard(deck, n);
        return resList;
    }

    public static int[][] shuffleDeck(int [][] deck) {
        int [][] shuffledDeck = new int [deck.length][2];
        List<int [][]> cardList = drawCard(deck);
        int [][] newDeck = cardList.get(1);
        int count = 0;
        while (!cardList.isEmpty()) {
            shuffledDeck[count] = cardList.get(0)[0];
            if (newDeck.length == 0) {
                break;
            }
            cardList = drawCard(newDeck);
            newDeck = cardList.get(1);
            count++;
        }
        return shuffledDeck;
    }

    public static void art() {
        System.out.print("\n\n");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t                            ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀  ⠀            ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀    ⠀⠀⠀⠀⠀ ⣀⣤⣴⣄⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t                         ⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀            ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀  ⣠⣴⣾⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t                                ███████████  ████                     █████               █████                    █████⠀ ⠀⢿⣿⣿⣿⠛⠿⣿⣿⣿⡀⢻⣿⣿⣿⣿⠀⣸⣿⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t                              ░░███░░░░░███░░███                    ░░███               ░░███                    ░░███   ⠀ ⠀⠘⣿⣿⠃⠀⠀⠀⠈⠙⣧⠈⢿⣿⣿⣿⠀⣿⣿⣿⣿⡟⢀⡀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t                               ░███    ░███ ░███   ██████    ██████  ░███ █████          ░███   ██████    ██████  ░███ █████⠀⠀⢹⡇⠀⠀⠀⠀⣀⣠⣿⣇⠘⣿⣿⣿⠀⣿⣿⣿⡿⠀⣾⣿⣷⣄⠀⠀⠀\n" +
                '\t'+"\t\t                               ░██████████  ░███  ░░░░░███  ███░░███ ░███░░███           ░███  ░░░░░███  ███░░███ ░███░░███  ⠀⠀⠀⢿⣦⣤⣾⡆⣹⣿⣿⣿⡄⠹⣿⣿⠀⣿⣿⣿⠃⣸⣿⣿⣿⣿⣷⠀⠀\n" +
                '\t'+"\t\t                               ░███░░░░░███ ░███   ███████ ░███ ░░░  ░██████░            ░███   ███████ ░███ ░░░  ░██████░ ⠀ ⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⠗⢀⣿⡏⠀⣿⣿⡏⢠⣿⣿⣿⣿⠟⠁⠀⠀\n" +
                '\t'+"\t\t                               ░███░░░░░███ ░███   ███████ ░███ ░░░  ░██████░            ░███   ███████ ░███ ░░░  ░██████░⠀⠀  ⠀⠀⠀⠸⢿⠿⠟⠋⠉⠁⠀⠐⠚⠛⠃⣰⣿⡿⠀⣾⣿⣿⡿⠃⠀⠀⠀⠀\n" +
                '\t'+"\t\t                               ░███    ░███ ░███  ███░░███ ░███  ███ ░███░░███     ███   ░███  ███░░███ ░███  ███ ░███░░███ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠻⠿⠿⠃⣸⣿⣿⠋⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t                                ███████████  █████░░████████░░██████  ████ █████   ░░████████  ░░████████░░██████  ████ █████⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠢⣤⣾⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t                               ░░░░░░░░░░░  ░░░░░  ░░░░░░░░  ░░░░░░  ░░░░ ░░░░░     ░░░░░░░░    ░░░░░░░░  ░░░░░░  ░░░░ ░░░░░⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
    }
    public static void gameMenu() {
        System.out.print("\n\n\n");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ╔═░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░  ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░░ ░░ ░░ ░░═╗");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░                                                                                     ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░                                      BLACK JACK                                     ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░                                        HALALAL                                      ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░                                                                                     ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░                                                                                     ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░ (1) - Start Game.                                                                   ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░ (2) - Quit.                                                                         ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ░░                                                                                     ░░");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ╚═░░ ░░ ░░ ░░ ░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░═╝");
    }
}