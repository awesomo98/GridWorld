package part2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int[] turns;
	private int step;
	
	public DancingBug(int[] turns) {
		this.turns = turns;
		step = 0;
	}
	
	public void turn(int times) {
		for (int j = 1; j <= times; j++) {
			turn();
		}
	}
	
	public void act() {
		if (step == turns.length)
			step = 0;
			turn (turns [step]);
			step++;
			super.act();
	}
}
