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

    }

    public static List creatDeckCards() {
        List<Map<Integer, Integer>> deck = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Map<Integer, Integer> hashMap = new HashMap<>();
                hashMap.put(j, i);
                deck.add(hashMap);
            }
        }
        return deck;
    }
}