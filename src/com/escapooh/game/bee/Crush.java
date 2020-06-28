package com.escapooh.game.bee;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.escapooh.game.bee.model.vo.LifeNScore;



public class Crush {
	
	protected int x;	//x
	protected int y;	//y
	protected int dx;	//move x
	protected int dy;	//move y
	
	private Image image;	//image
	
	private BeeRun run;
	
	public Crush(Image image, int x, int y) {
		this.image = image;
		this.x = x;
		this.y = y;
	}
		public int getWidth(){
			return image.getWidth(null);
		}
		public int getHeight(){
			return image.getHeight(null);
		}
		public void draw (Graphics g){
			g.drawImage(image,x,y,null);
		}
		public void move(){
			x+= dx;
			y+= dy;
		}

		public void setDx(int dx){this.dx = dx;}
		public void setDy(int dy){this.dy = dy;}
		public int getDx() {return dx;}
		public int getDy() {return dy;}
		public int getX(){	return x;}
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
			if(other == other) {
			}else {
				System.out.println("c");
			}
		}

}
