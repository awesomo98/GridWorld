package part4;

import java.util.ArrayList;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class BlusterCritter extends Critter {
	
	private int courage;
	
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> twoNeighbor = new ArrayList<Actor>();
		Location loc = getLocation();
		int row = loc.getRow();
		int column = loc.getCol();	
		
		for (row = -2; row < 3; row++) {
			
		}
	}
	
	public void processActors(ArrayList<Actor> actors) {
		int total = 0;
		for (Actor a : actors) {
			
			if (a instanceof Critter)  {
				total++;
			}
			
			if (total >= courage) {
				setColor(getColor().darker());
			} else if (total < courage) {
				setColor(getColor().brighter());
			}
		}
	}

}
