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

public class QuizRightScreen1 extends JPanel {
	JFrame jf;
	JPanel jp;
	
	public QuizRightScreen1(JFrame jf) {
		
//		jf.setSize(1200, 800);
		
		JPanel jp = new JPanel();
		
		JTextField as = new JTextField(15);
		jp.add(as);
		as.setBounds(560, 575, 90, 30);
		
		
		JTextArea ta = new JTextArea(3,10);
		ta.setText("버스에 5명이 있었습니다"
				+ "다음정류장에서 6명이 타고 3명이 내리고\n"
				+ "그다음 정류장에서 5명이 내리고 1명이 타고\n"
				+ "그다음 정류장에서 7명이 타고 4명이 내리고\n"
				+ "그다음 정류장에서 5명이 내리고 1명이 탔습니다\n"
				+ "지금 버스에 남아있는 사람은 몇명인가요?\n");
		jp.add(ta);
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
				
				if(as.getText().equals("3")) {
					System.out.println("정답입니다");
				}else {
					System.out.println("틀렸습니다");
				}
			}
		});
		
		label1.add(ta);
		label1.add(as);
		label1.add(answeres);
		
		jp.add(label1);
		jf.add(jp);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
}
