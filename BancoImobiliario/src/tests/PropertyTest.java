package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import model.Player;
import model.Property;

public class PropertyTest {

	@Test
	public void propertyNameTest() {
		Property property = new Property("Leblon", 4500, 500);
		String propertyName = "Leblon";
		assertEquals(propertyName, property.getName());
	}
	
	@Test
	public void propertyPriceTest() {
		Property property = new Property("Leblon", 4500, 500);
		int propertyPrice = 4500;
		assertEquals(propertyPrice, property.getPrice());
	}

	@Test
	public void propertyRentTest() {
		Property property = new Property("Leblon", 4500, 500);
		int propertyRent = 500;
		assertEquals(propertyRent, property.getRent());
	}
	
	@Test
	public void propertyOwnerTest() {
		Property property = new Property("Leblon", 4500, 500);
		Player player = new Player("Raphael", "Vermelho");
		property.setPropertyOwner(player);
		assertEquals(player, property.getPropertyOwner());
	}

}
