package com.escapooh.game.bee;

import java.awt.Image;

public class Bee extends Crush{
	private BeeRun run;
	
	public Bee(BeeRun run, Image image, int x, int y) {
		super(image, x, y);
		this.run = run;
		dx = -30;
	}
	public void move() {
		if(((dx < 0)&&(x < 10)) || ((dx > 0) && (x > 1050))) {
			dx = -dx;
			y += 20;
			
			if (y > 600) {
				run.endGame();
			}
		}
		super.move();
	}
	
}
