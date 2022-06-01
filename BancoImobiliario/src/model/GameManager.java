package model;

import java.util.ArrayList;
import java.util.Random;

public class GameManager {

    private ArrayList<Player> players = new ArrayList<>();
    private int dices[] = new int[2];
    private Random random = new Random();

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

        dices[0] = 1;
        dices[1] = 1;
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

    public int[] getDices() {
        return this.dices;
    }

    public int[] throwDices(){
        dices[0] = random.nextInt(6) + 1;
        dices[1] = random.nextInt(6) + 1;
        return dices;
    }
}
