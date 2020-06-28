package com.escapooh.game.gameover;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver extends JPanel {
	JFrame jf;
	JPanel jp;
	
	public GameOver(JFrame jf) {
		jf.setSize(1200, 800);
		
		JPanel jp = new JPanel();
		Image gameover_img = new ImageIcon("images/gameover.png").getImage().getScaledInstance(1200, 800, 0);
		
		JLabel gameOver = new JLabel(new ImageIcon(gameover_img));
		
		jp.add(gameOver);
		jf.add(jp);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
