package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartMenu extends JFrame{
	public final int WIDTH=800;
	public final int HEIGHT=400;
	JPanel p;
	
	public StartMenu() {
		JButton carregar = new JButton("Carregar partida");
		carregar.setBounds(300, 300, 200, 50);
		add(carregar);
		StartPanel inicial = new StartPanel();
		getContentPane().add(inicial);
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
