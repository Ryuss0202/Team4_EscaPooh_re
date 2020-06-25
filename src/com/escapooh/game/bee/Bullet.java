package com.escapooh.game.bee;

import java.awt.Image;

public class Bullet extends Crush{
	private BeeRun bee;
	public Bullet(BeeRun run, Image image, int x, int y) {
		super(image, x ,y);
		this.bee = run;
		dy = -3;
	}
	
	@Override
	public void move() {
		super.move();
		if(y < -100) {
			bee.removeSprite(this);
		}
	}
	@Override
	public void handleCollision(Crush other) {
		if(other instanceof Bee) {
			bee.removeSprite(this);
			bee.removeSprite(other);
		}
	}
	

}
