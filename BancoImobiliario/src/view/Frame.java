package view;

import java.awt.*;
import javax.swing.*;
import controller.EventThrowDice;
import model.GameManager;


public class Frame extends JFrame {
	public final int WIDTH = 1200;
	public final int HEIGHT = 700;
	JPanel board;

	public Frame(GameManager gameManager) {
		JButton dices = new JButton("Jogar Dados");
		dices.setBounds(850, 540, 200, 50);
        dices.addActionListener(new EventThrowDice(this));
		add(dices);
		
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem newGame =  new JMenuItem("Novo jogo"), saveGame = new JMenuItem("Salvar");
		menu.add(newGame);
		menu.add(saveGame);
		mb.add(menu);
		setJMenuBar(mb);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int sl = screenSize.width;
		int sa = screenSize.height;
		int x = sl / 2 - WIDTH / 2;
		int y = sa/2 - HEIGHT / 2;
		
		/*Painel do jogo*/
		board = new Board();
		getContentPane().add(board);
		setBounds(x, y, WIDTH , HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
