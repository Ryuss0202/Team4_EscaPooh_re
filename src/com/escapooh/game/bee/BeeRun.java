package com.escapooh.game.bee;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.escapooh.pooo.MainRoom;
//import com.escapooh.pooo.Room22;
import com.escapooh.prol.ChangePanel;

public class BeeRun extends JPanel implements KeyListener{


	private JFrame jf;
	private JPanel jp;
	private boolean running = true;

	private ArrayList beebee = new ArrayList();
	private Crush sling;

	private BufferedImage beeImage;
	private BufferedImage shotImage;
	private BufferedImage ssImage;
	private BufferedImage Bimg;

	private int YourScore = 0;


	public BeeRun(JFrame jf) {
		this.jf = jf;
		jp = this;
		JButton jb = new JButton();
		jb.setBorderPainted(false);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
		jb.setBounds(550, 600, 200, 126);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gameLoop();

			}
		});
		add(jb);
		JPanel jp = new JPanel();
		jf.setSize(1200, 800);
		jf.add(this);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1200, 800));
		setLocation(0, 0);
		setVisible(true);
		add(jp);

		try {

			shotImage = ImageIO.read(new File("images/bullet.png"));
			ssImage = ImageIO.read(new File("images/slingshot.png"));
			beeImage = ImageIO.read(new File("images/bee.png"));
			Bimg = ImageIO.read(new File("images/gameStrartButton.png"));

		} catch (IOException e) {

			e.printStackTrace();

		}

		this.requestFocus();
		this.initSling();
		this.addKeyListener(this);
	
	}



	private void initSling() {

		sling = new Slingshot(this, 
				ssImage, 370, 550);

		this.beebee.add(sling);

		for (int y = 0; y < 5; y++) {

			for (int x = 0; x < 12; x++) {

				Bee beeb = new Bee(this, 
						beeImage,
						100 + (x * 100), (50) + y * 30);

				beebee.add(beeb);

			}

		}

	}

	public void startGame(){
		beebee.clear();
		initSling();	
	}
	public void endGame(){	
		beebee.clear();
		initSling();
		ChangePanel cp = new ChangePanel(jf, jp);
		MainRoom t = new MainRoom(jf);
		cp.replacePanel(t);
	}
	public void victory() {

		ChangePanel cp = new ChangePanel(jf, jp);
		GameOver2 t = new GameOver2(jf);
		cp.replacePanel(t); 
		//System.exit(0);
	}

	public void removeSling(Crush sling) {

		beebee.remove(sling);	

	}

	public void Score(int score) {
		YourScore += 100;

		//System.out.println(YourScore);
		if(YourScore == 6000) {
			victory();
		}

	}


	public void fire() {

		Bullet shot = new Bullet(this,
				shotImage,

				sling.getX() + 10, sling.getY() - 30);

		beebee.add(shot);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);


		Image backImage = Toolkit.getDefaultToolkit().getImage("images/back_Bee.png");
		g.drawImage(backImage, 0, 0, 1200, 800, this);

		g.setFont(new Font("Serif", Font.BOLD, 40));
		g.drawString("Score : " + YourScore, 900, 100);

		for (int i = 0; i < beebee.size(); i++) {

			Crush sprite = (Crush) beebee.get(i);

			sprite.draw(g);
		}
	}

	public void gameLoop() {

		while (running) {

			for (int i = 0; i < beebee.size(); i++) {
				Crush sling = (Crush) beebee.get(i);
				sling.move();

			}

			for (int p = 0; p < beebee.size(); p++) {

				for (int s = p + 1; s < beebee.size(); s++) {
					Crush me = (Crush) beebee.get(p);
					Crush other = (Crush) beebee.get(s);

					if (me.checkCollision(other)) {
						try {
							me.handleCollision(other);
							other.handleCollision(me);
						}catch (Exception e) {
							endGame();
						}
					}
				}
				repaint();
			}
			try {
				Thread.sleep(80);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	@Override

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_LEFT)

			sling.setDx(-3);

		if (e.getKeyCode() == KeyEvent.VK_RIGHT)

			sling.setDx(+3);


		if (e.getKeyCode() == KeyEvent.VK_UP)

			sling.setDy(-20);

		if (e.getKeyCode() == KeyEvent.VK_DOWN)

			sling.setDy(+20);

		if (e.getKeyCode() == KeyEvent.VK_SPACE)

			fire();	
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			sling.setDx(0);

		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			sling.setDx(0);

		if (e.getKeyCode() == KeyEvent.VK_UP)
			sling.setDy(0);

		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			sling.setDy(0);

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	public static void main(String args[]) {

		JFrame jf = new JFrame();

		BeeRun g = new BeeRun(jf);

		g.gameLoop();
	}

}

