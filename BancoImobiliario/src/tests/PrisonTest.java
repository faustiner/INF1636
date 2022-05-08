package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Player;
import model.Prison;

public class PrisonTest {

	@Test
	public void checkPlayerInPrisonTest() {
		Player player = new Player("Raphael", "Vermelho");
		Prison prison = new Prison();
		prison.addInPrison(player);
		assertEquals(prison.checkPlayerPrison(player), true);
	}
	
	@Test
	public void checkPlayerRemoveFromPrisonTest() {
		Player player = new Player("Raphael", "Vermelho");
		Prison prison = new Prison();
		prison.removeFromPrison(player);
		assertEquals(prison.checkPlayerPrison(player), false);
	}
}
