package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class ChameleonKid extends ChameleonCritter {
	public ArrayList<Actor> getActor() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] n = {Location.AHEAD, Location.HALF_CIRCLE};
		for (Location loc : getLocationAt(n)) {
			Actor a = getGrid().get(loc);
			if (a != null) {
				actors.add(a);
			}
			return actors;
		}
	}
		public ArrayList<Location> getLocationAt() {
			
			
		}
}
	
