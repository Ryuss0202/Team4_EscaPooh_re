package com.escapooh.prol;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePanel {
	private JFrame jf;
	private JPanel jP;


	public ChangePanel(JFrame mf, JPanel panel) {
		this.jf = mf;
		this.jP = panel;
	}
	
	public void replacePanel(JPanel changePanel) {
		jf.remove(jP);
		jf.add(changePanel);
		jf.repaint();
	}
	
	public void resetPanel(){
		System.out.println("패널변경");
		jf.remove(jP);
		//JPanel panel = new GamePanel(mf);
		jf.add(jP);
		jf.repaint();
	}
	
	public void replaceRankPanel(JPanel changePanel){
		jf.remove(jP);
		jf.add(changePanel);
		jf.repaint();
	}
}
