package model;

public class Property {
	
	private String name;
	private int price;
	private Player propertyOwner = null;
	private int rent;
	private int rentWithHouse;
	private int rentWithHotel;
	private int housePrice;
	private int hotelPrice;
	private int houses;
	private int hotels;
	
	public Property(String name, int price, int rent, int rentWithHouse, int rentWithHotel, int housePrice, int hotelPrice) {
		this.name = name;
		this.price = price;
		this.rent = rent;
		this.rentWithHouse = rentWithHouse;
		this.rentWithHotel = rentWithHotel;
		this.housePrice = housePrice;
		this.hotelPrice = hotelPrice;
		this.houses = 0;
		this.hotels = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	public boolean canBuy() {
		return propertyOwner == null;
	}

	public void setPropertyOwner(Player player) {
		this.propertyOwner = player;
	}

	public Player getPropertyOwner() {
		return propertyOwner;
	}

	public int getRent() {
		return rent;
	}
	
	public int getHouses() {
		return houses;
	}
	
	public int getHotel() {
		return hotels;
	}
	
	public void setHouse(int houses) {
		this.houses = houses;
	}
	
	public void setHotel(int holtel) {
		this.hotels = holtel;
	}
	
	public int getRentWithHouse() {
		return rentWithHouse * houses;
	}
	
	public int getRentWithHotel() {
		return rentWithHotel * hotels;
	}
	
	public boolean hasOwner() {
		return propertyOwner != null;
	}
	
	public void buildHouse(Player player) {
		if(getPropertyOwner() == player) {
			houses++;
			player.decreaseMoney(housePrice);
		}
	}
	
	public void buildHotel(Player player) {
		if(getPropertyOwner() == player && houses >= 1) {
			hotels++;
			player.decreaseMoney(hotelPrice);
		}
	}
}
