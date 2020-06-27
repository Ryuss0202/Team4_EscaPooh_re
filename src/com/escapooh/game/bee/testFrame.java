package com.escapooh.game.bee;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class testFrame extends JPanel{
	private JPanel jp;
	private JFrame jf;

	public testFrame(JFrame jf) {

		BeeRun g = new BeeRun(jf);
		g.gameLoop();
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
