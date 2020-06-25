package com.escapooh.pooo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BeeRoom extends JPanel  implements KeyListener, ImageObserver {

//	   int f_width;
//	   int f_height;
	
	   boolean KeyUp = false;
	   boolean KeyDown = false;
	   boolean KeyLeft = false;
	   boolean KeyRight = false;
	   boolean KeyEnter = false;
	   boolean KeySpace = false;

	   private JFrame jf;
	   private JPanel jp;
	   
	    Thread th;
	    
	    Toolkit tk = Toolkit.getDefaultToolkit();

	    Image BackGround_img = new ImageIcon("images/beeBossBackground.png").getImage().getScaledInstance(1200, 800, 0);; //배경 이미지 설정
	    
	    Image  fullLife_img1 = new ImageIcon("images/하트_ full 1.png").getImage() ;
	    Image   fullLife_img2 = new ImageIcon("images/하트_ full 1.png").getImage();
	    Image   fullLife_img3 = new ImageIcon("images/하트_ full 1.png").getImage();
//	    Image   lockdoor_img = new ImageIcon("images/Group 12 (1).png").getImage();
//	    Image   roomNum_img = new ImageIcon("images/1.png").getImage();
	    Image empty = new ImageIcon("하트_empty.png").getImage();
	    
	    Image talkBox = new ImageIcon("images/talkBox2.png").getImage();
	    Image talk1 = new ImageIcon("images/talk1.png").getImage();
	    Image talk2 = new ImageIcon("images/talk2.png").getImage();
	    
	    Image buffImage; 
	    Graphics buffg;
	    Graphics2D g2;
	    
	    public BeeRoom(JFrame jf) {
	    	this.jf = jf;
	    	jp = this;
//	   	 requestFocus();
			this.setLayout(null);
			this.setBounds(0, 0, 1200, 800);
	    	
			KeyProcess(); 
//	    	init();
//	    	start();

//        	JFrame jf = new JFrame();
			
//			JLabel ldoor = new JLabel(new ImageIcon(lockdoor_img));
//			ldoor.setBounds(500,48,214 ,153);
//			
//			JLabel door = new JLabel(new ImageIcon(OpenDoor_img));
//			door.setBounds(500,596,214 ,153);
			
			JLabel backLabel = new JLabel(new ImageIcon(BackGround_img));
			backLabel.setBounds(0, 0, 1200, 800);
			
			JLabel life1= new JLabel(new ImageIcon(fullLife_img1));
			life1.setBounds(56, 6,87 ,94);
			
			JLabel life2 = new JLabel(new ImageIcon(fullLife_img2));
			life2.setBounds(171, 6,87 ,94);
			
			JLabel life3 = new JLabel(new ImageIcon(fullLife_img3));
			life3.setBounds(230, 6,87 ,94);
			
			JLabel box = new JLabel(new ImageIcon(talkBox));
			box.setBounds(100, 50, 996, 661);
			
			JLabel speech1 = new JLabel(new ImageIcon(talk1));
			box.setBounds(130, 130, 574, 285);
			
//			JLabel Boss = new JLabel(new ImageIcon(boss));
//			Boss.setBounds(300, 600, 100, 100);
			
//	      	backLabel.add(ldoor);
//			backLabel.add(door);
			backLabel.add(life1);
			backLabel.add(life2);
			backLabel.add(life3);
			backLabel.add(box);
//			box.add(speech1);
//			backLabel.add(Boss);
			jp.add(backLabel);
			
	    	
//	    	setSize(f_width, f_height);
//	    	
//			setPreferredSize(new Dimension(1200, 800));
//			setLocation(0, 0);
			setVisible(true);
			
		}

//		public void init(){ 
//			//preInit();
//		      f_width = 1200;
//		      f_height = 800;
//		      
//		 }
//		      
//		public void start(){
//			
//			addKeyListener(this);
//	         th = new Thread(this); 
//	         th.start(); 
//	         
//	      }
//		      
//	
//		public void run(){ 
//		        try{ 
//		        while(true){
//		  
//		         KeyProcess(); 
//
//		         repaint(); 
//
//		         Thread.sleep(100);
//		         }
//		         }catch (Exception e){}
//		      }
//		      
//		      public void paint(Graphics g){
//		         buffImage = createImage(f_width, f_height); 
//		         buffg = buffImage.getGraphics();
//
//		         update(g);
//		      }
//		      
//		      public void update(Graphics g){
//
//		         Draw_Background();	//배경 이미지 그리기 메소드 실행
//		         Draw_Player();	//플레이어를 그리는 메소드 이름 변경
//
//		         g.drawImage(buffImage, 0, 0, this); 
//		         
//		      }
//
//		      public void Draw_Background(){
//
//		         buffg.clearRect(0, 0, f_width, f_height);
//		         
////		         if ( bx > - 3500){
//
//		            buffg.drawImage(BackGround_img, bx, 0, this);
////		            buffg.drawImage(lockdoor_img, 500, 48, this);
////		            buffg.drawImage( OpenDoor_img, 500, 596, this);
//		            buffg.drawImage( fullLife_img1, 75, 6, this);
//		            buffg.drawImage( fullLife_img2, 165, 6, this);
//		            buffg.drawImage( fullLife_img3, 255, 6, this);
//		            buffg.drawImage(boss, 400, 90, 409, 354, this);
//		            	
////		            }else { bx = 0; }
//
//					
//		      }
//		
//		      public void Draw_Player(){ 
		    	  
//		    	  buffg.drawImage(talkBox, 100, 100, this);
//
////		    	  JLabel ldoor = new JLabel(new ImageIcon(lockdoor_img));
////					ldoor.setBounds(500,48,214 ,153);
////					
////					JLabel door = new JLabel(new ImageIcon(OpenDoor_img));
////					door.setBounds(500,596,214 ,153);
//					
//					JLabel backLabel = new JLabel(new ImageIcon(BackGround_img));
//					
//					JLabel life1= new JLabel(new ImageIcon(fullLife_img1));
//					life1.setBounds(56, 6,87 ,94);
//					
//					JLabel life2 = new JLabel(new ImageIcon(fullLife_img2));
//					life2.setBounds(171, 6,87 ,94);
//					
//					JLabel life3 = new JLabel(new ImageIcon(fullLife_img3));
//					life3.setBounds(230, 6,87 ,94);
//					
////					JLabel Boss = new JLabel(new ImageIcon(boss));
////					Boss.setBounds(300, 600, 100, 100);
//			
//					
//		         buffg.drawImage(Player_img, x, y, this);
//		         if( (x >= 500 && x <= 600) && (y >= 100 && y <= 180)) {
////		        	 buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
//		         }
////		         else if((x >= -50 && x <= 170) && (y >= 280 && y <= 330)) {
////		     		 //패널바꾸기 불러옴
////		        	ChangePanel cp = new ChangePanel(jf, jp);
////					QuizLeftScreen1 t = new QuizLeftScreen1(jf);
////					cp.replacePanel(t); //패널 교체
////		        	
////		        	 //buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
////		         }else if((x >= 850 && x <= 1000) && (y >= 280&& y <= 330)) {
////		        	// buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
////		        	 
////		        	ChangePanel cp = new ChangePanel(jf, jp);
////					QuizRightScreen1 t = new QuizRightScreen1(jf);
////					cp.replacePanel(t); //패널 교체
////		         }
//		      }
		      
		   
		      
		      public void KeyProcess(){

		    	  
		    	 setFocusable(true);
				 requestFocus();
				
				 if(KeyEnter == true) {
				 
				 }
				
				 if(KeySpace == true) {
					 
				 }
           
//		         if(KeyUp == true) {
//		         if( y > 120 ) y -= player_Speed;
//		         //캐릭터가 보여지는 화면 위로 못 넘어가게 합니다.
//		         player_Status = 0;
//		         //이동키가 눌려지면 플레이어 상태를 0으로 돌립니다.
//		         }
//
//		         if(KeyDown == true) {
//		         if( y+ Player_img.getHeight(null) < f_height - 190 ) y += player_Speed;
//		         //캐릭터가 보여지는 화면 아래로 못 넘어가게 합니다.
//		         player_Status = 0;
//		         //이동키가 눌려지면 플레이어 상태를 0으로 돌립니다.
//		         }
//
//		         if(KeyLeft == true) {
//
//		         if ( x > 160 ) x -= player_Speed;
//		         //캐릭터가 보여지는 화면 왼쪽으로 못 넘어가게 합니다.
//
//		         player_Status = 0;
//		         //이동키가 눌려지면 플레이어 상태를 0으로 돌립니다.
//		         }
//
//		         if(KeyRight == true) {
//		         if ( x + Player_img.getWidth(null) < f_width - 170 ) x += player_Speed;
//		         //캐릭터가 보여지는 화면 오른쪽으로 못 넘어가게 합니다.
//
//		         player_Status = 0;
//		         //이동키가 눌려지면 플레이어 상태를 0으로 돌립니다.
//		         }
		         
		      }
		      public void keyPressed(KeyEvent e){
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
		      public void keyReleased(KeyEvent e){
		           
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
		         // TODO Auto-generated method stub
		         
		    	  
		      }

			@Override
			public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				return false;
			}
			
	
	
}
