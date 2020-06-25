package com.escapooh.map;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DefaultMap extends JPanel{
	private JPanel jp;
	private JFrame jf;

	private JLabel back = new JLabel();
	private BufferedImage backimg;
	
	private BufferedImage doorUp;
	private BufferedImage doorDown;
	private BufferedImage doorL;
	private BufferedImage doorR;
	
	private JLabel Door;

	public DefaultMap() {


		JFrame jf = new JFrame("Map");
		JPanel panel = new JPanel();

		jf.add(this);

		
		jf.setSize(1200, 800);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void paint(Graphics g){
		super.paint(g);

		Image backImage = Toolkit.getDefaultToolkit().getImage("images/defaultMap.png");
		g.drawImage(backImage, 0, 0, 1200, 800, this);

		g.drawImage(doorUp, 400, 100, 300, 200, this);
	}

	public void DoorUp() {
		try {
			doorUp = ImageIO.read(new File("images/doorUp.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void DoorDown() {
		try {
			doorDown = ImageIO.read(new File("images/doorDown.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void DoorLeft() {
		try {
			doorL = ImageIO.read(new File("images/doorLeft.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void DoorRight() {
		try {
			doorR = ImageIO.read(new File("images/doorRight.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//테스트용 메인
	public static void main(String[] args) { 
		new DefaultMap();
	}


}
