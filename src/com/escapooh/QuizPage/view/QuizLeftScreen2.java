package com.escapooh.QuizPage.view;

import java.awt.Font;
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

import com.escapooh.pooo.Room2;
import com.escapooh.prol.ChangePanel;

public class QuizLeftScreen2 extends JPanel {
	JFrame jf;
	JPanel jp;
	
	public QuizLeftScreen2(JFrame jf) {
		
		jf.setSize(1200, 800);
		
		JPanel jp = new JPanel();

		Font font1 = new Font("sans serif",Font.BOLD, 40);
		JTextField as = new JTextField(20);
		as.setFont(font1);
		jp.add(as);
		as.setBounds(560, 535, 90, 60);
		
		Font font = new Font("sans serif",Font.BOLD, 23);
		JTextArea ta = new JTextArea(3,10);
		ta.setText("당신은 꽃이있는 정원에 있습니다\n."
				+ "해바라기, 장미, 나팔꽃과 달맞이꽃\n"
				+ "해바라기는 새벽에 피어서 낮에지고 \n"
				+ "장미는해가 뜰때 피고 해가질때 집니다\n"	
				+ "나팔꽃은 해가 질때 피고 해가 뜰때 집니다\n "
				+"달맞이꽃은 하루 온종일 피어있네요\n"
				+ "지금은 밤 이네요 지금 피어있는 꽃은 몇개입니까?\n");
		ta.setFont(font);
		jp.add(ta);
		ta.setBounds(375, 250, 520, 270);
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
					ChangePanel cp = new ChangePanel(jf, jp);
					Room2 t = new Room2(jf);
					cp.replacePanel(t);
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
