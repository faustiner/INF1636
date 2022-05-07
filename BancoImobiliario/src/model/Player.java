package model;

class Player {
	
	private String name;
	private String colour;
	private int money = 4000;
	
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

}
