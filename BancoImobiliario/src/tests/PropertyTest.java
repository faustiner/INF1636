package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import model.Property;

public class PropertyTest {

	@Test
	public void propertyNameTest() {
		Property city = new Property("Leblon", 4500);
		String cityName = "Leblon";
		assertEquals(cityName, city.getName());
	}
	
	@Test
	public void propertyPriceTest() {
		Property city = new Property("Leblon", 4500);
		int cityPrice = 4500;
		assertEquals(cityPrice, city.getPrice());
	}

}
