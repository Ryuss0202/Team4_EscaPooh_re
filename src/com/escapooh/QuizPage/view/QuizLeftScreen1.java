package com.escapooh.QuizPage.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.escapooh.game.gameover.GameOver;
import com.escapooh.pooo.Room1;
import com.escapooh.prol.ChangePanel;

public class QuizLeftScreen1 extends JPanel	 {
	JFrame jf ;
	JPanel jp;
	private int life;
	public QuizLeftScreen1(JFrame jf) {
		
		life = 3;
		ImageIcon fullLife_img1 = new ImageIcon("images/heart_ full 1.png") ;
	    ImageIcon fullLife_img2 = new ImageIcon("images/heart_ full 1.png");
	    ImageIcon fullLife_img3 = new ImageIcon("images/heart_ full 1.png"); 
	    ImageIcon empty1 = new ImageIcon("heart_empty.png");
	    ImageIcon empty2 = new ImageIcon("heart_empty.png");
	    ImageIcon empty3 = new ImageIcon("heart_empty.png");
		
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
		String[] s = new String[3];
		s[0] = "�������� �ſ� ������ ���� �ߴ�\n" + "���� �̸��� �����ϱ��?\n"+"1�� �׹ʴ� 2���ʽ´�\n" + "3�� ������ 4�� ����\n";
		s[1] = "000������� ������ �̶�� �Ҹ���,\n" +" �츮���� �� ��� \n" + 
				"���� ������ �� �� �ϳ��Դϴ�.\n"+"  000�� �� ���� �����ϱ��?\n"+"1������2�溹��3�����4���ֵ�";
		s[2] = "���� �� ����� ȭ������� ������ ����\n"+" ���� ���� �����ϱ��?\n"+"1����:�޷� 2:�߱�:����\n"+"3�Ϻ�:�� 4ĥ�����";
		int ran = (int)(Math.random()*s.length);
		
		
		JTextArea ta = new JTextArea(3,10);
		ta.setText(s[ran]);
		//ta.setText("�α⸦ ������ ��󸶷� \n" + "80,90��� �̾߱⸦ ��Ƴ�����\n" + "3���� �ø������ ���� \n" +"�� ������� ����\n"+ "ù ��° ���ڴ� �����ΰ���?");
		ta.setFont(font);
		jp.add(ta);
		ta.setBounds(375, 250, 520, 270);
		ta.setEditable(false);
	
		Image back1 = new ImageIcon("background/Honey background.png").getImage().getScaledInstance(1200, 800, 0);
		JLabel label1 = new JLabel(new ImageIcon(back1));
		ImageIcon answer = new ImageIcon("background/answer.png");
		
		JButton answeres = new JButton(answer);
		
		JLabel life1= new JLabel(fullLife_img1);
		life1.setBounds(56, 6,87 ,94);
	
		JLabel life2 = new JLabel(fullLife_img2);
		life2.setBounds(149, 6,87 ,94);
		
		JLabel life3 = new JLabel(fullLife_img3);
		life3.setBounds(238, 6,87 ,94);
		
		JLabel emptylife1= new JLabel(empty1);
		emptylife1.setBounds(56, 6,87 ,94);
		
		JLabel emptylife2 = new JLabel(empty2);
		emptylife2.setBounds(56, 6,87 ,94);
		
		JLabel emptylife3= new JLabel(empty3);
		emptylife3.setBounds(56, 6,87 ,94);
		
		answeres.setBounds(503, 600, 200, 100);
		answeres.setBorderPainted(false);
		answeres.setFocusPainted(false);
		answeres.setContentAreaFilled(false);
		
		answeres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(as.getText().equals("1")) {
					System.out.println("�����Դϴ�");
					 
		        	ChangePanel cp = new ChangePanel(jf, jp);
					Room1 t = new Room1(jf);
						cp.replacePanel(t); //�г� ��ü
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�");
					
					life --;
					if(life == 2) {
						life3.remove(life3);
						life3.setIcon(empty3);
						
						label1.add(life1);
						label1.add(life2);
						label1.add(ta);
						label1.add(as);
						label1.add(answeres);
						label1.add(life1);
						label1.add(life2);
						label1.add(life3);
						
						jp.add(label1);
						jf.add(jp);
						
					}else if(life==1) {
						life3.remove(life3);
						life2.remove(life2);
						life3.setIcon(empty3);
						life2.setIcon(empty2);
						
				
						label1.add(life1);
						label1.add(life2);
						label1.add(life3);
						label1.add(ta);
						label1.add(as);
						label1.add(answeres);
						label1.add(life1);
						label1.add(life2);
						label1.add(life3);
						
						jp.add(label1);
						jf.add(jp);
						
					}else if(life ==0) {
						life3.remove(life3);
						life2.remove(life2);
						life1.remove(life1);
						life3.setIcon(empty3);
						life2.setIcon(empty2);
						life1.setIcon(empty1);
						
						
						label1.add(life1);
						label1.add(life2);
						label1.add(life3);
						label1.add(ta);
						label1.add(as);
						label1.add(answeres);
						label1.add(life1);
						label1.add(life2);
						label1.add(life3);
						
						jp.add(label1);
						jf.add(jp);
						
						
						ChangePanel cp = new ChangePanel(jf, jp);
						GameOver t = new GameOver(jf);
							cp.replacePanel(t); //�г� ��ü
				}
				
			}
		}
			});
		
		label1.add(life1);
		label1.add(life2);
		label1.add(life3);
		label1.add(ta);
		label1.add(as);
		label1.add(answeres);
		
		jp.add(label1);
		jf.add(jp);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
		
		
	}
	
	
	