package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class StartPanel extends JPanel{  
	
	public StartPanel() {

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawRect(500, 60, 200, 50);
		g2d.setPaint(Color.LIGHT_GRAY);
		g2d.fillRect(500, 60, 200, 50);
		g2d.setPaint(Color.BLACK);
		g2d.drawString("3 Jogadores", 560, 90);
		
		g2d.drawRect(500, 120, 200, 50);
		g2d.setPaint(Color.LIGHT_GRAY);
		g2d.fillRect(500, 120, 200, 50);
		g2d.setPaint(Color.BLACK);
		g2d.drawString("4 Jogadores", 560, 150);

		g2d.drawRect(500, 180, 200, 50);
		g2d.setPaint(Color.LIGHT_GRAY);
		g2d.fillRect(500, 180, 200, 50);
		g2d.setPaint(Color.BLACK);
		g2d.drawString("5 Jogadores", 560, 210);
		
		g2d.drawRect(500, 240, 200, 50);
		g2d.setPaint(Color.LIGHT_GRAY);
		g2d.fillRect(500, 240, 200, 50);
		g2d.setPaint(Color.BLACK);
		g2d.drawString("6 Jogadores", 560, 270);
	} 
}
