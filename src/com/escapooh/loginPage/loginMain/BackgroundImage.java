package com.escapooh.loginPage.loginMain;

import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.escapooh.loginPage.model.dao.Sign02;
import com.escapooh.prol.PreviousGame;

public class BackgroundImage extends JFrame {

		
	
	public void main() {


		JFrame jf = new JFrame("ESCAPOOH");
		jf.setSize(1200, 800);

		JPanel jp = new JPanel();

		TextField id = new TextField(15);
		jp.add(id);
		id.setBounds(360, 359, 350, 40);
		TextField pwd = new TextField(15);
		jp.add(pwd);
		pwd.setEchoChar('*');
//		JPasswordField pwd = new JPasswordField(15);
//		jp.add(pwd);	
		pwd.setBounds(360, 409, 350, 40);

		Image back = new ImageIcon("background/main (1).png").getImage().getScaledInstance(1200, 800, 0);
		JLabel label = new JLabel(new ImageIcon(back));


		ImageIcon login = new ImageIcon("background/Group 2.png");
		ImageIcon join = new ImageIcon("background/Group 3.png");


		JButton  joinbtn = new JButton(join);

		joinbtn.setBounds(400, 483, 294, 50);
		joinbtn.setBorderPainted(false);
		joinbtn.setFocusPainted(false);
		joinbtn.setContentAreaFilled(false);

		joinbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Sign02 s2= new Sign02();


			}
		});

		JButton button = new JButton(login);

		button.setBounds(720, 344, 200,126);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);

		button.addActionListener(new ActionListener() {
			//클릭확인 코드
			@Override
			public void actionPerformed(ActionEvent e2) {
				 try{
		               String s;
		               String[] array;
		               BufferedReader bos = new BufferedReader(new FileReader("Members.txt"));
		               while((s=bos.readLine())!=null){
		                  array=s.split("/");
		                  if(id.getText().equals(array[1]) && pwd.getText().equals(array[2])) {

		                	  
		                	  JOptionPane.showMessageDialog(null, "로그인이 확인 되었습니다.");
		                     
		                	  PreviousGame pg = new PreviousGame();
		                	  pg.preGame();
		                      
		                  
		                  } else {
		                  
		                	  JOptionPane.showMessageDialog(null, "로그인이 실패하였습니다.");
		                  
		                  }
		               }
		               
		               
		               bos.close();
		               dispose();
		            }catch (IOException E10){
		               E10.printStackTrace();
		            }
				
				
				
				
				
				
				
//				if(id.getText().equals("test") && new String(pwd.getPassword()).equals("1234")){
//					System.out.println("로그인 성공");
//
//					// PreviousGame pg = new PreviousGame();
//					//	 pg.preGame();
//
//				}else {
//					System.out.println("로그인실패");
//				}

				/*LoginInfo lf = new LoginInfo();
				//	lf.loginInfoRead(id.toString(), pwd.toString());

					if((lf.getId().equals(id.toString()))&& (lf.getPwd().equals(pwd.toString()))) {
						System.out.println("로그인 성공");


					}else {
						System.out.println("로그인 실패");
					}
				 */			}
		});
		
		
		label.add(id);
		label.add(pwd);
		label.add(joinbtn);
		label.add(button);
		jp.add(label);
		jf.add(jp);		

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


