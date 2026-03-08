package test;

import org.junit.Test;
import src.Player;
import src.PlayerA;

import static org.junit.Assert.*;

public class PlayerATest {

    @Test
    public void testPlay() {
        Player player = new PlayerA();
        String move = player.play();
        assertEquals("paper", move);
    }
}