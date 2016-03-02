package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter {
	public void processActors(ArrayList<Actor> actors) {
		Grid gr = getGrid();
		for (Actor a : actors) {
			Location loc = a.getLocation();
			int dir = getLocation().getDirectionToward(loc);
			Location nextLoc = loc.getAdjacentLocation(dir);
			if (gr.isValid(nextLoc) && gr.get(nextLoc) == null) {
				a.moveTo(nextLoc);
			} else {
				a.removeSelfFromGrid();
			}
		}
	}
}
