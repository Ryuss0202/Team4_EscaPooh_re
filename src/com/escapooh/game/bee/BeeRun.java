//package com.escapooh.game.bee;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class BeeRun extends JPanel implements KeyListener{
//
//	private boolean running = true;
//
//	private ArrayList crushs = new ArrayList();
//	private Crush slingshot;
//
//	private BufferedImage beeimg;
//	private BufferedImage slingshotimg;
//	private BufferedImage bulletimg;
//
//	public BeeRun() {
//		JFrame mf = new JFrame("BeeBee");
//
//		mf.setBounds(0, 0, 1200, 800);
//		mf.setVisible(true);
//		mf.setResizable(false);
//
//		try {
//			beeimg = ImageIO.read(new File("images/bee.png"));
//			slingshotimg = ImageIO.read(new File("images/slingshot.png"));
//			bulletimg = ImageIO.read(new File("images/bullet.png"));
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		this.requestFocus();
//		this.initCrushs();
//		
//	}
//
//	public void initCrushs() {
//		Bullet bulletshot = new Bullet(this, bulletimg,370,550);//여기서 부터 다시
//		this.crushs.add(slingshot);
//
//		for(int y = 0; y < 5; y++) {
//			for(int x = 0; x < 12; x++) {
//				Crush bees = new Bee(this, beeimg, 100 + (x * 50), (50) + y * 30);
//				crushs.add(bees);
//			}
//		}
//	}
//
//	public void startGame() {
//		crushs.clear();
//		initCrushs();
//	}
//	public void endGame() {
//		//system.exit(0);
//	}
//	public void removeCrush(Crush crush) {
//		crushs.remove(crush);
//	}
//
//	public void fire() {
//		Bullet shot = new Bullet(this, slingshotimg, slingshot.getX() + 10, slingshot.getY() - 30);
//		crushs.add(shot);
//	}
//	@Override
//
//	public void paint(Graphics g) {
//		super.paint(g);
//		g.setColor(Color.BLACK);
//		g.fillRect(0, 0, 800, 600);
//		for (int i = 0; i < crushs.size(); i++) {
//			Crush sprite = (Crush) crushs.get(i);
//			sprite.draw(g);
//		}
//	}
//
//	public void gameLoop() {
//		while (running) {
//			for (int i = 0; i < crushs.size(); i++) {
//				Crush crush = (Crush) crushs.get(i);
//				crush.move();
//			}
//			for (int p = 0; p < crushs.size(); p++) {
//				for (int s = p + 1; s < crushs.size(); s++) {
//					Crush me = (Crush) crushs.get(p);
//					Crush other = (Crush) crushs.get(s);
//					if (me.checkCollision(other)) {
//						me.handleCollision(other);
//						other.handleCollision(me);
//					}
//				}
//			}
//			repaint();
//			try {
//				Thread.sleep(10);
//			} catch (Exception e) {
//			}
//		}
//	}
//
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		if (e.getKeyCode() == KeyEvent.VK_LEFT)
//			slingshot.setDx(-3);
//		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
//			slingshot.setDx(+3);
//		if (e.getKeyCode() == KeyEvent.VK_UP)
//			slingshot.setDy(-3);
//		if (e.getKeyCode() == KeyEvent.VK_DOWN)
//			slingshot.setDy(+3);
//		if (e.getKeyCode() == KeyEvent.VK_SPACE)
//			fire();	
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		if (e.getKeyCode() == KeyEvent.VK_LEFT)
//			slingshot.setDx(0);
//		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
//			slingshot.setDx(0);
//		if (e.getKeyCode() == KeyEvent.VK_UP)
//			slingshot.setDy(0);
//		if (e.getKeyCode() == KeyEvent.VK_DOWN)
//			slingshot.setDy(0);
//	}
//
//
//	public static void main(String argv[]) {
//		BeeRun g = new BeeRun();
//		g.gameLoop();
//	}
//}



package com.escapooh.game.bee;

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

//import com.escapooh.game.bee.model.vo.LifeNScore;
import com.escapooh.game.timer.TimerClass2;

public class BeeRun extends JPanel implements KeyListener{



	private boolean running = true;

	private ArrayList sprites = new ArrayList();
	private Crush starship;

	private BufferedImage alienImage;
	private BufferedImage shotImage;
	private BufferedImage shipImage;



	public BeeRun() {

		JFrame frame = new JFrame("Bee Game");



		frame.setSize(1200, 800);
		frame.add(this);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JPanel panel = new JPanel();


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

		// TODO Auto-generated method stub

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
		//System.exit(0);
	}

	public void removeSprite(Crush sprite) {

		sprites.remove(sprite);	

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

//		g.setColor(Color.BLACK);
//		g.fillRect(0, 0, 1200, 800);
		
		Image backImage = Toolkit.getDefaultToolkit().getImage("images/back_Bee.png");
		g.drawImage(backImage, 0, 0, 1200, 800, this);
		
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
						me.handleCollision(other);
						other.handleCollision(me);
					}
				}
			}
			repaint();

			try {
				Thread.sleep(10);
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

	public static void main(String argv[]) {

		BeeRun g = new BeeRun();

		g.gameLoop();
	}

}

