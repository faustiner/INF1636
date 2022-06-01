package view;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class Board extends JPanel {

    Image board;

    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		try {
			board = ImageIO.read(new File("src/view/images/tabuleiro.png"));
		  } catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		} 

        g2d.drawImage(board ,0 ,0 , null);
    }
}
