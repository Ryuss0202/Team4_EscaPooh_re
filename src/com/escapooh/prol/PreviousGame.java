package com.escapooh.prol;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.escapooh.pooo.MainRoom;


//import com.escapooh.pooo.Pooo;

public class PreviousGame extends JFrame{
	public void preGame() {
		JFrame jf = new JFrame("ESCAPOOH");
		jf.setSize(1200, 800);
		
		JPanel jp = new JPanel();
		
		Image gameStory = new ImageIcon("background/스토리.png").getImage().getScaledInstance(1200, 800, 0);
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
				System.out.println("게임 프롤로그 화면 출력...");
				
				ChangePanel cp = new ChangePanel(jf, jp); //패널바꾸기 불러옴
				MainRoom t = new MainRoom(jf);
				cp.replacePanel(t); //패널 교체
				
			}
		});
		label.add(btnGame);
		jp.add(label);
		jf.add(jp);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
