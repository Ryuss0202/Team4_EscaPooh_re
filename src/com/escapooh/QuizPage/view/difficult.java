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

import com.escapooh.pooo.Room1;
import com.escapooh.prol.ChangePanel;

public class difficult extends JPanel {
	JFrame jf ;
	JPanel jp;
	public difficult() {
		Scanner sc = new Scanner(System.in);
		jf.setSize(1200, 800);
		
		JPanel jp = new JPanel();
		JTextField as = new JTextField(30);
		
		Font font1 = new Font("�������",Font.BOLD, 40);
		as.setFont(font1);
		jp.add(as);
		as.setBounds(560, 535, 90, 60);
		Font font = new Font("sans serif",Font.BOLD, 25);
		
//

		
		JTextArea ta = new JTextArea(3,10);
		ta.setText("���ڿ�Ȯ�� ��뼺�̷��� � ������ �ִ�����\n"+"���̷��� ���������� �����Ͻÿ�");
		//ta.setText("�α⸦ ������ ��󸶷� \n" + "80,90��� �̾߱⸦ ��Ƴ�����\n" + "3���� �ø������ ���� \n" +"�� ������� ����\n"+ "ù ��° ���ڴ� �����ΰ���?");
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
			
				if(as.getText().equals("")) {
					System.out.println("�����Դϴ�");
					 
//		        	ChangePanel cp = new ChangePanel(jf, jp);
//					Room1 t = new Room1(jf);
//						cp.replacePanel(t); //�г� ��ü
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
	
	public void main(String[] args) {
		difficult Frame = new difficult();
	}
		
		
	}
	
	

