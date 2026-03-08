package src.alphaVariant;

import java.util.Random;

public class AlphaVariantMain {
    public static void main(String[] args) {
        int aWins = 0, bWins = 0, draws = 0;
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String aMove = "paper";
            String bMove = moves[random.nextInt(3)];
            System.out.printf("Player A: %s, Player B: %s", aMove, bMove);

            if (bMove.equals(aMove)) {
                draws++;
                System.out.println(" - Draw");
            } else if (bMove.equals("rock")) {
                aWins++;
                System.out.println(" - Player A wins");
            } else {
                bWins++;
                System.out.println(" - Player B wins");
            }
        }

        System.out.printf("%nResults: %d draws, Player A won %d times, Player B won %d times.", draws, aWins, bWins);
    }
}