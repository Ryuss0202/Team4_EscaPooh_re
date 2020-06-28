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
		
		Font font1 = new Font("맑은고딕",Font.BOLD, 40);
		as.setFont(font1);
		jp.add(as);
		as.setBounds(560, 535, 90, 60);
		Font font = new Font("sans serif",Font.BOLD, 25);
		
//

		
		JTextArea ta = new JTextArea(3,10);
		ta.setText("양자역확과 상대성이론은 어떤 관련이 있는지와\n"+"끈이론을 수학적으로 설명하시오");
		//ta.setText("인기를 끌었던 드라마로 \n" + "80,90년대 이야기를 담아내었고\n" + "3개의 시리즈까지 나온 \n" +"이 드라마제목에 들어가는\n"+ "첫 번째 숫자는 무엇인가요?");
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
					System.out.println("정답입니다");
					 
//		        	ChangePanel cp = new ChangePanel(jf, jp);
//					Room1 t = new Room1(jf);
//						cp.replacePanel(t); //패널 교체
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
	
	public void main(String[] args) {
		difficult Frame = new difficult();
	}
		
		
	}
	
	

