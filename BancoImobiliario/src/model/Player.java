package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player {
	
	private String name;
	private String colour;
	private int money = 4000;
	private ArrayList<Property> playerProperties = new ArrayList<>();
	private Map<Property, Boolean> maker = new HashMap<Property, Boolean>();
	
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
	
	public void decreaseMoney(int newMoney) {
		money -= newMoney;
	}
	
	public void increaseMoney(int newMoney) {
		money += newMoney;
	}
	
	public void canBuild(Property property) {
		maker.put(property, true);
	}

	public void buyProperty (Property property) {
		if(money >= property.getPrice() && property.canBuy()) {
			playerProperties.add(property);
			money -= property.getPrice();
			canBuild(property);
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
	
	public boolean checkCanBuild(Property property) {
		return maker.get(property);
	}
	
	public void buildHouse(Property property) {
		if(checkHasProperty(property) && checkCanBuild(property)) {
			property.buildHouse();
			decreaseMoney(property.getPriceHouse());
		}
	}
	
	public void buildHotel(Property property) {
		if(checkHasProperty(property) && checkCanBuild(property)) {
			property.buildHotel();
			decreaseMoney(property.getPriceHotel());
		}
	}
	
	public void payRent(Property property) {
		if(!checkHasProperty(property) && property.hasOwner()) {
			if(property.getHouses() > 0) {
				money -= property.getRentWithHouse();
				property.getPropertyOwner().increaseMoney(property.getRentWithHouse());
				return;
			}
			
			if(property.getHotel() > 0) {
				money -= property.getRentWithHotel();
				property.getPropertyOwner().increaseMoney(property.getRentWithHotel());
				return;
			}
			money -= property.getRent();
			property.getPropertyOwner().increaseMoney(property.getRent());
		}
	}
	
	public void gameOver() {
		if(money == 0) {
			System.out.print("Fim de jogo para esse jogador");
		}
	}
}
