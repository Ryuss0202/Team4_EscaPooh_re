package com.escapooh.loginPage.loginMain;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	public MainFrame() {
		this.setBounds(0, 0, 1200, 800);
		
		this.add(new BackgroundPanel(this));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
