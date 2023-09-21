package black.jack;
import black.jack.Enums.Colors;
import java.util.*;
import java.util.function.Supplier;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int [][] deck = creatDeckCards();
        int [][] newDeck = constructDeckFromCard(8,4);
        for (int i = 0; i < deck.length; i++) {
            System.out.print("(" + deck[i][0] + " " + deck[i][1] + ")");
        }
        System.out.print("\n\n");
        for (int i = 0; i < newDeck.length; i++) {
            System.out.print("(" + newDeck[i][0] + " " + newDeck[i][1] + ")");
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
            for (int j = cardNumber; j <= 13; j++) {
                newDeck[index][0] = j;
                newDeck[index][1] = i;
                index++;
            }
        }
        return newDeck;
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