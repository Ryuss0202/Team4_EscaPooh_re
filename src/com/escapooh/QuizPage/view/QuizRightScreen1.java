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

import com.escapooh.pooo.Room2;
import com.escapooh.pooo.Room3;
import com.escapooh.prol.ChangePanel;

public class QuizRightScreen1 extends JPanel {
	JFrame jf;
	JPanel jp;
	
	public QuizRightScreen1(JFrame jf)  {
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
		s[0] = "[ ㅈ ㅏ ㄹ ㅜ ㅁ ㅏ ㄷ ㅣ ]\n"+"를 낱말로 만든 다면 무엇이 될까?\n"+"1행성 2도시 3동물 4물고기";
		s[1] = "누군가의 매직 다이어리에는 요일마다\n"+"알 수 없는 숫자가 적혀 있다\n"+"물음표에 들어갈 것은?\n"+"THU = 6\n"+"TUE = 5\n"+"WED = 4\n"+"MON =?";
		s[2] = "뺼셈으로 된 규칙을 사용하여 답을 구하시오\n"+"4 3 3 9 0\n"+"7 8 5 5 2\n"+"1 7 8 0 ?";
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
				
				if(as.getText().equals("3")) {
					System.out.println("정답입니다");
					ChangePanel cp = new ChangePanel(jf, jp);
					Room3 t = new Room3(jf);
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
