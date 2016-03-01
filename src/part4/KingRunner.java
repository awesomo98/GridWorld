package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class KingRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new Location(7,7), new KingCrab());
		world.add(new Location(6, 5), new Rock());
	}

}
