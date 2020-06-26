package com.escapooh.game.bee;

import java.awt.Image;

import javax.swing.JFrame;

public class Slingshot extends Bullet{

	private JFrame jf;
	public BeeRun run;

	public Slingshot(BeeRun run, Image image, int x, int y) {
		super(run, image, x, y);
		dx = 0;
		dy = 0;
	}
	@Override
	public void move() {
		if((dx < 0) && (x < 10)) {
			return;
		}
		if((dx > 0) && (x > 1100)) {
			return;
		}
		if((dy > 0) && (x > 1200)) {
			return;
		}
		
		if((dy > 0 )&&(y > 600)) {
			return;
		}
		super.move();
	}

	@Override
	public void handleCollision(Crush other){
		if(other instanceof Bee) {
			try {
			run.endGame();
			}catch (NullPointerException e) {
				System.out.println("Ãæµ¹");
			}finally {
				System.exit(0);
				
			}
		}

	}



}
