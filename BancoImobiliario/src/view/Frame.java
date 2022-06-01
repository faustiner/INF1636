package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Frame extends JFrame {
	public final int LARG_DEFAULT=1200;
	public final int ALT_DEFAULT=750;
	JPanel board;

	public Frame() {
		JButton dados = new JButton("Jogar Dados");
		dados.setBounds(850,340,200,50);
		add(dados);
		
		String dado[] = {"1","2","3","4","5","6"};
		JButton simular = new JButton("Simular");
		JComboBox dado1 = new JComboBox(dado);
		JComboBox dado2 = new JComboBox(dado);
		dado1.setBounds(750,555,110,20);
		dado2.setBounds(900,555,110,20);
		simular.setBounds(1050,555,110,20);
		add(dado1);
		add(dado2);
		add(simular);
		
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem novo =  new JMenuItem("Novo jogo"), salvar = new JMenuItem("Salvar");
		menu.add(novo);
		menu.add(salvar);
		mb.add(menu);
		setJMenuBar(mb);
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl=screenSize.width;
		int sa=screenSize.height;
		int x=sl/2-LARG_DEFAULT/2;
		int y=sa/2-ALT_DEFAULT/2;
		
		/*Painel do jogo*/
		board = new Board();
		getContentPane().add(board);
		setBounds(x,y,LARG_DEFAULT,ALT_DEFAULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
