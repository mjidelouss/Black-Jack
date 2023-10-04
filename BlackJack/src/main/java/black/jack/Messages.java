package black.jack;

import black.jack.Enums.Colors;

import java.util.Scanner;

public class Messages {
    public static void art() throws InterruptedException {
        System.out.print("\n\n");
        String lines[] = {
                '\t'+"\t\t       "+ Colors.RESET.getColor() +"                     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀  ⠀            ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀  ⠀     ⠀⠀⠀    ⠀⠀⠀            ⣀⣤⣴⣄⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t         "+ Colors.RESET.getColor() +"                ⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀            ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀     ⠀⠀⠀          ⣠⣴⣾⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t  "+ Colors.RED.getColor() +"                              ███████████  ████                     █████      "+ Colors.RESET.getColor() +"         █████                    █████⠀ "+ Colors.BROWN.getColor() +"⠀⢿⣿⣿⣿⠛⠿⣿⣿⣿⡀⢻⣿⣿⣿⣿⠀⣸⣿⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t    "+ Colors.RED.getColor() +"                          ░░███░░░░░███░░███                    ░░███          "+ Colors.RESET.getColor() +"     ░░███                    ░░███   ⠀ "+ Colors.BROWN.getColor() +"⠀⠘⣿⣿⠃⠀⠀⠀⠈⠙⣧⠈⢿⣿⣿⣿⠀⣿⣿⣿⣿⡟⢀⡀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t      "+ Colors.RED.getColor() +"                         ░███    ░███ ░███   ██████    ██████  ░███ █████    "+ Colors.RESET.getColor() +"      ░███   ██████    ██████  ░███ █████⠀"+ Colors.BROWN.getColor() +"⠀⢹⡇⠀⠀⠀⠀⣀⣠⣿⣇⠘⣿⣿⣿⠀⣿⣿⣿⡿⠀⣾⣿⣷⣄⠀⠀⠀\n" +
                        '\t'+"\t\t     "+ Colors.RED.getColor() +"                          ░██████████  ░███  ░░░░░███  ███░░███ ░███░░███     "+ Colors.RESET.getColor() +"      ░███  ░░░░░███  ███░░███ ░███░░███  ⠀"+ Colors.BROWN.getColor() +"⠀⠀⢿⣦⣤⣾⡆⣹⣿⣿⣿⡄⠹⣿⣿⠀⣿⣿⣿⠃⣸⣿⣿⣿⣿⣷⠀⠀\n" +
                        '\t'+"\t\t       "+ Colors.RED.getColor() +"                        ░███░░░░░███ ░███   ███████ ░███ ░░░  ░██████░     "+ Colors.RESET.getColor() +"       ░███   ███████ ░███ ░░░  ░██████░ ⠀ ⠀"+ Colors.BROWN.getColor() +"⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⠗⢀⣿⡏⠀⣿⣿⡏⢠⣿⣿⣿⣿⠟⠁⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.RED.getColor() +"                       ░███░░░░░███ ░███   ███████ ░███ ░░░  ░██████░   "+ Colors.RESET.getColor() +"         ░███   ███████ ░███ ░░░  ░██████░⠀⠀  ⠀⠀"+ Colors.BROWN.getColor() +"⠀⠸⢿⠿⠟⠋⠉⠁⠀⠐⠚⠛⠃⣰⣿⡿⠀⣾⣿⣿⡿⠃⠀⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.RED.getColor() +"                       ░███    ░███ ░███  ███░░███ ░███  ███ ░███░░███   "+ Colors.RESET.getColor() +"  ███   ░███  ███░░███ ░███  ███ ░███░░███ ⠀⠀⠀⠀⠀⠀"+ Colors.BROWN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠻⠿⠿⠃⣸⣿⣿⠋⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.RED.getColor() +"                        ███████████  █████░░████████░░██████  ████ █████  "+ Colors.RESET.getColor() +" ░░████████  ░░████████░░██████  ████ █████⠀⠀⠀⠀⠀"+ Colors.BROWN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠢⣤⣾⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t         "+ Colors.RED.getColor() +"                      ░░░░░░░░░░░  ░░░░░  ░░░░░░░░  ░░░░░░  ░░░░ ░░░░░   "+ Colors.RESET.getColor() +"  ░░░░░░░░    ░░░░░░░░  ░░░░░░  ░░░░ ░░░░░⠀⠀⠀⠀⠀⠀"+ Colors.BROWN.getColor() +"⠀⠀⠀⠀     ⠀⠀⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
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
    public static void playerOptions() {
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

    public static void gameRules() {
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
    }

    public static void betMoney() throws InterruptedException {
        System.out.print("\n\n\n");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                        🅱🅴🆃                                   ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                     ♣️ ♥️ ♠️ ♦️                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️  ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (1) - 💸 Bet 1$                                                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (2) - 💸 Bet 5$       ◼️                                                       ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (3) - 💸 Bet 25$                                                              ◼️️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (4) - 💸 Bet 50$                   ◼️                                          ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (5) - 💸 Bet 100$                                                             ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ (6) - 💸 Bet 500$                                                             ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
    }

    public static void playerBank(int bank) throws InterruptedException {
        System.out.print("\n");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                       🅑🅐🅝🅚                                   ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                    ♣️ ♥️ ♠️ ♦️                                ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️  ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️                                                                               ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ Bank :  "+bank+" 💸                                                                ◼️");
        System.out.println('\t'+ Colors.RESET.getColor() +"\t                                            ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️ ◼️");
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

    public static void winMessage() throws InterruptedException {
        System.out.print("\n\n");
        String lines[] = {
                '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣷⡀⣀⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⡟⢿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⢀⣀⣤⣴⣦⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⡟⣜⣣⠞⣿⣿⣿⡿⣟⡟⣻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣙⢦⣇⠻⡴⣛⣿⡵⢎⡼⣱⡚⣼⢻⣿⣿⡟⡽⣛⠿⣿⣿⣿⣷⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⡳⣜⢺⡬⢏⡵⢣⡝⣹⢎⡵⢣⡝⢦⡛⡼⣻⣿⡵⣩⢞⡹⢿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⡜⣣⢳⢎⡳⣬⢓⡳⢎⡻⣜⡲⡹⡥⢏⡞⣥⠻⣔⡛⢦⡻⣌⢏⡞⡼⣿⣿⣿⣧⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣥⣋⢮⠵⣊⢧⡛⡼⡱⢎⡵⢳⢭⡓⡞⣥⢻⡜⣹⢣⠗⣮⢹⡜⣱⢿⣿⣿⣿⣿⣿⣿⣷⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣷⣎⢧⢫⡝⢶⣹⡱⢏⡽⢪⣝⡲⢽⡱⣋⢶⡩⢇⣏⠾⣡⣛⢼⣣⢞⡻⢿⡻⣟⢿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣮⡓⢮⣓⢦⠽⣩⢞⣣⠮⡕⣧⢳⣭⣶⣿⣿⣾⣧⣷⣬⠳⡭⢎⡵⣋⠶⣍⠮⣽⣿⣿⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣯⣷⣾⣮⣳⣧⣞⣦⣿⣽⣾⠿⠛⠋⠉⠀⠀⠉⠙⣿⣟⡼⣩⠞⣭⢓⡮⣽⣾⣿⣿⣿⣃⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⡿⠿⠟⠛⠃⠀⠀⠀⠀⣀⣀⣤⣤⡀⠈⣿⣧⢇⢾⡠⣞⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣹⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣾⣽⡿⢿⣾⣿⣿⠿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣶⡀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⡟⠁⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⠿⠋⠀⢀⣿⠃⠀⠀⠀⠁⠀⢀⣠⣤⣶⣶⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣆⠀⠀⣀⣴⣾⠿⠋⣡⣾⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣶⣿⣿⣏⣀⣴⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⣏⢧⢫⢟⡻⢏⡽⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⢏⡗⣺⢬⡓⣮⠳⣭⢲⢻⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⡮⡼⡱⣎⠵⣎⢽⠲⣍⢯⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⡟⣜⡳⢵⢪⠽⣘⠮⣝⡜⣾⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⢵⣊⣿⢥⡫⡝⣥⣛⣾⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣟⢦⣋⡟⡶⣱⢋⡶⣹⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣷⣭⡚⡵⢣⢏⡖⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣷⣿⡼⣭⣾⣾⡿⢻⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⠛⠉⠁⠀⢸⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⠀⢀⣴⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣶⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⢻⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⢸⣿⣿⣿⠀⠀⣠⣾⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣦⠀⠈⣿⣿⣿⣠⣾⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡇⠀⢿⣿⣿⣿⣿⡿⠛⢿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣷⠀⠀⠉⠙⠋⠉⠀⠀⠈⠻⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⢀⠀⠈⠟⠛⠛⠉⣰⣇⠀⠀⠀⣾⣿⡀⠀⢠⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡈⠛⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣷⠀⠀⠀⠀⠀⠀⢀⣿⣿⠀⢰⣶⡄⠀⣿⣿⣆⠀⠀⢽⣿⡇⠀⣿⣿⣿⡀⠀⣸⣿⡄⠀⢀⣴⣶⣶⣶⣶⣷⣄⣠⣾⣷⣶⣶⣦⣤⡀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⠀⠀⣼⣄⠀⠀⢸⣿⡇⠀⢸⣿⡇⠀⣿⣿⣿⣆⠀⢸⣿⡇⠀⣿⣿⣿⣧⠀⢹⣿⡇⠀⠘⣿⣿⠋⠛⠛⠛⠉⢸⣿⡟⠛⠛⠻⣿⣿⣦⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡆⢸⣿⣿⡄⠀⢾⣿⡇⠀⢸⣿⡇⠀⣿⣿⣿⣿⡆⠘⣿⣿⠀⣿⣿⣿⣿⣇⠘⣿⣷⠀⠀⣿⣿⣀⢀⣀⠀⠐⢺⣿⡇⠀⠀⠀⣹⣿⣿⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣧⣿⣿⣿⣿⡀⣿⣿⠀⠀⢸⣿⡇⠀⣿⣿⠈⢿⣿⣄⣿⣿⡀⢿⣿⡇⢿⣿⣾⣿⣿⠀⠀⣿⣿⣿⣿⣿⡿⠆⢸⣿⣿⣀⣤⣾⣿⡿⠃⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⢹⣿⣷⣿⣿⠀⠀⢸⣿⡇⠀⣿⣿⠀⠈⣿⣿⣿⣿⡇⢻⣿⡇⠈⣿⣿⣿⣿⠀⠀⢻⣿⡄⠀⠀⠀⠀⢈⣿⣿⣿⣿⣿⣿⣧⡄⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⡇⠀⢿⣿⣿⣿⠀⠀⢸⣿⡇⠀⣿⣿⠀⠀⠹⣿⣿⣿⣇⣿⣿⡇⠀⠸⣿⣿⣿⡀⠀⣻⣿⡇⠀⠀⠀⠀⠠⣿⣟⠉⠉⠉⢿⣿⡇⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⠃⠀⠘⣿⣿⡏⠀⠀⢸⣿⡧⠆⣿⣿⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⠀⠀⠹⣿⣿⣧⠀⢽⣿⣷⣶⣶⣶⣦⣴⣿⣿⠀⠀⠀⢸⣿⣧⠀⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣟⣀⡄⠀⠈⠙⠁⠀⠀⠈⠿⠛⠘⠿⠟⠀⠀⠀⠀⠻⣿⣿⠛⠛⠃⠀⠀⠀⠻⠿⠟⠀⠈⠻⠋⠛⠋⠉⠁⠀⠿⠟⠀⠀⠀⢸⣿⣿⠄⠀⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⣠⡀⠀⣠⣴⣄⣀⣶⣄⠈⠁⠀⣀⣀⠀⠀⢀⣠⡀⠀⠀⢀⣾⣶⠀⠀⢀⣈⣀⣠⣄⣤⡀⣠⣤⣽⣋⣠⣤⠀⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡄⠀⣠⣤⠀⠀⠀⢸⣿⡏⠀⢹⣿⡏⢹⣿⣿⣆⠀⠈⣿⣿⡇⠀⢸⣿⣿⡀⠀⢈⣿⣿⠀⠀⣿⣿⡿⢿⣿⢿⠟⣿⣿⠿⢿⣿⣿⣷⡀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⡆⢠⣿⣿⣧⠀⠀⢾⣿⡇⠀⢸⣿⡇⢸⣿⣿⣿⡄⠀⢻⣿⡅⠀⢸⣿⣿⣷⡀⠀⣿⣿⠀⠀⣿⣿⡆⠀⠀⠀⢠⣿⣿⠀⠀⠀⣿⣿⣇⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣇⣸⣿⣿⣿⣆⠀⣿⣿⡇⠀⢸⣿⡇⢸⣿⡟⣿⣿⡀⢸⣿⡇⠀⢸⣿⣿⣿⣷⠀⣿⣿⡀⠀⣿⣿⣿⣿⣿⣶⡀⣿⣿⡄⠀⢀⣿⣿⡟⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⠉⣿⣿⡄⣿⣿⠀⠀⢸⣿⡇⢸⣿⡇⠘⣿⣷⣿⣿⣇⠀⢼⣿⡇⠹⣿⣷⣿⣿⡇⠀⣻⣿⡇⠉⠉⠁⠀⢿⣿⣿⣿⣿⣿⡏⠀⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡏⠀⠸⣿⣿⣿⣿⠀⠀⢾⣿⡇⢸⣿⡇⠀⠸⣿⣿⣿⣯⠀⢾⣿⡇⠀⠹⣿⣿⣿⡇⠀⢸⣿⡇⠀⠀⠀⠀⣻⣿⡏⠉⠹⣿⣿⣦⠀\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⣿⣿⠃⠀⠀⢹⣿⣿⣿⠀⠀⢾⣿⡇⢸⣿⣇⠀⠀⠹⣿⣿⣿⠀⣽⣿⡇⠀⠀⢻⣿⣿⣧⠀⢸⣿⣷⣴⣶⣶⠄⣹⣿⣇⠀⠀⠘⣿⣿⡆\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⠟⠀⠀⠀⠀⢿⣿⡷⠀⠀⣿⣿⡇⢸⣿⣿⠀⠀⠀⠹⣿⣿⡄⢿⣿⠇⠀⠀⠀⢻⣿⡿⠀⠀⠻⠟⠛⠋⠉⠀⢼⣿⡿⠀⠀⠀⢸⣿⣷\n"+
                        '\t'+ Colors.YELLOW.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⢿⣿⡇⠈⠛⠉⠀⠀⠀⠀⠙⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⢸⣿⡧\n"
        };
        for (String line : lines) {
            System.out.println(line);
            Thread.sleep(300);
        }
    }

    public static void gameRestart() {

    }
    public static void loseMessage() throws InterruptedException {
        System.out.print("\n\n");
        String lines[] = {
                '\t'+"\t\t  "+ Colors.CYAN.getColor() +"                              ████████╗ ██████╗ ██╗   ██╗ ██████╗ ██╗  ██╗    ██╗     ██╗   ██╗ ██████╗██╗  ██╗██╗\n" +
                        '\t'+"\t\t    "+ Colors.CYAN.getColor() +"                            ╚══██╔══╝██╔═══██╗██║   ██║██╔════╝ ██║  ██║    ██║     ██║   ██║██╔════╝██║ ██╔╝██║\n" +
                        '\t'+"\t\t      "+ Colors.CYAN.getColor() +"                             ██║   ██║   ██║██║   ██║██║  ███╗███████║    ██║     ██║   ██║██║     █████╔╝ ██║\n" +
                        '\t'+"\t\t     "+ Colors.CYAN.getColor() +"                              ██║   ██║   ██║██║   ██║██║   ██║██╔══██║    ██║     ██║   ██║██║     ██╔═██╗ ╚═╝\n" +
                        '\t'+"\t\t       "+ Colors.CYAN.getColor() +"                            ██║   ╚██████╔╝╚██████╔╝╚██████╔╝██║  ██║    ███████╗╚██████╔╝╚██████╗██║  ██╗██╗\n" +
                        '\t'+"\t\t        "+ Colors.CYAN.getColor() +"                           ╚═╝    ╚═════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚═╝\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡶⠛⠛⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                    ⠀⢀⣴⠋⠀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t         "+ Colors.PURPLE.getColor() +"                        ⠀⠀⠀                   ⠀⠀⢀⣠⠴⠞⠛⠉⠉⠉⠉⠉⠉⠛⠒⠾⢤⣀⠀⣀⣠⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                             ⠀⠀⠀⣠⡶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢭⡀⠀⠈⣷⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                   ⠀⠀         ⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⢀⡟⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                           ⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⡅⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                           ⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣄⣀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                           ⣾⠀⠀⣠⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⣄⠀⠀⠀⠀⠀⠀⠸⡇⠉⣷\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                           ⣿⠀⠰⣿⣿⣿⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⣧⡴⠋\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                           ⣿⠀⠀⢸⠛⢫⠀⠀⢠⠴⠒⠲⡄⠀⠀⠀⠀⡝⠛⢡⠀⠀⠀⠀⠀⠀⢰⡏⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                           ⢸⡄⠀⢸⡀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⢸⠀⠀⠀⠀⠀⠀⡼⣄⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                                    ⠀       ⢳⡄⠀⡇⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⢸⠀⠀⠀⠀⢀⡼⠁⢸⡇⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                           ⠀⠀                ⠙⢦⣷⡈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠈⡇⠀⣀⡴⠟⠒⠚⠋⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                           ⠀⠀⠀⠀               ⠈⠛⠾⢤⣤⣀⣀⡀⠀⠀⠀⠀⣀⣈⣇⡤⣷⠚⠉⠀⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                           ⠀⠀⠀⠀⠀⠀         ⠀      ⣰⠇⠀⠩⣉⠉⠉⠉⣩⠍⠁⠀⢷⣟⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                           ⠀⠀⠀⠀⠀⠀         ⠀      ⡟⠐⠦⠤⠼⠂⠀⠸⠥⠤⠔⠂⠘⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                           ⠀⠀⠀          ⠀⠀⠀      ⣸⣧⡟⠳⠒⡄⠀⠀⠀⡔⠲⠚⣧⣀⣿⠿⠷⣶⡆⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                           ⠀⠀⠀⠀⠀                ⠀⠻⣄⢀⠀⠀⡗⠀⠀⠀⡇⠄⢠⠀⣼⠟⠀⢀⣨⠇⠀⠀⠀⠀⠀\n" +
                        '\t'+"\t\t        "+ Colors.PURPLE.getColor() +"                           ⠀⠀⠀⠀⠀⠀⠀                ⠙⢶⠬⠴⢧⣤⣤⣤⣽⣬⡥⠞⠛⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀\n"
        };
        for (String line : lines) {
            System.out.println(line);
            Thread.sleep(300);
        }
    }

    public static void tieMessage() throws InterruptedException {
        System.out.print("\n\n");
        String lines[] = {
                '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠜⠧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⣀⣤⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠠⠒⠂⠁⠀⠀⠀⠀⠀⠀⠀⢄⡈⠑⠢⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⡡⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⢖⠃⠀⠀⠀⠀⣀⣤⡶⠶⣖⣶⣒⠦⣄⡀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢾⠗⡴⢂⢠⢖⠆⠀⣠⣀⠀⠀⡆⢀⠀⠀⠀⢧⢠⡖⢶⣼⣿⣿⣷⣶⣶⣯⣿⣿⣷⣿⣷⡀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠁⡜⢀⠇⡎⡞⠀⡼⡜⠉⠀⣰⢃⠏⠀⡇⢐⡌⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⣿⢿⣿⣿⣤⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡅⠰⣇⡼⣸⠸⠀⣼⣽⣤⡀⣠⢃⣼⣤⣰⠃⡼⢸⣼⣿⣿⣿⣿⣿⠛⠉⠀⠀⠀⠀⠀⠀⢀⡿⣿⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠛⢳⠌⠁⢰⣿⣿⣿⡗⠓⢺⣿⣿⣿⡷⠃⢠⠗⠋⣿⣿⣿⠪⠥⣄⡀⠀⠀⠀⢀⣀⣨⠡⣿⠂\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠤⣤⡀⠀⠉⠉⠉⠀⠀⠀⠉⠛⠉⠀⢹⡌⠑⣾⡏⠲⣌⠀⠀⠀⠉⠋⠀⠀⠉⠀⢠⠈⣿⠁\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠲⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡴⠞⠀⠀⠈⠙⠒⠚⣄⠀⠀⠀⠀⠀⠀⠀⠀⢈⡇⠙⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⣿⣶⣶⣤⣤⣛⠓⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⢀⡀⣯⠀⠀⠀⠀⠀⠀⣠⠔⠋⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣷⣦⣤⡤⠖⠉⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣷⠄⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⡿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣟⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣧⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⠀⠀⠀⠀⠀⠀⠀\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀ "+ Colors.GREEN.getColor() +"███████████  ███          \n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀"+ Colors.GREEN.getColor() +"░█░░░███░░░█  ░░░           \n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀"+ Colors.GREEN.getColor() +"░   ░███  ░  ████   ██████ \n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀    "+ Colors.GREEN.getColor() +"░███    ░░███  ███░░███\n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀    "+ Colors.GREEN.getColor() +"░███     ░███ ░███████ \n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀    "+ Colors.GREEN.getColor() +"░███     ░███ ░███░░░  \n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀    "+ Colors.GREEN.getColor() +"█████    █████░░██████ \n"+
                        '\t'+"\t\t  "+ Colors.CYAN.getColor() +"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀    "+ Colors.GREEN.getColor() +"░░░░░    ░░░░░  ░░░░░░  \n"
        };
        for (String line : lines) {
            System.out.println(line);
            Thread.sleep(300);
        }
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
    public static void showCards(int[][] cards) {
        // Check if there are no cards
        if (cards.length == 0) {
            System.out.println("No cards to display.");
            return;
        }

        // Determine the maximum length of card value strings
        int maxLength = 0;
        for (int[] card : cards) {
            int cardValue = card[0];
            String cardValueStr;
            switch (cardValue) {
                case 1:
                    cardValueStr = "A";
                    break;
                case 11:
                    cardValueStr = "J";
                    break;
                case 12:
                    cardValueStr = "Q";
                    break;
                case 13:
                    cardValueStr = "K";
                    break;
                default:
                    cardValueStr = String.valueOf(cardValue);
                    break;
            }
            maxLength = Math.max(maxLength, cardValueStr.length());
        }

        // Print the cards
        for (int row = 0; row < 5; row++) { // 5 rows for each card
            for (int[] card : cards) {
                int cardValue = card[0];
                int cardSuit = card[1];

                String cardValueStr, cardSuitStr;
                switch (cardValue) {
                    case 1:
                        cardValueStr = "A";
                        break;
                    case 11:
                        cardValueStr = "J";
                        break;
                    case 12:
                        cardValueStr = "Q";
                        break;
                    case 13:
                        cardValueStr = "K";
                        break;
                    default:
                        cardValueStr = String.valueOf(cardValue);
                        break;
                }

                switch (cardSuit) {
                    case 1:
                        cardSuitStr = "♥️"; // Hearts
                        break;
                    case 2:
                        cardSuitStr = "♦️"; // Diamonds
                        break;
                    case 3:
                        cardSuitStr = "♠️"; // Spades
                        break;
                    case 4:
                        cardSuitStr = "♣️"; // Clubs
                        break;
                    default:
                        cardSuitStr = "?"; // Unknown suit
                        break;
                }

                if (row == 0) {
                    System.out.print(" _______  ");
                } else if (row == 1) {
                    String padding = " ".repeat(maxLength - cardValueStr.length());
                    System.out.print("|       | ");
                } else if (row == 2) {
                    String padding = " ".repeat(maxLength - cardValueStr.length());
                    System.out.print("|   " + cardValueStr + "   | ");
                } else if (row == 3) {
                    System.out.print("|   " + cardSuitStr + "  | ");
                } else if (row == 4) {
                    System.out.print("|_______| ");
                }
            }
            System.out.println();
        }
    }
    public static void showCardsWithBack(int[][] cards) {
        // Check if there are no cards
        if (cards.length == 0) {
            System.out.println("No cards to display.");
            return;
        }

        // Determine the maximum length of card value strings
        int maxLength = 0;
        for (int[] card : cards) {
            int cardValue = card[0];
            String cardValueStr;
            switch (cardValue) {
                case 1:
                    cardValueStr = "A";
                    break;
                case 11:
                    cardValueStr = "J";
                    break;
                case 12:
                    cardValueStr = "Q";
                    break;
                case 13:
                    cardValueStr = "K";
                    break;
                default:
                    cardValueStr = String.valueOf(cardValue);
                    break;
            }
            maxLength = Math.max(maxLength, cardValueStr.length());
        }

        // Print the cards
        for (int row = 0; row < 5; row++) { // 5 rows for each card
            for (int i = 0; i < cards.length; i++) {
                int[] card = cards[i];
                int cardValue = card[0];
                int cardSuit = card[1];

                String cardValueStr, cardSuitStr;
                switch (cardValue) {
                    case 1:
                        cardValueStr = "A";
                        break;
                    case 11:
                        cardValueStr = "J";
                        break;
                    case 12:
                        cardValueStr = "Q";
                        break;
                    case 13:
                        cardValueStr = "K";
                        break;
                    default:
                        cardValueStr = String.valueOf(cardValue);
                        break;
                }

                switch (cardSuit) {
                    case 1:
                        cardSuitStr = "♥️"; // Hearts
                        break;
                    case 2:
                        cardSuitStr = "♦️"; // Diamonds
                        break;
                    case 3:
                        cardSuitStr = "♠️"; // Spades
                        break;
                    case 4:
                        cardSuitStr = "♣️"; // Clubs
                        break;
                    default:
                        cardSuitStr = "?"; // Unknown suit
                        break;
                }

                if (row == 0) {
                    if (i == 0) {
                        System.out.print(" _______  "); // Show the back of the first card
                    } else {
                        System.out.print(" _______  "); // Show the face of other cards
                    }
                } else if (row == 1) {
                    if (i == 0) {
                        System.out.print("|///////| "); // Show the back of the first card
                    } else {
                        System.out.print("|       | "); // Show the face of other cards
                    }
                } else if (row == 2) {
                    if (i == 0) {
                        System.out.print("|///////| "); // Show the back of the first card
                    } else {
                        String padding = " ".repeat(maxLength - cardValueStr.length());
                        System.out.print("|   " + cardValueStr + padding + "   | "); // Show the face of other cards
                    }
                } else if (row == 3) {
                    if (i == 0) {
                        System.out.print("|///////| "); // Show the back of the first card
                    } else {
                        System.out.print("|   " + cardSuitStr + "  | "); // Show the face of other cards
                    }
                } else if (row == 4) {
                    if (i == 0) {
                        System.out.print("|_______| "); // Show the back of the first card
                    } else {
                        System.out.print("|_______| "); // Show the face of other cards
                    }
                }
            }
            System.out.println();
        }
    }

}
