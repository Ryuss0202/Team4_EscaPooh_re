package com.escapooh.prol;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePanel {
	private JFrame jf;
	private JPanel jp;


	public ChangePanel(JFrame jf, JPanel jp) {
		this.jf = jf;
		this.jp = jp;
	}
	
	public void replacePanel(JPanel changePanel) {
		jf.remove(jp);
		jf.add(changePanel);
		jf.repaint();
	}
	
	public void resetPanel(){
		System.out.println("패널변경");
		jf.remove(jp);
		//JPanel panel = new GamePanel(mf);
		jf.add(jp);
		jf.repaint();
	}
	
//	public void replaceRankPanel(JPanel changePanel){
//		jf.remove(jp);
//		jf.add(changePanel);
//		jf.repaint();
//	}
}
