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
import com.escapooh.game.bee.BeeRun;
import com.escapooh.game.bee.testFrame;
import com.escapooh.prol.ChangePanel;
import com.escapooh.semiboss.EnterPassword;


public class BeeRoom extends JPanel  implements KeyListener, Runnable, ImageObserver {
	
	 int f_width ;
	 int f_height ;
	   
	 int x = 550; 
	 int y = 700; 
	 
	   
	   
	   boolean KeyUp = false;
	   boolean KeyDown = false;
	   boolean KeyLeft = false;
	   boolean KeyRight = false;
	   boolean KeySpace = false;
	   boolean KeyEnter = false;
	   int player_Speed; // ������ ĳ���Ͱ� �����̴� �ӵ��� ������ ����
	   int player_Status = 0; 

	   private JFrame jf;
	   private JPanel jp;
	   //private JTextField timeOP = new JTextField(6);
	   
	   private Hud hud; // ��Ʈâ Ŭ���� �Է�
	   
	   
	   int enterNum;
	   
	    Thread th;
	    
	    Toolkit tk = Toolkit.getDefaultToolkit();

	    Image Player_img = new ImageIcon("images/pooh1.png").getImage(); ;
	    Image Boss = new ImageIcon("images/BigBee.png").getImage();
	    Image bee = new ImageIcon("images/bee.png").getImage();
	    
	    
//	    Image BackGround_img = new ImageIcon("images/quizroom.png").getImage().getScaledInstance(1200, 800, 0);; //����̹��� ����
	    Image BackGround_img = new ImageIcon("images/beeRoom.png").getImage().getScaledInstance(1200, 800, 0);
	    
//	    Image  OpenDoor_img_alert = new ImageIcon("images/openDoorNotice.png").getImage();
//	    Image  OpenDoor_img = new ImageIcon("images/Polygon 2.png").getImage();
	    
	    Image SpeechBox = new ImageIcon("images/talkBox90.png").getImage();
	    Image Speech1 = new ImageIcon("images/sayHi.png").getImage();
	    Image Speech2 = new ImageIcon("images/beeSay.png").getImage();
	    Image GameOver = new ImageIcon("images/GAME OVER").getImage();
	    Image EnterKey = new ImageIcon("images/enterKey.png").getImage();
	    
	    Image fullLife_img1 = new ImageIcon("images/heart_ full 1.png").getImage() ;
	    Image fullLife_img2 = new ImageIcon("images/heart_ full 1.png").getImage();
	    Image fullLife_img3 = new ImageIcon("images/heart_ full 1.png").getImage();
	    
//	    Image lockdoor_img = new ImageIcon("images/Group 12 (1).png").getImage();
//	    Image roomNum_img = new ImageIcon("images/1.png").getImage();
	    Image empty = new ImageIcon("heart_empty.png").getImage();
	    Image buffImage; 
	    Graphics buffg;
	    
	    
	    
	    public BeeRoom(JFrame jf) {
	    	this.jf = jf;
	    	jp = this;
	    	
	    	init();
	    	start();

//         	JFrame jf = new JFrame();
			jf.setSize(1200, 800);
			JPanel jp = new JPanel();
			
			JLabel backLabel = new JLabel(new ImageIcon(BackGround_img));
			
			JLabel life1= new JLabel(new ImageIcon(fullLife_img1));
			life1.setBounds(56, 6,87 ,94);
			
			JLabel life2 = new JLabel(new ImageIcon(fullLife_img2));
			life2.setBounds(143, 6,87 ,94);
			
			JLabel life3 = new JLabel(new ImageIcon(fullLife_img3));
			life3.setBounds(230, 6,87 ,94);
			
//	      	backLabel.add(ldoor);
//			backLabel.add(door);
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
		      
		      
		      
		      enterNum = 0;
		      
		      player_Speed = 50; //���� ĳ���� �����̴� �ӵ� ����
		      
		      hud = new Hud(); //��Ʈâ �׸���
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
		         
		         setFocusable(true);
		         requestFocus();
		         
		      }
		      
		      public void update(Graphics g){

		         Draw_Background();	//��� �̹��� �׸��� �޼ҵ� ����
		         Draw_Player();	//�÷��̾ �׸��� �޼ҵ� �̸� ����
		         Draw_Speech();
		         g.drawImage(buffImage, 0, 0, this); 
		         
		      }

		      public void Draw_Background(){

//		         buffg.clearRect(0, 0, f_width, f_height);

		            buffg.drawImage(BackGround_img, 0, 0, this);
//		            buffg.drawImage(lockdoor_img, 500, 48, this);
//		            buffg.drawImage( OpenDoor_img, 500, 596, this);
		            buffg.drawImage( fullLife_img1, 75, 6, this);
		            buffg.drawImage( fullLife_img2, 165, 6, this);
		            buffg.drawImage( fullLife_img3, 255, 6, this);
		            	


					

//		            }else { bx = 0; }

		      }
		
		      public void Draw_Player(){ 

		         buffg.drawImage(Player_img, x, y, this);
		         if( (x >= 500 && x <= 600) && (y >= 100 && y <= 180)) {
		        	 //buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
//		        	 ChangePanel cp = new ChangePanel(jf, jp);
//						BeeRun t = new BeeRun(jf);
//						cp.replacePanel(t); //�г� ��ü
		        	 
		        	new testFrame();
		        
		         }
//		         else if((x >= -50 && x <= 170) && (y >= 280 && y <= 330)) {
//		     		 //�гιٲٱ� �ҷ���
//		        	ChangePanel cp = new ChangePanel(jf, jp);
//					QuizLeftScreen1 t = new QuizLeftScreen1(jf);
//					cp.replacePanel(t); //�г� ��ü
//		        	
//		        	 //buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
//		         }else if((x >= 850 && x <= 1000) && (y >= 280&& y <= 330)) {
//		        	// buffg.drawImage(OpenDoor_img_alert, 200, 200, this);
//		        	 
//		        	ChangePanel cp = new ChangePanel(jf, jp);
//					QuizRightScreen1 t = new QuizRightScreen1(jf);
//					cp.replacePanel(t); //�г� ��ü
//		         }
		         
		         buffg.drawImage(Boss, 470, 200, this);
		         
		         
		      }
		      
		      public void Draw_Speech() {
		    	  
		    	  if( y < 400 ) {
		    		  
		    		  KeyUp = false;
		    		  KeyDown = false;
		    		  KeyRight = false;
		    		  KeyDown = false;
		    		  
		    		  switch(enterNum) {
		    		  case 0 : buffg.drawImage(SpeechBox, 100, 100, this);
		    		  buffg.drawImage(Player_img, 130, 200, this);
		    		  buffg.drawImage(Speech1, 300, 220, this);
		    		  buffg.drawImage(EnterKey, 850, 300, this);
		    		  break;
		    		  case 1 : buffg.drawImage(SpeechBox, 100, 100, this);
		    		  buffg.drawImage(bee, 900, 300, this);
	    			  buffg.drawImage(Speech2, 200, 220, this);
	    			  buffg.drawImage(EnterKey, 800, 480, this);
	    			  break;
		    		  case 2 : buffg.drawImage(SpeechBox, 100, 100, this);
		    			  buffg.drawImage(EnterKey, 800, 480, this);break;
		    		  case 3 : 
//		    			  ChangePanel cp = new ChangePanel(jf, jp);
//					  BeeRun t = new BeeRun();
//					  cp.replacePanel(t);
		    			  this.remove(jf);
		    			  this.remove(jp);
		    			  new testFrame();
		    		  
		    		  }
		    		  
		    	  }
		    	  
		      }
		      
		      public void KeyProcess(){


		          setFocusable(true);
		          requestFocus();
		          
		         if(KeyEnter == true || KeySpace == true) {
		        	 enterNum++;
		         }
		          
            
		         if(KeyUp == true) {
		         if( y > 120 ) y -= player_Speed;
		         //ĳ���Ͱ� �������� ȭ�� ���� �� �Ѿ�� �մϴ�.
		         player_Status = 0;
		         //�̵�Ű�� �������� �÷��̾� ���¸� 0���� �����ϴ�.
		         }

		         if(KeyDown == true) {
		         if( y+ Player_img.getHeight(null) < f_height - 190 ) y += player_Speed;
		         //ĳ���Ͱ� �������� ȭ�� �Ʒ��� �� �Ѿ�� �մϴ�.
		         player_Status = 0;
		         //�̵�Ű�� �������� �÷��̾� ���¸� 0���� �����ϴ�.
		         }

		         if(KeyLeft == true) {

//		         if ( x > 180 ) x -= player_Speed;

		         if ( x > 160 ) x -= player_Speed;
		         //ĳ���Ͱ� �������� ȭ�� �������� �� �Ѿ�� �մϴ�.

		         player_Status = 0;
		         //�̵�Ű�� �������� �÷��̾� ���¸� 0���� �����ϴ�.
		         }

		         if(KeyRight == true) {
		         if ( x + Player_img.getWidth(null) < f_width - 170 ) x += player_Speed;
		         //ĳ���Ͱ� �������� ȭ�� ���������� �� �Ѿ�� �մϴ�.

		         player_Status = 0;
		         //�̵�Ű�� �������� �÷��̾� ���¸� 0���� �����ϴ�.
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
		         KeyEnter = false;
		         break;
		         case KeyEvent.VK_SPACE :
		         KeySpace = false;
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


