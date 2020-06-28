
//package com.escapooh.character;
//
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//import com.escapooh.pooo.MainFrame;
//
//
//
//
//
//public class SelectCharacter extends JPanel{
//	//硫붿씤 �봽�젅�엫
//	private MainFrame mf = new MainFrame();
//
//	//硫붿씤 �뙣�꼸
//
//	private JPanel panel = new JPanel();
//
//	//�씠誘몄� �븘�씠肄�
//	private ImageIcon selectButton = new ImageIcon("images/selectButton.png");
//	private ImageIcon selectedButton = new ImageIcon("images/selectButton2.png");
//
//	private ImageIcon pooh = new ImageIcon("images/pooh.png");
//	private ImageIcon piglet = new ImageIcon("images/piglet.png");
//	private ImageIcon tigger = new ImageIcon("images/tigger.png");
//	private Image BG = new ImageIcon("images/select.png").getImage().getScaledInstance(1200, 800, 0);
//
//	private JButton SLTpooh = new JButton();
//	private JButton SLTpiglet = new JButton();
//	private JButton SLTtigger = new JButton();
//
//	private JLabel label = new JLabel(new ImageIcon(BG));
//
//
//	//�꽑�깮踰꾪듉
//	private JButton select = new JButton();
//
//	public SelectCharacter() {
//		System.out.println("�떎�뻾以�");
//
//		//踰꾪듉
//		button(SLTpooh);
//		button(SLTpiglet);
//		button(SLTtigger);
//
//		SLTpooh.setIcon(pooh);
//		SLTpooh.setBounds(100, 250, 300, 400);
//
//		SLTpiglet.setIcon(piglet);
//		SLTpiglet.setBounds(430, 250, 300, 400);;
//
//		SLTtigger.setIcon(tigger);
//		SLTtigger.setBounds(750, 250, 300, 400);
//
//
//		SLTpooh.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("�뫖媛� �꽑�깮�릺�뿀�뒿�땲�떎.");
//			}
//		});
//
//		SLTpiglet.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("�뵾湲��젢�씠 �꽑�깮�릺�뿀�뒿�땲�떎.");
//			}
//		});
//		SLTtigger.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("�떚嫄곌� �꽑�깮�릺�뿀�뒿�땲�떎.");
//			}
//		});
//
//
//		//踰꾪듉
//		select.setPressedIcon(selectedButton);
//		select.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("寃뚯엫�씠 �떆�옉�맗�땲�떎.");
//			}
//		});
//		select.setIcon(selectButton);
//		select.setBounds(430, 650, 300, 100);
//
//		select.setBorderPainted(false); 
//		select.setFocusPainted(false); 
//		select.setContentAreaFilled(false);
//
//		label.setLayout(null);
//		label.setBounds(0, 0, 1200, 800);
//
//
//		//�솗�씤�슜
//		//�뙣�꼸 �깮�꽦�릺�뼱 �엳�쓬.
//		//panel.add();
//
//		mf.setBounds(0,0,1200,800);
//
//		mf.add(SLTpooh);
//		mf.add(SLTpiglet);
//		mf.add(SLTtigger);
//
//		mf.add(select);
//
//		mf.setResizable(false);
//		mf.setLocationRelativeTo(null);
//
//		mf.setLayout(null);
//		mf.add(label);
//		mf.setVisible(true);
//		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//
//
//	public void button(JButton b) {
//
//		b.setBorderPainted(false); 
//		b.setFocusPainted(false); 
//		b.setContentAreaFilled(false);
//	}
//
//	//�엫�떆 硫붿씤硫붿냼�뱶
//	public static void main(String[] args) {
//		new SelectCharacter();
//	}
//}

package com.escapooh.character;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class SelectCharacter extends JPanel{


	private JPanel panel = new JPanel();

	private ImageIcon selectButton = new ImageIcon("images/selectButton.png");
	private ImageIcon selectedButton = new ImageIcon("images/selectButton2.png");

	private ImageIcon pooh = new ImageIcon("images/pooh.png");
	private ImageIcon piglet = new ImageIcon("images/piglet.png");
	private ImageIcon tigger = new ImageIcon("images/tigger.png");
	private Image BG = new ImageIcon("images/select.png").getImage().getScaledInstance(1200, 800, 0);

	private JButton SLTpooh = new JButton();
	private JButton SLTpiglet = new JButton();
	private JButton SLTtigger = new JButton();

	private JLabel label = new JLabel(new ImageIcon(BG));

	private JFrame mf = new JFrame();
	private JButton select = new JButton();

	public SelectCharacter() {
		System.out.println("start");

		button(SLTpooh);
		button(SLTpiglet);
		button(SLTtigger);

		SLTpooh.setIcon(pooh);
		SLTpooh.setBounds(100, 250, 300, 400);

		SLTpiglet.setIcon(piglet);
		SLTpiglet.setBounds(430, 250, 300, 400);;

		SLTtigger.setIcon(tigger);
		SLTtigger.setBounds(750, 250, 300, 400);


		SLTpooh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("pooh.");
			}
		});

		SLTpiglet.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("piglet.");
			}
		});
		SLTtigger.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("tigger.");
			}
		});


		select.setPressedIcon(selectedButton);
		select.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("select.");
			}
		});
		select.setIcon(selectButton);
		select.setBounds(430, 650, 300, 100);

		select.setBorderPainted(false); 
		select.setFocusPainted(false); 
		select.setContentAreaFilled(false);

		label.setLayout(null);
		label.setBounds(0, 0, 1200, 800);


		//panel.add();

		mf.setBounds(0,0,1200,800);

		mf.add(SLTpooh);
		mf.add(SLTpiglet);
		mf.add(SLTtigger);

		mf.add(select);

		mf.setResizable(false);
		mf.setLocationRelativeTo(null);

		mf.setLayout(null);
		mf.add(label);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



	public void button(JButton b) {

		b.setBorderPainted(false); 
		b.setFocusPainted(false); 
		b.setContentAreaFilled(false);
	}

	public static void main(String[] args) {
		new SelectCharacter();
	}
}

