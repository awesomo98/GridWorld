package part2;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class DancingBugRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		int[] turns = {69, 700, 80, 58};
		DancingBug slippers = new DancingBug(turns);
		slippers.setColor(Color.ORANGE);
		world.add(new Location(7, 8), slippers);
		world.show();

	}

}
