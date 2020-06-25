package com.escapooh.character;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import com.escapooh.pooo.MainFrame;





public class SelectCharacter extends JPanel{
	//메인 프레임
//	private MainFrame mf = new MainFrame();

	//메인 패널

	private JPanel panel = new JPanel();

	//이미지 아이콘
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


	//선택버튼
	private JButton select = new JButton();

	public SelectCharacter() {
		System.out.println("실행중");

		//버튼
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
				System.out.println("푸가 선택되었습니다.");
			}
		});

		SLTpiglet.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("피글렛이 선택되었습니다.");
			}
		});
		SLTtigger.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("티거가 선택되었습니다.");
			}
		});


		//버튼
		select.setPressedIcon(selectedButton);
		select.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게임이 시작됩니다.");
			}
		});
		select.setIcon(selectButton);
		select.setBounds(430, 650, 300, 100);

		select.setBorderPainted(false); 
		select.setFocusPainted(false); 
		select.setContentAreaFilled(false);

		label.setLayout(null);
		label.setBounds(0, 0, 1200, 800);


		//확인용
		//패널 생성되어 있음.
		//panel.add();

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
	}



	public void button(JButton b) {

		b.setBorderPainted(false); 
		b.setFocusPainted(false); 
		b.setContentAreaFilled(false);
	}

	//임시 메인메소드
	public static void main(String[] args) {
		new SelectCharacter();
	}
}
