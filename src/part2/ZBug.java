package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	private int steps;
	private int sideLength;
	
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
//		faceEast();
	}
	
	public void faceEast() {
		while (getDirection() != 90) {
			turn();
		}
	}
	
	public void zMove() {
		while (steps < sideLength && canMove()) {
			move();
			steps++;
		}
	}
	
	public void turn3() {
		turn();
		turn();
		turn();
	}
	
	public void turn4() {
		turn();
		turn();
		turn();
		turn();
	}
	
	public void act() {
		faceEast();
		zMove();
		turn();
		turn3();
		zMove();
		turn4();
		zMove();
	}
}
