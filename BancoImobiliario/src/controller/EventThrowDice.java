package controller;

import java.awt.event.*;
import javax.swing.*;
import view.Dices;
import view.Frame;

public class EventThrowDice implements  ActionListener {

	Frame f;

	public EventThrowDice(Frame f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		
		f.repaint();
	}
}