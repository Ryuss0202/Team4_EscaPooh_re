package com.escapooh.game.bee;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.escapooh.game.bee.model.vo.LifeNScore;

//import com.escapooh.game.bee.model.vo.LifeNScore;

public class Crush {
	
	protected int x;	//x
	protected int y;	//y
	protected int dx;	//move x
	protected int dy;	//move y
	
	private Image image;	//image
	
	public Crush(Image image, int x, int y) {
		this.image = image;
		this.x = x;
		this.y = y;
	}
	//��������Ʈ�� ���� ���� ��ȯ�Ѵ�.
		public int getWidth(){
			return image.getWidth(null);
		}
		//��������Ʈ�� ���� ���̸� ��ȯ�Ѵ�
		public int getHeight(){
			return image.getHeight(null);
		}
		//��������Ʈ�� ȭ�鿡 �׸���
		public void draw (Graphics g){
			g.drawImage(image,x,y,null);
		}
		//��������Ʈ�� �����δ�.
		public void move(){
			x+= dx;
			y+= dy;
		}

		//dx�� �����Ѵ�.
		public void setDx(int dx){this.dx = dx;}
		//dy�� �����Ѵ�.
		public void setDy(int dy){this.dy = dy;}
		//dx�� ��ȯ�Ѵ�
		public int getDx() {return dx;}
		//dy�� ��ȯ�Ѵ�
		public int getDy() {return dy;}
		//x�� ��ȯ�Ѵ�.
		public int getX(){	return x;}
		//y�� ��ȯ�Ѵ�.
		public int getY(){	return y;}

		public boolean checkCollision(Crush other) {
			Rectangle myRect = new Rectangle();
			Rectangle otherRect = new Rectangle();
			
			myRect.setBounds(x, y, getWidth(),getHeight());
			otherRect.setBounds(other.getX(),other.getY(),
					other.getWidth(),other.getHeight());
			return myRect.intersects(otherRect);
		}
		
		public void handleCollision(Crush other){
			
		}

}
