// Contains a reference to the Player.
// Draws all relevant information at the
// bottom of the screen.

package com.escapooh.pooo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class Hud {
	
	//�����̹��� ���� ����
	private BufferedImage hint;
	static BufferedImage HINT1;
	static BufferedImage HINT2;
	static BufferedImage HINT3;
	static BufferedImage HINT4;
	
	boolean quiz1pass = false;
	boolean quiz2pass = false;
	boolean quiz3pass = false;
	boolean quiz4pass = false;
	
	//�̷��� ����� ����Ȯ�ΰ� ��Ʈ����
//	private int numHints;
//	
//	private Font font;
//	private Color textColor; 
	
	public Hud() {
		
		
		
		// ��Ʈ �̹��� �߰�
		try {
			HINT1 = ImageIO.read(new File("images/number1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			HINT2 = ImageIO.read(new File("images/number2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			HINT3 = ImageIO.read(new File("images/number3.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			HINT4 = ImageIO.read(new File("images/number4.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		font = new Font("Arial", Font.PLAIN, 10);
//		textColor = new Color(47, 64, 126);
		
	}
	
	public void draw(Graphics g) {
		
		// ��Ʈ �׸���
		if (quiz1pass == true)
		g.drawImage(HINT1, 70, 650, 70, 70, null);
		
		if (quiz2pass == true)
		g.drawImage(HINT2, 140, 650, 70, 70, null);
		
		if (quiz3pass == true)
		g.drawImage(HINT3, 210, 650, 70, 70, null);
		
		if (quiz4pass == true)
		g.drawImage(HINT4, 280, 650, 70, 70, null);
		
		
		
	}
	
	
	
}
