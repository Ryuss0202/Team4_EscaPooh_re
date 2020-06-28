package com.escapooh.game.bee;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.escapooh.loginPage.loginMain.MainFrame;
import com.escapooh.prol.ChangePanel;

public class Attention extends JPanel{
	private JFrame jf;
	private JPanel jp;
	private JLabel jb;
	Image BGimg = new ImageIcon("images/testback.png").getImage().getScaledInstance(1200, 800, 0);

	public Attention(JFrame jf) {
		this.jf = jf;
		jp = this;
		setLayout(null);
		setBounds(0, 0, 1200, 800);
		ImageIcon login = new ImageIcon("background/login.png");
		ImageIcon selectedButton = new ImageIcon("background/bbt.png");
		
		
		JButton jb = new JButton(login);
		jb.setBorderPainted(false);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
		jb.setBounds(500, 600, 200, 126);

		JLabel jl;
		jl = new JLabel(new ImageIcon(BGimg));
		jl.setBounds(0, 0, 1200, 800);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				ChangePanel cp = new ChangePanel(jf, jp);
//				cp.resetPanel();
//				cp.replacePanel(jp);
				BeeRun br = new BeeRun(jf);
//jf.remove(jp);
//jf.add(br);
//br.repaint();
new testFrame();

				//g.gameLoop();
			}
		});
		
		jb.setPressedIcon(selectedButton);
		add(jb);
		add(jl);
		
		JPanel jp = new JPanel();
		jf.setBounds(0, 0, 1200, 800);
		jf.add(this);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0, 0);
		setVisible(true);
		add(jp);
	}



	public static void main(String[] args) {
		JFrame jf = new JFrame();

		new Attention(jf);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
