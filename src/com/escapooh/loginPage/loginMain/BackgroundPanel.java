package com.escapooh.loginPage.loginMain;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.escapooh.prol.PreviousGame;

public class BackgroundPanel extends JPanel	{
	private JFrame mf;
	private JPanel jp;
	private JTextField id;
	private JTextField pwd;

	private String sId = "";
	private String sPwd = "";

	public BackgroundPanel(JFrame mf) {
		this.mf = mf;
		this.setLayout(null);

		jp = this;

		JLabel label = new JLabel(new ImageIcon(new ImageIcon("background/main_id.png").getImage().getScaledInstance(1200, 800, 0))); 
		label.setBounds(0, 0, 1200, 800);


		id = new JTextField(15);
		id.setBounds(360, 360, 350, 40);

		pwd = new JPasswordField(15);
		pwd.setBounds(360, 410, 350, 40);

		ImageIcon login = new ImageIcon("background/login.png");
		JButton loginbtn = new JButton(login);
		loginbtn.setBorderPainted(false);
		loginbtn.setFocusPainted(false);
		loginbtn.setContentAreaFilled(false);
		loginbtn.setBounds(720, 344, 200, 126);
		loginbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel cp = new ChangePanel(mf, jp);
				try{
					String s;
					String[] array;
					BufferedReader bos = new BufferedReader(new FileReader("Members.txt"));
					while((s=bos.readLine())!=null){
						array=s.split("/");
					if(id.getText().equals(array[1])&&pwd.getText().equals(array[2]))
					{
						JOptionPane.showMessageDialog(null, "�α����� �Ǿ����ϴ�!!");

						PreviousPanel pg = new PreviousPanel(mf);
						cp.replacePanel(pg);
						
//						PreviousGame pg = new PreviousGame(mf);
//						pg.preGame();
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "�α����� �����Ͽ����ϴ�.");
					}
					}
					bos.close();
					//dispose();
				}catch (IOException E10){
					E10.printStackTrace();
				}









				//				boolean bLoginChk = false;

				//				GetIdandPW(id, pwd);
				//				Login_Chk loginchk = new Login_Chk();
				//				bLoginChk = loginchk.LoginList_Chk(sId, sPwd);
				//				
				//				if(!bLoginChk) {
				//					JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��� ��ȣ�� Ȯ�����ּ���");
				//				} else {
				//					
				//					PreviousPanel pg = new PreviousPanel(mf);
				//					cp.replacePanel(pg);
				//				}
				//				
				//				
				//
				//				
				//			}
				//
				//			private void GetIdandPW(JTextField id, JTextField pwd) {
				//				sId = id.getText();
				//				sPwd = pwd.getText();
				//				
				//			}
				//			
				//			private void Reset(JTextField Id, JTextField Pw) {
				//				Id.setText(null);
				//				Pw.setText(null);



			}

		});

		ImageIcon join = new ImageIcon("background/signup.png");
		JButton joinbtn = new JButton(join);
		joinbtn.setBorderPainted(false);
		joinbtn.setFocusPainted(false);
		joinbtn.setContentAreaFilled(false);
		joinbtn.setBounds(400, 483, 294, 50);
		joinbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SignupFrame s = new SignupFrame();
			}

		});




		this.add(loginbtn);
		this.add(joinbtn);
		this.add(label);		
		this.add(id);
		this.add(pwd);
		//		this.setComponentZOrder(label, 1);

		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
