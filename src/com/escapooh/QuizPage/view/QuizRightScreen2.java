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

import com.escapooh.pooo.Room4;
import com.escapooh.prol.ChangePanel;

public class QuizRightScreen2 extends JPanel{
	JFrame jf;
	JPanel jp;
	
	public QuizRightScreen2(JFrame jf) {
		
		jf.setSize(1200, 800);
		
		JPanel jp = new JPanel();
		
		
		JTextField as = new JTextField(15);
		jp.add(as);
		as.setBounds(560, 575, 90, 30);
		
		
		JTextArea ta = new JTextArea(3,10);
		ta.setText("������ �� + �������� - �����Ʋ� = ?\n"
				+ "������ ��� �����Դϴ�?");
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
				
				if(as.getText().equals("4")) {
					System.out.println("�����Դϴ�");
					 //�гιٲٱ� �ҷ���
		        	ChangePanel cp = new ChangePanel(jf, jp);
					Room4 t = new Room4(jf);
					cp.replacePanel(t); //�г� ��ü
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
