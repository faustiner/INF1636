package tests;

import static org.junit.Assert.*;
import model.Player;
import model.Property;

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
	
	@Test
	public void playerBuyPropertyTest() {
		Player player = new Player("Raphael", "Vermelho");
		Property property = new Property("Leblon", 2000, 500, 600, 700);
		player.buyProperty(property);
		assertEquals(player.checkHasProperty(property), true);
	}
	
	@Test
	public void playerBuyPropertyMoneyTest() {
		Player player = new Player("Raphael", "Vermelho");
		Property property = new Property("Leblon", 2000, 500, 600, 700);
		player.buyProperty(property);
		assertEquals(player.getMoney(), 2000);
	}
	
	@Test
	public void playerPayRentTest() {
		Player player = new Player("Raphael", "Vermelho");
		Player player2 = new Player("Vitor", "Azul");
		Property property = new Property("Leblon", 2000, 500, 600, 700);
		property.setPropertyOwner(player2);
		player.payRent(property);
		assertEquals(player.getMoney(), 3500);
	}
	
	@Test
	public void playerPayRentWithHouseTest() {
		Player player = new Player("Raphael", "Vermelho");
		Player player2 = new Player("Vitor", "Azul");
		Property property = new Property("Leblon", 2000, 500, 600, 700);
		property.setPropertyOwner(player2);
		property.setHouse(2);
		player.payRent(property);
		assertEquals(player.getMoney(), 2800);
	}
	
	@Test
	public void playerPayRentWithHotelTest() {
		Player player = new Player("Raphael", "Vermelho");
		Player player2 = new Player("Vitor", "Azul");
		Property property = new Property("Leblon", 2000, 500, 600, 700);
		property.setPropertyOwner(player2);
		property.setHotel(2);
		player.payRent(property);
		assertEquals(player.getMoney(), 2600);
	}
}
