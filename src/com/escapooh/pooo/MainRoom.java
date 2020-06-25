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

import com.escapooh.QuizPage.view.QuizLeftScreen1;
import com.escapooh.QuizPage.view.QuizLeftScreen2;
import com.escapooh.QuizPage.view.QuizRightScreen1;
import com.escapooh.prol.ChangePanel;
import com.escapooh.semiboss.EnterPassword;


public class MainRoom extends JPanel  implements KeyListener, Runnable, ImageObserver {
	
	 int f_width ;
	 int f_height ;
	   
	 int x = 550; 
	 int y = 700; 
	 
	   
	   int[] cx ={0, 0, 0}; 
	   int bx = 0; 
	   
	   boolean KeyUp = false;
	   boolean KeyDown = false;
	   boolean KeyLeft = false;
	   boolean KeyRight = false;
	   boolean KeySpace = false;
	   int player_Speed; // 유저의 캐릭터가 움직이는 속도를 조절할 변수
	   int player_Status = 0; 

	   private JFrame jf;
	   private JPanel jp;
	   //private JTextField timeOP = new JTextField(6);
	   
	   private Hud hud; // 힌트창 클래스 입력
	   
	   
	    Thread th;
	    
	    Toolkit tk = Toolkit.getDefaultToolkit();

	    Image Player_img = new ImageIcon("images/pooh1.png").getImage(); ;
	    Image BackGround_img = new ImageIcon("images/quizroom.png").getImage().getScaledInstance(1200, 800, 0); //배경이미지 설정
	    Image  OpenDoor_img_alert = new ImageIcon("images/openDoorNotice.png").getImage();
	    Image  OpenDoor_img = new ImageIcon("images/Polygon 2.png").getImage();
	    
	    Image fullLife_img1 = new ImageIcon("images/하트_ full 1.png").getImage() ;
	    Image fullLife_img2 = new ImageIcon("images/하트_ full 1.png").getImage();
	    Image fullLife_img3 = new ImageIcon("images/히트_ full 1.png").getImage();
	    Image lockdoor_img = new ImageIcon("images/Group 12 (1).png").getImage();
	    Image roomNum_img = new ImageIcon("images/1.png").getImage();
	    Image empty = new ImageIcon("하트_empty.png").getImage();
	    Image buffImage; 
	    Graphics buffg;
	    Graphics2D g2;
	    
	    
	    
	    public MainRoom(JFrame jf) {
	    	this.jf = jf;
	    	jp = this;
	    	
	    	init();
	    	start();

         	//JFrame jf = new JFrame();
			//jf.setSize(1200, 800);
			JPanel jp = new JPanel();
			
			
			JLabel ldoor = new JLabel(new ImageIcon(lockdoor_img));
			ldoor.setBounds(500,48,214 ,153);
			
			JLabel door = new JLabel(new ImageIcon(OpenDoor_img));
			door.setBounds(500,596,214 ,153);
			
			JLabel backLabel = new JLabel(new ImageIcon(BackGround_img));
			
			JLabel life1= new JLabel(new ImageIcon(fullLife_img1));
			life1.setBounds(56, 6,87 ,94);
			
			JLabel life2 = new JLabel(new ImageIcon(fullLife_img2));
			life2.setBounds(171, 6,87 ,94);
			
			JLabel life3 = new JLabel(new ImageIcon(fullLife_img3));
			life3.setBounds(230, 6,87 ,94);
			
	      	backLabel.add(ldoor);
			backLabel.add(door);
			backLabel.add(life1);
			backLabel.add(life2);
			backLabel.add(life3);
			jp.add(backLabel);
	    	
	    	 setSize(f_width, f_height);
	    	
			setPreferredSize(new Dimension(1200, 800));
			setLocation(0, 0);
			setVisible(true);
			
			
		}
	    

		public void init(){ 
			//preInit();
		      x = 525;
		      y = 480;
		      f_width = 1200;
		      f_height = 800;
		      
		      player_Speed = 50; //유저 캐릭터 움직이는 속도 설정
		      
		      hud = new Hud(); //힌트창 그리기
		 }
		      
		public void start(){
			
			addKeyListener(this);
	         th = new Thread(this); 
	         th.start(); 
	         
	      }
		      
	
		public void run(){ 
		        try{ 
		        while(true){
		  
		         KeyProcess(); 

		         repaint(); 

		         Thread.sleep(100);
		         }
		         }catch (Exception e){}
		      }
		      
		      public void paint(Graphics g){
		         buffImage = createImage(f_width, f_height); 
		         buffg = buffImage.getGraphics();

		         update(g);
		         hud.draw(g);
		      }
		      
		      public void update(Graphics g){

		         Draw_Background();	//배경 이미지 그리기 메소드 실행
		         Draw_Player();	//플레이어를 그리는 메소드 이름 변경

		         g.drawImage(buffImage, 0, 0, this); 
		         
		      }

		      public void Draw_Background(){

		         buffg.clearRect(0, 0, f_width, f_height);

		            buffg.drawImage(BackGround_img, bx, 0, this);
		            buffg.drawImage(lockdoor_img, 500, 48, this);
		            buffg.drawImage( OpenDoor_img, 500, 596, this);
		            buffg.drawImage( fullLife_img1, 75, 6, this);
		            buffg.drawImage( fullLife_img2, 165, 6, this);
		            buffg.drawImage( fullLife_img3, 255, 6, this);
		            	


					

//		            }else { bx = 0; }

		      }
		
		      public void Draw_Player(){ 

		    	  JLabel ldoor = new JLabel(new ImageIcon(lockdoor_img));
					ldoor.setBounds(500,48,214 ,153);
					
					JLabel door = new JLabel(new ImageIcon(OpenDoor_img));
					door.setBounds(500,596,214 ,153);
					
					JLabel backLabel = new JLabel(new ImageIcon(BackGround_img));
					
					JLabel life1= new JLabel(new ImageIcon(fullLife_img1));
					life1.setBounds(56, 6,87 ,94);
					
					JLabel life2 = new JLabel(new ImageIcon(fullLife_img2));
					life2.setBounds(171, 6,87 ,94);
					
					JLabel life3 = new JLabel(new ImageIcon(fullLife_img3));
					life3.setBounds(230, 6,87 ,94);
					
			
					
		         buffg.drawImage(Player_img, x, y, this);
		         if( (x >= 500 && x <= 600) && (y >= 100 && y <= 180)) {
		        	 //buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
		        	 ChangePanel cp = new ChangePanel(jf, jp);
						EnterPassword t = new EnterPassword(jf);
						cp.replacePanel(t); //패널 교체
		         }
		         else if((x >= -50 && x <= 170) && (y >= 280 && y <= 330)) {
		     		 //패널바꾸기 불러옴
		        	ChangePanel cp = new ChangePanel(jf, jp);
					QuizLeftScreen1 t = new QuizLeftScreen1(jf);
					cp.replacePanel(t); //패널 교체
		        	
		        	 //buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
		         }else if((x >= 850 && x <= 1000) && (y >= 280&& y <= 330)) {
		        	// buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
		        	 
		        	ChangePanel cp = new ChangePanel(jf, jp);
					QuizRightScreen1 t = new QuizRightScreen1(jf);
					cp.replacePanel(t); //패널 교체
		         }
		      }
		      
		   
		      
		      public void KeyProcess(){

		    	  
		    	  setFocusable(true);
					requestFocus();
		    	  
		    	  

		          setFocusable(true);
		          requestFocus();
            
		         if(KeyUp == true) {
		         if( y > 120 ) y -= player_Speed;
		         //캐릭터가 보여지는 화면 위로 못 넘어가게 합니다.
		         player_Status = 0;
		         //이동키가 눌려지면 플레이어 상태를 0으로 돌립니다.
		         }

		         if(KeyDown == true) {
		         if( y+ Player_img.getHeight(null) < f_height - 190 ) y += player_Speed;
		         //캐릭터가 보여지는 화면 아래로 못 넘어가게 합니다.
		         player_Status = 0;
		         //이동키가 눌려지면 플레이어 상태를 0으로 돌립니다.
		         }

		         if(KeyLeft == true) {

//		         if ( x > 180 ) x -= player_Speed;

		         if ( x > 160 ) x -= player_Speed;
		         //캐릭터가 보여지는 화면 왼쪽으로 못 넘어가게 합니다.

		         player_Status = 0;
		         //이동키가 눌려지면 플레이어 상태를 0으로 돌립니다.
		         }

		         if(KeyRight == true) {
		         if ( x + Player_img.getWidth(null) < f_width - 170 ) x += player_Speed;
		         //캐릭터가 보여지는 화면 오른쪽으로 못 넘어가게 합니다.

		         player_Status = 0;
		         //이동키가 눌려지면 플레이어 상태를 0으로 돌립니다.
		         }
		         
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


