package com.escapooh.semiboss;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.BoldAction;

public class EnterPassword extends JPanel {

	JFrame jf ; 
	JPanel jp ;
	
	public EnterPassword(JFrame jf) {
		
		Image pwdsmall = new ImageIcon("images/quizback.png").getImage();
	    Image pwdBig = new ImageIcon("images/quizpwdback.png").getImage();
	    Image backgr = new ImageIcon("images/quizroom.png").getImage().getScaledInstance(1200, 800, 0);
	    ImageIcon answer_btn = new ImageIcon("images/correctAnswer.png");
	    ImageIcon backpanel = new ImageIcon("images/back.png");
	    
	    Image fullLife_img1 = new ImageIcon("images/��Ʈ_ full 1.png").getImage() ;
	    Image fullLife_img2 = new ImageIcon("images/��Ʈ_ full 1.png").getImage();
	    Image fullLife_img3 = new ImageIcon("images/��Ʈ_ full 1.png").getImage();
	    Image lockdoor_img = new ImageIcon("images/Group 12 (1).png").getImage();
	    Image empty = new ImageIcon("��Ʈ_empty.png").getImage();
	    
	    
	    Font font = new Font("sans serif",Font.BOLD, 30);
	    
	    JTextField a1 = new JTextField(1);
	    a1.setBounds(413, 341, 34, 130);
	    JTextField a2 = new JTextField(2);
	    a2.setBounds(529, 341, 34, 130);
	    JTextField a3 = new JTextField(2);
	    a3.setBounds(643, 341, 34, 130);
	    JTextField a4 = new JTextField(2);
	    a4.setBounds(757, 341, 34, 130);
	    
	    a1.setFont(font);
	    a2.setFont(font);
	    a3.setFont(font);
	    a4.setFont(font);
	    
	    jf.setSize(1200, 800);
		JPanel jp = new JPanel();
		
		JLabel pwdbig1 = new JLabel(new ImageIcon(pwdBig));
		pwdbig1.setBounds(200, 176, 805, 441);

		JLabel pwdsmall1 = new JLabel(new ImageIcon(pwdsmall));
		pwdsmall1.setBounds(354, 275, 506, 232);
		
		JLabel ldoor = new JLabel(new ImageIcon(lockdoor_img));
		ldoor.setBounds(500,48,214 ,153);
		
		JLabel backLabel = new JLabel(new ImageIcon(backgr));
		
		JLabel life1= new JLabel(new ImageIcon(fullLife_img1));
		life1.setBounds(56, 6,87 ,94);
		
		JLabel life2 = new JLabel(new ImageIcon(fullLife_img2));
		life2.setBounds(171, 6,87 ,94);
		
		JLabel life3 = new JLabel(new ImageIcon(fullLife_img3));
		life3.setBounds(230, 6,87 ,94);
		
		JButton answer = new JButton(answer_btn);
		
		answer.setBounds(423, 523, 140, 62);
		answer.setBorderPainted(false);
		answer.setFocusPainted(false);
		answer.setContentAreaFilled(false);
		
		answer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ư Ŭ�� �׽�Ʈ
				System.out.println("���� ��ưŬ��..");
			}
		});
		
		JButton back = new JButton(backpanel);
		
		back.setBounds(643, 523, 140, 62);
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
	
		
		backLabel.add(a1);
		backLabel.add(a2);
		backLabel.add(a3);
		backLabel.add(a4);
		backLabel.add(pwdbig1);
		backLabel.add(pwdsmall1);
		backLabel.add(answer);
		backLabel.add(back);
      	backLabel.add(ldoor);
		backLabel.add(life1);
		backLabel.add(life2);
		backLabel.add(life3);
		jp.add(backLabel);
		jf.add(jp);
    	
    	
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
