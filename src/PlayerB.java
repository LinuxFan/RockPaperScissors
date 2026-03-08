package src;

import java.util.Random;

public class PlayerB extends Player {
    private final Random random = new Random();

    @Override
    public String play() {
        int move = random.nextInt(3);
        return switch (move) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> throw new RuntimeException("Unexpected move");
        };
    }
}

