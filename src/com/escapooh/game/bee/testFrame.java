package com.escapooh.game.bee;

import javax.swing.JFrame;

import com.escapooh.pooo.TestRunFrame;

public class testFrame {


	public static void main(String[] args) {

		JFrame jf = new JFrame("testFrame");
		jf.setBounds(0,0,1200,800);

		BeeRun g = new BeeRun(jf);
		g.gameLoop();
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
