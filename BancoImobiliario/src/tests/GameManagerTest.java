package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.GameManager;
import model.Player;
import org.junit.Test;

public class GameManagerTest {

    @Test
	public void setPlayersQuantityTest() {
		GameManager gameManager = new GameManager(3);
        GameManager gameManager02 = new GameManager(4);
        GameManager gameManager03 = new GameManager(5);
        GameManager gameManager04 = new GameManager(6);
	
		assertEquals(3, gameManager.getPlayersQuantity());
        assertEquals(4, gameManager02.getPlayersQuantity());
        assertEquals(5, gameManager03.getPlayersQuantity());
        assertEquals(6, gameManager04.getPlayersQuantity());
	}
}
