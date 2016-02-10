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
		if ((canMove()) && (steps < (sideLength * 3))) {
			faceEast();
			zMove();
			turn3();
			zMove();
			turn4();
			turn();
			zMove();
		}
	}
	
	public void zMove() {
		for (int j = 0; j < sideLength; j++) {
			move();
			steps++;
		}
	}
}
