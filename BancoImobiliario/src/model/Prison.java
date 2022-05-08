package model;

import java.util.ArrayList;

public class Prison {

    private ArrayList<Player> playerPrison = new ArrayList<>();
    
    public boolean checkPlayerPrison(Player player) {
    	
    	for(int i = 0; i < playerPrison.size(); i++) {
    		if(playerPrison.get(i) == player) {
    			return true;
    		} 
    	}
		return false;
    }
    
    public void removeFromPrison(Player player) {
    	if(checkPlayerPrison(player)) {
    		playerPrison.remove(player);
    	}
    }
    
    public void addInPrison(Player player) {
    	if(checkPlayerPrison(player)) {
    		playerPrison.add(player);
    	}
    	
    }
    
    public ArrayList<Player> getPrison() {
    	return playerPrison;
    }
}
