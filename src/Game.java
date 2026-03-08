package src;

public class Game {
    private final Player playerA = new PlayerA();
    private final Player playerB = new PlayerB();

    public void play() {
        for (int i = 0; i < 100; i++) {
            String moveA = playerA.play();
            String moveB = playerB.play();

            System.out.println("Player A played: " + moveA);
            System.out.println("Player B played: " + moveB);

            if (moveA.equals(moveB)) {
                playerA.drew();
                playerB.drew();
                System.out.println("It's a draw!");
            } else if ((moveA.equals("paper") && moveB.equals("rock")) ||
                       (moveA.equals("scissors") && moveB.equals("paper")) ||
                       (moveA.equals("rock") && moveB.equals("scissors"))) {
                playerA.won();
                playerB.lost();
                System.out.println("Player A won this round!");
            } else {
                playerA.lost();
                playerB.won();
                System.out.println("Player B won this round!");
            }
        }

        System.out.println("After 100 rounds, the stats are:");
        System.out.println("Player A's stats: " + playerA.getStats());
        System.out.println("Player B's stats: " + playerB.getStats());
    }
}

