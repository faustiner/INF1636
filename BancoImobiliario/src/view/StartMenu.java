package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.EventStartMenu;

public class StartMenu extends JFrame{
	public final int WIDTH = 1200;
	public final int HEIGHT = 700;
	JPanel p;
	
	public StartMenu() {
		JButton loadButton = new JButton("Carregar partida");
		loadButton.setBounds(500, 360, 200, 50);
		add(loadButton);

		StartPanel start = new StartPanel();
		start.addMouseListener(new EventStartMenu(this));
		getContentPane().add(start);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl = screenSize.width;
		int sa = screenSize.height;
		int x = sl /2 - WIDTH / 2;
		int y = sa / 2 - HEIGHT /2 ;
		
		setBounds(x, y, WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
