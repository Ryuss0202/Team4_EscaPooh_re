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
import com.escapooh.prol.ChangePanel;

public class QuizLeftScreen2 extends JPanel {
	JFrame jf;
	JPanel jp;
	
	public QuizLeftScreen2(JFrame jf) {
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
		s[0] = "메소포타미아에서 사용되었던 고문자로 자획이,\n"+"쐐기 문양으로 되어있는고문자는 무엇일까요?\n"+"1표의문자 2설형문자 3표음문자\n"+"4음절문자 5단음문자";
		s[1] = "14세기-16세기 서유럽 문명사에서 나타나는\n"+" 문화운동으로 부활,재생이라는 뜻을 가지고\n"+ 
				"있는 이 문화운동은 무엇일까요?\n"+
				"1모더니즘 2르네상스 3종교개혁\n"+
				"4바로크 5휴머니즘";
		s[2] = "1970년대 미국과 구소련을 중심으로한\n"+"동,서진영간의 관계를 나타대는 말로 다음 중\n"+ 
				"데탕트(detente)와 관련된 것은 무엇일까요?\n"
				+"1냉전시대 2긴장완화 3양적완화 4무정부주의";
		int ran =(int)(Math.random()*s.length);
		
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
