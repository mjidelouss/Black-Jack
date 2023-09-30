package black.jack;

import java.util.Random;

public class CardService {
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

    public static int [][][] extractIndexCard(int [][] deck, int index) {
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
        int[][][] result = new int[2][][];
        result[0] = extractedCard;
        result[1] = remainingDeck;
        return result;
    }

    public static int[][][] draw_n_cards(int[][] deck, int n) {
        int[][][] result = new int [2][][];
        int size = deck.length;

        if (n >= size) {
            result[0] = deck;
            result[1] = new int[0][2];
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
            result[0] = drawnCards;
            result[1] = remainingCards;
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

    public static int [][][] drawCard(int [][] deck) {
        int n = new Random().nextInt(deck.length / 2 + 1);
        int [][][] resList = extractIndexCard(deck, n);
        return resList;
    }

    public static int[][] shuffleDeck(int [][] deck) {
        int [][] shuffledDeck = new int [deck.length][2];
        int [][][] cardList = drawCard(deck);
        int [][] newDeck = cardList[1];
        int count = 0;
        while (cardList[1] != null) {
            shuffledDeck[count] = cardList[0][0];
            if (newDeck.length == 0) {
                break;
            }
            cardList = drawCard(newDeck);
            newDeck = cardList[1];
            count++;
        }
        return shuffledDeck;
    }

    public static int [][] readyDeck() {
        int [][] deck = constructDeckFromCard(1, 1);
        int [][] shuffledDeck = shuffleDeck(deck);
        int n = new Random().nextInt(3)+28;
        int [][][] result = draw_n_cards(shuffledDeck, n);
        return result[1];
    }
}
