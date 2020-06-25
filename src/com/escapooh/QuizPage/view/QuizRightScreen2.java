package com.escapooh.QuizPage.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QuizRightScreen2 {
	
	public void main4() {
		JFrame fr = new JFrame("QUIZPAGE");
		fr.setSize(1200, 800);
		
		JPanel pl = new JPanel();
		
		
		JTextField as = new JTextField(15);
		pl.add(as);
		as.setBounds(560, 575, 90, 30);
		
		
		JTextArea ta = new JTextArea(3,10);
		ta.setText("µµ∂Û¡ˆ ≤… + ∞≥≥™∏Æ≤… - ∫πº˛æ∆≤… = ?\n"
				+ "≤…¿Ÿ¿∫ ∏µŒ ∏Ó¿Â¿‘¥œ¥Ÿ?");
		pl.add(ta);
		ta.setBounds(375, 250, 450, 250);
		ta.setEditable(false);
	
		
		
		
		Image back1 = new ImageIcon("background/QuizMainScreen.png").getImage().getScaledInstance(1200, 800, 0);
		JLabel label1 = new JLabel(new ImageIcon(back1));
		
		
		
		
		ImageIcon answer = new ImageIcon("background/answer.png");
		
		
		
		
		
		JButton answeres = new JButton(answer);
		
		answeres.setBounds(503, 600, 200, 100);
		answeres.setBorderPainted(false);
		answeres.setFocusPainted(false);
		answeres.setContentAreaFilled(false);
		
		answeres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(as.getText().equals("4")) {
					System.out.println("¡§¥‰¿‘¥œ¥Ÿ");
				}else {
					System.out.println("∆≤∑»Ω¿¥œ¥Ÿ");
				}
			}
		});
		
		label1.add(ta);
		label1.add(as);
		label1.add(answeres);
		
		pl.add(label1);
		fr.add(pl);
		
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
}
