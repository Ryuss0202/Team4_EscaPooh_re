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
		s[0] = "[ �� �� �� �� �� �� �� �� ]\n"+"�� ������ ���� �ٸ� ������ �ɱ�?\n"+"1�༺ 2���� 3���� 4�����";
		s[1] = "�������� ���� ���̾���� ���ϸ���\n"+"�� �� ���� ���ڰ� ���� �ִ�\n"+"����ǥ�� �� ����?\n"+"THU = 6\n"+"TUE = 5\n"+"WED = 4\n"+"MON =?";
		s[2] = "�E������ �� ��Ģ�� ����Ͽ� ���� ���Ͻÿ�\n"+"4 3 3 9 0\n"+"7 8 5 5 2\n"+"1 7 8 0 ?";
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
					System.out.println("�����Դϴ�");
					ChangePanel cp = new ChangePanel(jf, jp);
					Room3 t = new Room3(jf);
					cp.replacePanel(t);
					
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�");
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
