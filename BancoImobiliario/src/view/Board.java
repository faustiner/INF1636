package view;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class Board extends JPanel {

    Image board;
    Dices dice = new Dices();

    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
        int num;

		Graphics2D g2d = (Graphics2D) g;
		try {
			board = ImageIO.read(new File("src/view/images/tabuleiro.png"));
		  } catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		} 

        g2d.drawImage(board ,0 ,0 , null);

    
		g2d.drawImage(dice.Dice(0), 850, 400, null);
		g2d.drawImage(dice.Dice(1), 960, 400, null);
    }
}
