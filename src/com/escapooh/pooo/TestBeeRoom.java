package com.escapooh.pooo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestBeeRoom extends JPanel implements KeyListener {

	private JFrame jf;
	private JPanel jp;
	
	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	boolean KeyEnter = false;
	boolean KeySpace = false;
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	
    Image backgr = new ImageIcon("images/beeBossBackground.png").getImage().getScaledInstance(1200, 800, 0);
	
    Image fullLife_img1 = new ImageIcon("images/heart_ full 1.png").getImage() ;
    Image fullLife_img2 = new ImageIcon("images/heart_ full 1.png").getImage();
    Image fullLife_img3 = new ImageIcon("images/heart_ full 1.png").getImage();
    
    Image empty1 = new ImageIcon("heart_empty.png").getImage();
    Image empty2 = new ImageIcon("heart_empty.png").getImage();
    Image empty3 = new ImageIcon("heart_empty.png").getImage();
    
    Image talkBox = new ImageIcon("images/talkBox2.png").getImage();
    Image talk1 = new ImageIcon("images/sayHi.png").getImage();
    Image talk2 = new ImageIcon("images/beeSay.png").getImage();
	
    Image buffImage; 
    Graphics buffg;
    Graphics2D g2;
    
    
	
	public TestBeeRoom(JFrame jf) {
		
    	this.jf = jf;
    	jp = this;
    	
		this.setLayout(null);
		this.setBounds(0, 0, 1200, 800);
		
		KeyProcess();
		
		JLabel backLabel = new JLabel(new ImageIcon(backgr));
		backLabel.setBounds(0, 0, 1200, 800);
		
		JLabel speechBox = new JLabel(new ImageIcon(talkBox));
		speechBox.setBounds(100, 100, 996, 661);
		
		jp.add(backLabel);
		
		if (KeySpace == true) {
			System.out.println("space push");
			jp.add(speechBox);
		}
		
		
	}
	
    public void KeyProcess(){
    	
  	    setFocusable(true);
		requestFocus();
    	
    	System.out.println("keyprocess");
		if (KeySpace == true) {
			System.out.println("keyp space push");
		}	
    	
    }
    
//    public void paint(Graphics g){
//    	
//    	Graphics2D g2 = (Graphics2D) g;
//    	
////    	g.drawImage(backgr, 0, 0, this);
//    	g.drawImage(empty1, 56, 6, this);
//    	
//    	if (KeySpace == true) {
//    		
//    		g2.drawImage(talkBox, 100, 200, this);
//	    	g2.drawImage(talk1, 200, 300, this);
//	    	
//    	}
//	    
//	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println("keypress run");
		
        switch(e.getKeyCode()){
        case KeyEvent.VK_UP :
        KeyUp = true;
        break;
        case KeyEvent.VK_DOWN :
        KeyDown = true;
        break;
        case KeyEvent.VK_LEFT :
        KeyLeft = true;
        break;
        case KeyEvent.VK_RIGHT :
        KeyRight = true;
        break;
        case KeyEvent.VK_ENTER :
        KeyEnter = true;
        break;
        case KeyEvent.VK_SPACE :
        KeySpace = true;
        break;
        }		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		

		
		System.out.println("keyreleased run");
		
		switch(e.getKeyCode()){
        case KeyEvent.VK_UP :
        KeyUp = false;
        break;
        case KeyEvent.VK_DOWN :
        KeyDown = false;
        break;
        case KeyEvent.VK_LEFT :
        KeyLeft = false;
        break;
        case KeyEvent.VK_RIGHT :
        KeyRight = false;
        break;
        case KeyEvent.VK_ENTER :
        KeyEnter = true;
        break;
        case KeyEvent.VK_SPACE :
        KeySpace = true;
        break;

        }		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
