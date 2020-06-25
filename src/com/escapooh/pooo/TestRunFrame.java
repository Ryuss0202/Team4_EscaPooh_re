package com.escapooh.pooo;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.escapooh.prol.ChangePanel;

public class TestRunFrame extends JFrame {
   
   private Image Icon = new ImageIcon("images/poohDownStop.png").getImage();
   
   public TestRunFrame() {
      
   Toolkit tk = Toolkit.getDefaultToolkit();
   
   JFrame jf = new JFrame("ESCAPOOH");
   JPanel jp = new JPanel();

   
   int f_width = 1200;
   int f_height = 800;
   
   
   jf.setSize(f_width, f_height);
     
   Dimension screen = tk.getScreenSize();

   int f_xpos = (int)(screen.getWidth() / 2 - f_width / 2);
   int f_ypos = (int)(screen.getHeight() / 2 - f_height / 2);
   
   ChangePanel cp = new ChangePanel(jf, jp); //패널바꾸기 불러옴
	//Pooo p = new Pooo();
	//Room22 r22 = new Room22(jf);
   MainRoom m = new MainRoom(jf);
	cp.replacePanel(m); //패널 교체
   
   jf.setIconImage(Icon);
   jf.setLocation(f_xpos, f_ypos);
   jf.setResizable(false);
   jf.setVisible(true);
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
	
	   new TestRunFrame();
}
   
}