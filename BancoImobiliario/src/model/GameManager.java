package model;

import java.util.ArrayList;

public class GameManager {

    private ArrayList<Player> players = new ArrayList<>();

    public GameManager(int quantity) {

        Player player01 = new Player("Raphael", "vermelho");
        Player player02 = new Player("Vitor", "azul");

        players.add(player01);
        players.add(player02);

        if(quantity == 3) {
            addNewPlayer(players , new Player("Faustine", "preto"));
        }

        if(quantity == 4) {
            addNewPlayer(players , new Player("Mariana", "rosa"));
        }

        if(quantity == 5) {
            addNewPlayer(players , new Player("Mariana", "rosa"));
            addNewPlayer(players , new Player("Roberto", "amarelo"));
        }

        if(quantity == 6) {
            addNewPlayer(players , new Player("Mariana", "rosa"));
            addNewPlayer(players , new Player("Roberto", "amarelo"));
            addNewPlayer(players , new Player("Augusto", "verde"));
        }
    }

    private void addNewPlayer(ArrayList<Player> playersList, Player newPlayer) {
        playersList.add(newPlayer);
    }

    public ArrayList<Player> getPlayersList() {
        return this.players;
    }

    public int getPlayersQuantity() {
        return this.players.size();
    }

}
