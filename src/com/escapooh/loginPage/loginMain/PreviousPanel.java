package com.escapooh.loginPage.loginMain;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.escapooh.pooo.Test;
import com.escapooh.prol.ChangePanel;

public class PreviousPanel extends JPanel {
		private JFrame mf;
		private JPanel jp;
		
		public PreviousPanel(JFrame mf) {
			this.mf = mf;
			jp = this;
		Image gameStory = new ImageIcon("background/���丮.png").getImage().getScaledInstance(1200, 800, 0);
		JLabel label = new JLabel(new ImageIcon(gameStory));
		
		ImageIcon startGame = new ImageIcon("background/Vector.png");
		JButton  btnGame = new JButton(startGame);
		
		btnGame.setBounds(808, 644, 223, 58);
		btnGame.setBorderPainted(false);
		btnGame.setFocusPainted(false);
		btnGame.setContentAreaFilled(false);
		
		btnGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� ���ѷα� ȭ�� ���...");
				
				ChangePanel cp = new ChangePanel(mf, jp); 
				Test t = new Test(mf);

				cp.replacePanel(t); //�г� ��ü
				
			}
		});
		label.add(btnGame);
		jp.add(label);
		mf.add(jp);
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
 }
