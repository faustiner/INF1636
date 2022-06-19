package view;

import java.awt.*;
import javax.swing.*;
import model.GameManager;
import java.io.*;
import javax.imageio.*;

public class Board extends JPanel {

    Image board;
    Dices dice = new Dices();
    GameManager gameManager;

    public Board(GameManager gm) {
        this.gameManager = gm;
    }

    public void paintComponent(Graphics g) {
		super.paintComponent(g);

        int diceIndex;

		Graphics2D g2d = (Graphics2D) g;
		try {
			board = ImageIO.read(new File("src/view/images/tabuleiro.png"));
		  } catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		} 

        g2d.drawImage(board ,0 ,0 , null);

    
        diceIndex = gameManager.getDices()[0] - 1;
		g2d.drawImage(dice.Dice(diceIndex), 850, 400, null);
        diceIndex = gameManager.getDices()[1] - 1;
		g2d.drawImage(dice.Dice(diceIndex), 960, 400, null);

        g2d.drawRect(850, 60, 200, 50);
		g2d.setPaint(Color.BLACK);
		g2d.drawString("Jogador da vez: ", 860, 90);

        g2d.drawRect(950, 60, 200, 50);
		g2d.setPaint(Color.BLACK);
		g2d.drawString("Dinheiro: ", 960, 90);
    }
}
