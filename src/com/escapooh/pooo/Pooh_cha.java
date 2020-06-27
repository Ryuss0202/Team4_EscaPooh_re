package com.escapooh.pooo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class RpgGame_frame extends JPanel implements Runnable, 
KeyListener{
	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false;
	boolean playerMove = false;
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	Image img = new ImageIcon("images/cha2.png").getImage();

	Image buffimg;
	Graphics gc;
	Thread th;
	int x, y; 
	int cnt; 
	int moveStatus; 
	private JFrame jf;
	private JPanel jp;
	
	public RpgGame_frame(JFrame jf){
		
		init();
		start();

		Dimension screen = tk.getScreenSize();
		int xpos = (int)(screen.getWidth() / 2 - getWidth() / 2);
		int ypos = (int)(screen.getHeight() / 2 - getHeight() / 2);
		setLocation(xpos, ypos);
//		setResizable(false);
		setVisible(true);
	}

	public void init(){
		x = 100;
		y = 100;
		moveStatus = 2;
	}

	public void start(){
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		th = new Thread(this);
		th.start();
	}

	public void run(){ 
		while(true){
			try{
				keyProcess();
				repaint();
				Thread.sleep(20);
				cnt++;
			}catch(Exception e){}
		}
	}
	public void paint(Graphics g){ 
		buffimg = createImage(800, 600);
		gc = buffimg.getGraphics();
		update(g);
	}
	public void update(Graphics g){
		
		DrawImg();
		g.drawImage(buffimg, 0, 0, this);
	}
	public void DrawImg(){
		gc.setFont(new Font("Default", Font.BOLD, 20));
		gc.drawString(Integer.toString(cnt), 50, 50);
		gc.drawString(Integer.toString((playerMove)?1:0),200, 50);
		
		MoveImage(img, x, y, 100, 150);
		
	}
	public void MoveImage(Image img, int x, int y, int width, 
			int height){

		gc.setClip(x  , y, width, height);

		if( playerMove ){ 
			if ( cnt / 10 % 4 == 0 ){ gc.drawImage(img,
					x - ( width * 0 ), y - ( height * moveStatus ), this);

			}else  if(cnt/10%4 == 1){ gc.drawImage(img,
					x - ( width * 1 ), y - ( height * moveStatus ), this);

			}else if(cnt/10%4 == 2){  gc.drawImage(img,
					x - ( width * 2 ), y - ( height * moveStatus ), this);

			}else  if(cnt/10%4 == 3){ gc.drawImage(img,
					x - ( width * 1 ), y - ( height * moveStatus ), this);
			}
			
		}else { gc.drawImage(img, x - ( width * 1 ), 
				y - ( height * moveStatus ), this);
		
		}
	}
	public void keyProcess(){
		playerMove = false;

		if ( keyUp ){
			playerMove = true;
			y -= 8;
			moveStatus = 0;
		}

		if ( keyDown){
			y += 8;
			moveStatus = 2;
			playerMove = true;
		}

		if ( keyLeft){
			x -= 8;
			moveStatus = 3;
			playerMove = true;
		}

		if ( keyRight){
			x += 8;
			moveStatus = 1;
			playerMove = true;
		}
	}
	public void keyPressed(KeyEvent e) {

		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT :
			keyLeft = true;
			break;
		case KeyEvent.VK_RIGHT :
			keyRight = true;
			break;
		case KeyEvent.VK_UP :
			keyUp = true;
			break;
		case KeyEvent.VK_DOWN :
			keyDown = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT :
			keyLeft = false;
			break;
		case KeyEvent.VK_RIGHT :
			keyRight = false;
			break;
		case KeyEvent.VK_UP :
			keyUp = false;
			break;
		case KeyEvent.VK_DOWN :
			keyDown = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {}

}

