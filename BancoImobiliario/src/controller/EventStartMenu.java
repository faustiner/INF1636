package controller;

import java.awt.event.*;

import model.GameManager;
import view.Frame;
import view.StartMenu;

public class EventStartMenu implements MouseListener {

	StartMenu f;
	public EventStartMenu(StartMenu f) {
		this.f = f;
	}
	public void mouseClicked(MouseEvent e) {
		
		int x = e.getX(), y = e.getY(), state = 0;
        GameManager gameManager = new GameManager(0);

        if((x > 500 && y > 60) && (x < 700 && y < 110)) {
			System.out.println("SELECIONADO 2 JOGADORES");
            gameManager = new GameManager(2);
			state = 1;
		}
		
		else if((x > 500 && y > 120) && (x < 700 && y < 170)) {
			System.out.println("SELECIONADO 3 JOGADORES");
            gameManager = new GameManager(3);
			state = 1;
		}
		else if((x > 500 && y > 180) && (x < 700 && y < 230)) {
			System.out.println("SELECIONADO 4 JOGADORES");
            gameManager = new GameManager(4);
			state = 1;
		}
		else if((x > 500 && y > 240) && (x < 700 && y < 310)) {
			System.out.println("SELECIONADO 5 JOGADORES");
            gameManager = new GameManager(5);
			state = 1;
		}
        else if((x > 500 && y > 300) && (x < 700 && y < 370)) {
			System.out.println("SELECIONADO 6 JOGADORES");
            gameManager = new GameManager(6);
			state = 1;
		}
		
		if(state == 1) {
			Frame tab = new Frame(gameManager);
			tab.setVisible(true);
			f.dispose();
		}
		
	}
	
	 public void mousePressed(MouseEvent e) {}

	 public void mouseReleased(MouseEvent e) {}

	 public void mouseEntered(MouseEvent e) {}

	 public void mouseExited(MouseEvent e) {}
}
