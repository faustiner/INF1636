package model;

public class Property {
	
	private String name;
	private int price;
	private boolean canBuy = true;
	private Player propertyOwner = null;
	
	
	public Property(String name, int price) {
		this.name = name;
		this.price = price;

		if(propertyOwner != null) {
			canBuy = true;
		}
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	public boolean canBuy() {
		return canBuy;
	}

	public void setPropertyOwner(Player player) {
		this.propertyOwner = player;
	}
}
