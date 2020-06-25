package com.escapooh.loginPage.loginMain;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePanel {
	private JFrame mf;
	private JPanel JP;


	public ChangePanel(JFrame mf, JPanel panel) {
		this.mf = mf;
		this.JP = panel;
	}
	
	public void replacePanel(JPanel changePanel) {
		mf.remove(JP);
		mf.add(changePanel);
		mf.repaint();
	}
	
	public void resetPanel(){
		System.out.println("패널변경");
		mf.remove(JP);
		//JPanel panel = new GamePanel(mf);
		mf.add(JP);
		mf.repaint();
	}
	
	public void replaceRankPanel(JPanel changePanel){
		mf.remove(JP);
		mf.add(changePanel);
		mf.repaint();
	}
}
