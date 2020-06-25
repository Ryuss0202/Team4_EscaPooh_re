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

public class QuizLeftScreen2 extends JPanel {
	
	public void main2() {
		JFrame fr = new JFrame("QUIZPAGE");
		fr.setSize(1200, 800);
		
		JPanel pl = new JPanel();
		
		JTextField as = new JTextField(15);
		pl.add(as);
		as.setBounds(560, 575, 90, 30);
		
		
		JTextArea ta = new JTextArea(3,10);
		ta.setText("당신은 꽃이있는 정원에 있습니다\n."
				+ "해바라기, 장미, 나팔꽃과 달맞이꽃\n"
				+ "해바라기는 새벽에 피어서 낮에지고 장미는해가 뜰때 피고 해가질때 집니다	\n"
				+ "나팔꽃은 해가 질때 피고 해가 뜰때 집니다 달맞이꽃은 하루 온종일 피어있네요\n"
				+ "지금은 밤 이네요 지금 피어있는 꽃은 몇개입니까?\n");
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
				if(as.getText().equals("2")) {
					System.out.println("정답입니다");
				}else {
					System.out.println("틀렸습니다");
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
