package com.escapooh.game.bee.model.vo;

import java.io.Serializable;

public class LifeNScore implements Serializable{
	private int life = 3;
	private int score = 0;

	public LifeNScore() {}

	public LifeNScore(int life, int score) {
		super();
		this.life = life;
		this.score = score;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
