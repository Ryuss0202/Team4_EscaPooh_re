package com.escapooh.game.bee;

import java.awt.Image;

import com.escapooh.game.bee.model.vo.LifeNScore;

public class Bullet extends Crush{
	LifeNScore ls = new LifeNScore();
	int score = 0;
	
	
	private BeeRun bee;
	public Bullet(BeeRun run, Image image, int x, int y) {
		super(image, x ,y);
		this.bee = run;
		dy = -30;
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
			bee.Score(0);
		}
	}
	

}
