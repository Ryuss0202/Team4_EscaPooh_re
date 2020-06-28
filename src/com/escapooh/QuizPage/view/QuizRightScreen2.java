package com.escapooh.QuizPage.view;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.escapooh.pooo.Room4;
import com.escapooh.prol.ChangePanel;

public class QuizRightScreen2 extends JPanel{
	JFrame jf;
	JPanel jp;
	
	public QuizRightScreen2(JFrame jf) {
		Scanner sc = new Scanner(System.in);
		jf.setSize(1200, 800);
		
		JPanel jp = new JPanel();
		JTextField as = new JTextField(20);
		
		Font font1 = new Font("sans serif",Font.BOLD, 40);
		as.setFont(font1);
		jp.add(as);
		as.setBounds(560, 535, 90, 60);
		Font font = new Font("sans serif",Font.BOLD, 25);
		
		String[] s = new String[3];
		s[0] = "물음표에 들어갈 것은?\n"+"I am on Ear Pad [ ? ]\n"+"1 news 2 main 3 void 4 love";
		s[1] = "물음표에 들어갈 단어는?\n"+"0-Override-8-Text-13-19-?\n"+"1. public\n"+"2. buffer\n"+"3. String\n"+"4. new\n"+"5. panel";
		s[2] = "물음표에 들어갈 것은?\n"+"재난지원금 = 0 , 코로나바이러스 = 1\n"+"소프트웨어 = 2 , 미니프로젝트힘들어 = ?\n"+"자바이클립스 = 1\n"
		+"1번 : 4 , 2번 : 3 , 3번 : 2\n"+"4번 : 1 , 5번 : 5";
		int ran = (int)(Math.random()*s.length);
		
		JTextArea ta = new JTextArea(3,10);
		ta.setText(s[ran]);
		ta.setFont(font);
		jp.add(ta);
		ta.setBounds(375, 250, 520, 270);
		ta.setEditable(false);
	
		Image back1 = new ImageIcon("background/Honey background.png").getImage().getScaledInstance(1200, 800, 0);
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
					System.out.println("정답입니다");
					 //패널바꾸기 불러옴
		        	ChangePanel cp = new ChangePanel(jf, jp);
					Room4 t = new Room4(jf);
					cp.replacePanel(t); //패널 교체
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
