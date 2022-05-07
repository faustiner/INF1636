package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.City;

public class CityTest {

	@Test
	public void cityNameTest() {
		City city = new City("Leblon", 4500);
		String cityName = "Leblon";
		assertEquals(cityName, city.getName());
	}
	
	@Test
	public void cityPriceTest() {
		City city = new City("Leblon", 4500);
		int cityPrice = 4500;
		assertEquals(cityPrice, city.getPrice());
	}

}
