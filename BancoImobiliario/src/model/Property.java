package model;

public class Property {
	
	private String name;
	private int price;
	private Player propertyOwner = null;
	private int rent;
	
	
	public Property(String name, int price, int rent) {
		this.name = name;
		this.price = price;
		this.rent = rent;
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
}
