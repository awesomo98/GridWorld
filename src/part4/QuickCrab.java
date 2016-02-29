package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
	
	
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();
		int[] dirs = {Location.LEFT, Location.RIGHT};
		for (Location loc : getLocationsInDirections(dirs)) {
			if (getGrid().get(loc) == null) {
				
			}
		}
		return locs;
	}
}