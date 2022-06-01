package controller;

import java.awt.event.*;

import model.GameManager;
import view.Frame;

public class EventThrowDice implements  ActionListener {

	Frame frame;
    GameManager gameManager;

	public EventThrowDice(Frame f, GameManager gm) {
		this.frame = f;
        this.gameManager = gm;
	}

	public void actionPerformed(ActionEvent e) {

		gameManager.throwDices();
		frame.repaint();
	}
}