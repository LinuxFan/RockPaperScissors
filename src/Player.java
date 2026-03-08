package src;

public abstract class Player {
    protected int wins = 0;
    protected int losses = 0;
    protected int draws = 0;

    public abstract String play();

    public void won() {
        wins++;
    }
    public void lost() {
        losses++;
    }
    public void drew() {
        draws++;
    }

    public String getStats() {
        return "Wins: " + wins + ", Losses: " + losses + ", Draws: " + draws;
    }
}

