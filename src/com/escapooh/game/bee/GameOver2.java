package com.escapooh.game.bee;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver2 extends JPanel{
	private JFrame jf;
	private JPanel jp;
	
	private Image BG = new ImageIcon("images/win.png").getImage().getScaledInstance(1200, 800, 0);
	private JLabel label = new JLabel(new ImageIcon(BG));

	public GameOver2(JFrame jf) {
		this.jf = jf;
		jp = this;

		label.setLayout(null);
		label.setBounds(0, 0, 1200, 800);

		this.add(label);
		jf.add(label);
		jf.setLayout(null);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setBounds(0,0,1200,800);
	}
	public static void main(String[] args) {

		JFrame jf = new JFrame();
		jf.setSize(1200, 800);
		new GameOver2(jf);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
