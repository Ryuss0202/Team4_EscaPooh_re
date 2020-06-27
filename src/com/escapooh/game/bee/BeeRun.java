package com.escapooh.game.bee;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.escapooh.pooo.Room2;
//import com.escapooh.pooo.Room22;
import com.escapooh.prol.ChangePanel;

public class BeeRun extends JPanel implements KeyListener{


   private JFrame jf;
   private JPanel jp;
   private boolean running = true;

   private ArrayList sprites = new ArrayList();
   private Crush starship;

   private BufferedImage alienImage;
   private BufferedImage shotImage;
   private BufferedImage shipImage;

   private int YourScore = 0;


   public BeeRun(JFrame jf) {

      this.jf = jf;
      jp = this;
      jf.setSize(1200, 800);
      jf.add(this);
      jf.setResizable(false);
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //jp.setComponentZOrder(jp, 0);

    

      try {

         shotImage = ImageIO.read(new File("images/bullet.png"));
         shipImage = ImageIO.read(new File("images/slingshot.png"));
         alienImage = ImageIO.read(new File("images/bee.png"));
         
      } catch (IOException e) {
         e.printStackTrace();

      }

      this.requestFocus();
      this.initSprites();
      this.addKeyListener(this);
      
   }



   private void initSprites() {
      starship = new Slingshot(this, 
            shipImage, 370, 550);

      this.sprites.add(starship);



      for (int y = 0; y < 5; y++) {

         for (int x = 0; x < 12; x++) {

            Bee alien = new Bee(this, 
                  alienImage,
                  100 + (x * 50), (50) + y * 30);

            sprites.add(alien);

         }

      }

   }

   public void startGame(){
      sprites.clear();
      initSprites();   
   }
   public void endGame(){   
      ChangePanel cp = new ChangePanel(jf, jp);
      Room2 t = new Room2(jf);
      cp.replacePanel(t); 
      //System.exit(0);
   }
   public void victory() {

      ChangePanel cp = new ChangePanel(jf, jp);
      Room2 t = new Room2(jf);
      cp.replacePanel(t); //패널 교체
      //System.exit(0);
   }

   public void removeSprite(Crush sprite) {

      sprites.remove(sprite);   

   }

   public void Score(int score) {
      YourScore += 100;

      //확인용
      //System.out.println(YourScore);
      if(YourScore == 6000) {
         //다음으로 넘어가야함.
         victory();
      }

   }


   public void fire() {

      Bullet shot = new Bullet(this,
            shotImage,

            starship.getX() + 10, starship.getY() - 30);

      sprites.add(shot);

   }

   @Override
   public void paint(Graphics g) {
      super.paint(g);


      Image backImage = Toolkit.getDefaultToolkit().getImage("images/back_Bee.png");
      g.drawImage(backImage, 0, 0, 1200, 800, this);

      g.setFont(new Font("맑은 고딕", Font.BOLD, 40));
      g.drawString("Score : " + YourScore, 900, 100);

      for (int i = 0; i < sprites.size(); i++) {

         Crush sprite = (Crush) sprites.get(i);

         sprite.draw(g);
      }
   }

   public void gameLoop() {

      while (running) {
         for (int i = 0; i < sprites.size(); i++) {
            Crush sprite = (Crush) sprites.get(i);
            sprite.move();

         }

         for (int p = 0; p < sprites.size(); p++) {
            for (int s = p + 1; s < sprites.size(); s++) {
               Crush me = (Crush) sprites.get(p);
               Crush other = (Crush) sprites.get(s);

               if (me.checkCollision(other)) {
                  try {
                  me.handleCollision(other);
                  other.handleCollision(me);
                  }catch (Exception e) {
                     endGame();
                  }
               }
            }
         }
         repaint();

         try {
            Thread.sleep(100);
         } catch (Exception e) {
         }
      }

   }

   @Override

   public void keyPressed(KeyEvent e) {

      if (e.getKeyCode() == KeyEvent.VK_LEFT)

         starship.setDx(-3);

      if (e.getKeyCode() == KeyEvent.VK_RIGHT)

         starship.setDx(+3);


      if (e.getKeyCode() == KeyEvent.VK_UP)

         starship.setDy(-3);

      if (e.getKeyCode() == KeyEvent.VK_DOWN)

         starship.setDy(+3);

      if (e.getKeyCode() == KeyEvent.VK_SPACE)

         fire();   
   }

   @Override
   public void keyReleased(KeyEvent e) {

      if (e.getKeyCode() == KeyEvent.VK_LEFT)

         starship.setDx(0);

      if (e.getKeyCode() == KeyEvent.VK_RIGHT)

         starship.setDx(0);

      if (e.getKeyCode() == KeyEvent.VK_UP)

         starship.setDy(0);

      if (e.getKeyCode() == KeyEvent.VK_DOWN)

         starship.setDy(0);

   }

   @Override
   public void keyTyped(KeyEvent arg0) {
   }

//   public static void main(String args[]) {
//
//      JFrame jf = new JFrame();
//
//      BeeRun g = new BeeRun(jf);
//
//      g.gameLoop();
//   }

}
