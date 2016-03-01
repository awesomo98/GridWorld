package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter {
	public void processActors (ArrayList<Actor> actors) {
		Grid gr = getGrid();
		for (Actor a : actors) {
			Location loc = getLocation();
			setDirection(getLocation().getDirectionToward(loc));
			if (a instanceof Critter) {
				a.moveTo(loc);
			}
		}
	}
}
