package black.jack;
import black.jack.Enums.Colors;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        art();
        gameMenu();
    }

    public static void startGame () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            gameMenu();
            System.out.print(Colors.RESET.getColor() +"\n\nEnter Your Choice : " + Colors.GREEN.getColor());
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

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
            cardNumber = 1;
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

    public static List<int[][]> draw_n_cards(int[][] deck, int n) {
        List<int[][]> result = new ArrayList<>();
        int size = deck.length;

        if (n >= size) {
            result.add(deck);
            result.add(new int[0][2]);
        } else {
            int[][] drawnCards = new int[n][2];
            int[][] remainingCards = new int[size - n][2];

            for (int i = 0; i < n; i++) {
                drawnCards[i][0] = deck[i][0];
                drawnCards[i][1] = deck[i][1];
            }

            for (int i = n; i < size; i++) {
                remainingCards[i - n][0] = deck[i][0];
                remainingCards[i - n][1] = deck[i][1];
            }
            result.add(drawnCards);
            result.add(remainingCards);
        }

        return result;
    }

    public static int [][] discardCards(int [][] stack, int [][] discardedCards) {
        int size = stack.length + discardedCards.length;
        int [][] deck = new int [size][2];
        int i;
        int sizeOfDiscardedCards = discardedCards.length;
        for (i = 0; i < stack.length; i++) {
            deck[i][0] = stack[i][0];
            deck[i][1] = stack[i][1];
        }
        for (int j = 0; j < discardedCards.length; j++) {
            deck[i][0] = discardedCards[j][0];
            deck[i][1] = discardedCards[j][1];
            i++;
        }
        return deck;
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
    public static void art() throws InterruptedException {
        System.out.print("\n\n");
        String lines[] = {
                '\t'+"\t\t       "+ Colors.RESET.getColor() +"                     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀  ⠀            ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀    ⠀⠀⠀⠀⠀ ⣀⣤⣴⣄⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t         "+ Colors.RESET.getColor() +"                ⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀            ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀  ⣠⣴⣾⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t  "+ Colors.RED.getColor() +"                              ███████████  ████                     █████               █████                    █████⠀ "+ Colors.RESET.getColor() +"⠀⢿⣿⣿⣿⠛⠿⣿⣿⣿⡀⢻⣿⣿⣿⣿⠀⣸⣿⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t    "+ Colors.RED.getColor() +"                          ░░███░░░░░███░░███                    ░░███               ░░███                    ░░███   ⠀ "+ Colors.RESET.getColor() +"⠀⠘⣿⣿⠃⠀⠀⠀⠈⠙⣧⠈⢿⣿⣿⣿⠀⣿⣿⣿⣿⡟⢀⡀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t      "+ Colors.RED.getColor() +"                         ░███    ░███ ░███   ██████    ██████  ░███ █████          ░███   ██████    ██████  ░███ █████⠀"+ Colors.RESET.getColor() +"⠀⢹⡇⠀⠀⠀⠀⣀⣠⣿⣇⠘⣿⣿⣿⠀⣿⣿⣿⡿⠀⣾⣿⣷⣄⠀⠀⠀\n" +
                '\t'+"\t\t     "+ Colors.RED.getColor() +"                          ░██████████  ░███  ░░░░░███  ███░░███ ░███░░███           ░███  ░░░░░███  ███░░███ ░███░░███  ⠀"+ Colors.RESET.getColor() +"⠀⠀⢿⣦⣤⣾⡆⣹⣿⣿⣿⡄⠹⣿⣿⠀⣿⣿⣿⠃⣸⣿⣿⣿⣿⣷⠀⠀\n" +
                '\t'+"\t\t       "+ Colors.RED.getColor() +"                        ░███░░░░░███ ░███   ███████ ░███ ░░░  ░██████░            ░███   ███████ ░███ ░░░  ░██████░ ⠀ ⠀"+ Colors.RESET.getColor() +"⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⠗⢀⣿⡏⠀⣿⣿⡏⢠⣿⣿⣿⣿⠟⠁⠀⠀\n" +
                '\t'+"\t\t        "+ Colors.RED.getColor() +"                       ░███░░░░░███ ░███   ███████ ░███ ░░░  ░██████░            ░███   ███████ ░███ ░░░  ░██████░⠀⠀  ⠀⠀"+ Colors.RESET.getColor() +"⠀⠸⢿⠿⠟⠋⠉⠁⠀⠐⠚⠛⠃⣰⣿⡿⠀⣾⣿⣿⡿⠃⠀⠀⠀⠀\n" +
                '\t'+"\t\t        "+ Colors.RED.getColor() +"                       ░███    ░███ ░███  ███░░███ ░███  ███ ░███░░███     ███   ░███  ███░░███ ░███  ███ ░███░░███ ⠀⠀⠀⠀⠀⠀"+ Colors.RESET.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠻⠿⠿⠃⣸⣿⣿⠋⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t        "+ Colors.RED.getColor() +"                        ███████████  █████░░████████░░██████  ████ █████   ░░████████  ░░████████░░██████  ████ █████⠀⠀⠀⠀⠀"+ Colors.RESET.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠢⣤⣾⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                '\t'+"\t\t         "+ Colors.RED.getColor() +"                      ░░░░░░░░░░░  ░░░░░  ░░░░░░░░  ░░░░░░  ░░░░ ░░░░░     ░░░░░░░░    ░░░░░░░░  ░░░░░░  ░░░░ ░░░░░⠀⠀⠀⠀⠀⠀"+ Colors.RESET.getColor() +"⠀⠀⠀⠀     ⠀⠀⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
        };
        for (String line : lines) {
            System.out.println(line);
            Thread.sleep(300);
        }
    }
    public static void gameMenu() {
        System.out.print("\n\n\n");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                  🅱🅻🅰🅲🅺 🅹🅰🅲🅺                                ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                     ♣️ ♥️ ♠️ ♦️                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️  ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (1) - Start Game.                                                                ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (2) - Rules.                                                                     ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (3) - Quit.                                                                      ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
    }
    public static playerOptions() {
        System.out.print("\n\n\n");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                  🅱🅻🅰🅲🅺 🅹🅰🅲🅺                                ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                     ♣️ ♥️ ♠️ ♦️                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️  ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (1) - Hit.                                                                       ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (2) - Stand.                                                                     ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                  ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
    }

    public static gameRules() {
        System.out.print("\n\n\n");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                                       ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                🅡🅤🅛🅔🅢                                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                               ♣️ ♥️ ♠️ ♦️                                             ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                                       ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️  ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                                       ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Aim for 21: Get as close to 21 as possible without going over.                                      ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Card Values: Numbered cards are face value, face cards are worth 10, and Aces can be 1 or 11.       ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Player's Turn: Choose to -Hit- for another card or -Stand- to keep your current hand.               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Dealer's Turn: The dealer draws cards until they reach a total of 17 or higher.                     ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Win Conditions: If your hand is closer to 21 than the dealer's, you win. Don't go over 21 (bust)!   ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Blackjack: An Ace and a 10-value card give you an automatic win.                                    ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Options: You can -Double Down- to double your bet or -Split- pairs into separate hands.             ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Insurance: If the dealer's visible card is an Ace, you can take insurance to protect your bet.      ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Push: If your hand value matches the dealer's, it's a tie (push), and your bet is returned.         ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ - Enjoy the Game: Have fun playing blackjack and try to beat the dealer!                              ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                                                       ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println(Colors.RESET.getColor() + "\nPress Enter to continue...\n");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        gameMenu();
    }

    public static void quitApp() throws InterruptedException {
        String[] lines = {
                "\n\n\n\n\n\n",
                '\t'+ Colors.GREEN.getColor() +"                                                                 ██████╗  ██████╗  ██████╗ ██████╗ ██████╗ ██╗   ██╗███████╗    ██╗",
                '\t'+ Colors.GREEN.getColor() +"                                                                ██╔════╝ ██╔═══██╗██╔═══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝██╔════╝    ██║",
                '\t'+ Colors.GREEN.getColor() +"                                                                ██║  ███╗██║   ██║██║   ██║██║  ██║██████╔╝ ╚████╔╝ █████╗      ██║",
                '\t'+ Colors.GREEN.getColor() +"                                                                ██║   ██║██║   ██║██║   ██║██║  ██║██╔══██╗  ╚██╔╝  ██╔══╝      ╚═╝",
                '\t'+ Colors.GREEN.getColor() +"                                                                ╚██████╔╝╚██████╔╝╚██████╔╝██████╔╝██████╔╝   ██║   ███████╗    ██╗",
                '\t'+ Colors.GREEN.getColor() +"                                                                 ╚═════╝  ╚═════╝  ╚═════╝ ╚═════╝ ╚═════╝    ╚═╝   ╚══════╝    ╚═╝",
        };
        for (String line : lines) {
            System.out.println(line);
            Thread.sleep(220); // Sleep for 500 milliseconds between lines
        }
        System.exit(0);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void waitForEnter() {
        System.out.println(Colors.RESET.getColor() + "\nPress Enter to continue...\n");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

}