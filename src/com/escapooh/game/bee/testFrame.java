package com.escapooh.game.bee;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.escapooh.loginPage.loginMain.MainFrame;


public class testFrame extends JPanel{
	private JPanel jp;
	private JFrame jf;

	
	public static void main(String[] args) {
	//public testFrame() {

		JFrame jf = new JFrame();
		BeeRun g = new BeeRun(jf);
		g.gameLoop();
	}
}
