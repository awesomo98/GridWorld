package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class ChameleonKid extends ChameleonCritter {
	public ArrayList<Actor> getActor() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] directions = {Location.AHEAD, Location.HALF_CIRCLE};
		for (Location loc : getLocationAt()) {
			Actor actor = getGrid().get(loc);
			if (actor != null) {
				actors.add(actor);
			}
			return actors;
		}
	}
		public ArrayList<Location> getLocationAt(int[] directions) {
			ArrayList<Location>locs = new ArrayList<Location>();
			Grid gr = getGrid();
			Location loc = getLocation();
			
			for (int d : directions) {
				Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
				if (gr.isValid(neighborLoc)) {
					locs.add(neighborLoc);
				}
			}
			
		}
}
	
