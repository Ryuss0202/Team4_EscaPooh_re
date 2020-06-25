package com.escapooh.loginPage.loginMain;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SignupFrame extends JFrame{
	public SignupFrame() {
		JPanel jp = new JPanel();
		Label l1 = new Label("이름");   
		Label l2 = new Label("ID");
		Label l3 = new Label("PassWord");
		Label l4 = new Label("NickName");
		Label l5 = new Label("Email");

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);

		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();
		TextField t5 = new TextField();

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);

		t3.setEchoChar('*');
		JButton j1 = new JButton("저장");
		//JButton j2 = new JButton("취소");

		add(j1);
		//add(j2);

		l1.setBounds( 40,  10,  60, 40);
		l2.setBounds( 40,  50,  60, 40);
		l3.setBounds( 40,  90,  60, 40);
		l4.setBounds( 40, 130,  60, 40);
		l5.setBounds( 40, 170,  60, 40);
		t1.setBounds(120,  10, 200, 30);
		t2.setBounds(120,  50, 200, 30);
		t3.setBounds(120,  90, 200, 30);
		t4.setBounds(120, 130, 200, 30);
		t5.setBounds(120, 180, 280, 30);
		j1.setBounds(180, 330,  80, 30);
		//j2.setBounds(240, 330,  80, 30); 

		add(jp);

		setSize(500,500);
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent T) {      //회원가입 데이터 저장
				try{
					BufferedWriter bos = new BufferedWriter(new FileWriter("Members.txt",true));
					bos.write(t1.getText()+"/");
					bos.write(t2.getText()+"/");
					bos.write(t3.getText()+"/");
					bos.write(t4.getText()+"/");
					bos.write(t5.getText()+"\r\n");
					bos.close();
					JOptionPane.showMessageDialog(null, "회원가입을 해줘서 고마워!!");
					dispose();
				}catch (Exception ex){
					JOptionPane.showMessageDialog(null, "뭔가 잘못된것 같아.. 회원가입은 실패야..");
				}
			}
		});
	} 
}
