package part3;

import java.awt.Color;

import info.gridworld.actor.Actor;

public class Jumper extends Actor {
	public Jumper() {
		setColor(Color.PINK);
	}
	
	public Jumper(Color JumperColor) {
		setColor(JumperColor);
	}
	
	public void act() {
		if (canJump()) {
			jump();
		} else {
			turn();
		}
	}
	
	public void jump() {
		
	}
}
