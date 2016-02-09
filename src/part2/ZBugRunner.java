package part2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ZBugRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		ZBug alice = new ZBug(4);
		world.add(new Location(7, 8), alice);
		world.show();

	}

}
