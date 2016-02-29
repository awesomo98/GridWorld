package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class BlusterRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new Location(5, 5), new BlusterCritter());
		world.add(new Location(7, 9), new BlusterCritter());
		world.add(new Location(7, 8), new Flower());
		world.add(new Location(4, 5), new Rock());
		world.add(new Location(6, 3), new Critter());
	}

}
