package tests;

import static org.junit.Assert.*;
import model.Player;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void playerNameTest() {
		Player player = new Player("Raphael", "Vermelho");
		String name = "Raphael";
		assertEquals(name, player.getName());
	}
	
	
	@Test
	public void playerColourTest() {
		Player player = new Player("Raphael", "Vermelho");
		String colour = "Vermelho";
		assertEquals(colour, player.getColour());
	}
	
	@Test
	public void playerInitialMoneyTest() {
		Player player = new Player("Raphael", "Vermelho");
		int initialMoney = 4000;
		assertEquals(initialMoney, player.getMoney());
	}

}
