package model;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private String colour;
	private int money = 4000;
	private ArrayList<Property> playerProperties = new ArrayList<>();
	
	public Player(String name, String cor) {
		this.name = name;
		this.colour = cor;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int getMoney() {
		return money;
	}

	public void buyProperty (Property property) {
		if(money >= property.getPrice() && property.canBuy()) {
			playerProperties.add(property);
			money -= property.getPrice();
		}
	}
	
	public boolean checkHasProperty(Property property) {
		for(int i = 0; i < playerProperties.size(); i++) {
    		if(playerProperties.get(i) == property) {
    			return true;
    		} 
    	}
		return false;
	}
	
	public void payRent(Property property) {
		if(!checkHasProperty(property)) {
			money -= property.getRent();
		}
	}
}
