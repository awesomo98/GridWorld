### Part 1
1. No. It takes a full step for the bug to change direction.
2. Where the antennae are facing.
3. It changes direction by spinning.
4. A flower.
5. If it is facing an edge, then it changes direction. If not then it moves forward.
6. It will turn to the right until the path is clear.
7. No.
8. It becomes darker as time passes.
9. No. It just stays there.
10. No. Once something else is there, the old object goes away.
#### Exercise:
1. | Degrees | Compass Direction |
|---------|-------------------|
|    0    |       North       |
|    45   |     Northeast     |
|    90   |        East       |
|   135   |     Southeast     |
|   180   |       South       |
|   225   |     Southwest     |
|   270   |        West       |
|   315   |     Northwest     |
|   360   |       North       |
2. You can move it anywhere inside the grid. It will give an error message.
3. I used the setColor method.
4. The bug got squashed (It's gone).

### Part 2
1. It defines the length of the side of a square outlined by the bug.
2. The number of moves the bug makes.
3. It needs to turn twice to go from one cardinal direction to another in order to make a square.
4. Because it is able to draw from the parent class Bug.
5. No, it depends on where it is created.
6. No. It is a set box.
7. After the bug switches cardinal direction.
#### Exercises:
1. It's an octagon instead of a box.
5. To add another BoxBug actor, I would first initialize the actor with BoxBug name = new Boxbug(), thencall the location of the bug with world.add(new Location(x, y), name);. I could also initialize the color with name.setColor(Color.COLOR);

### Part 3
#### Set 3
1. public int firstRow
2. False
3. (4, 4)
4. 135
5. You tell it which direction to check in.
#### Set 4
1. Go down each row, checking the number of objects in each row until the bottom. Count every space, and subtract the previous value.
2. boolean isValid(Location (10, 10))
3. It initializes the methods for the classes to use because it's an interface. In the Bounded and unbounded grid classes
4. No, because it is easier and simpler, as well as more easy to understand, using an ArrayList.
#### Set 5
1. Color, Location, and Direction
2. The direction is 0 (north) and the color is red
3. So that it could be accessed directly, and can change values of the attributes of the actors.
4. No. No, it can only be removed once. Yes, it can. It will be initialized twice, with the same attributes.
5. Use the turn() method twice.
#### Set 6
1. If the grid value is null, the method returns false.
2. If there is a rock obstructing, it will return false and therefore move 45 degrees instead of moving.
3. getGrid(); it initializes the grid
4. getLocation() and getDirection(). These allow it to decide where it is and where the actor is facing to determine if it can move.
5. neighbor; checks what the value of an actor next to it is.
6. It removes itself from the grid.
7. You could call getLocation multipe times instead, but that would make the code more wet.
8. Because the code tells it to have the same color.
9. Yes
10. new flower, and putselfingrid
11. 6 times. 

### Part 4
#### Set 7
1. act(), processActors(), selectMoveLocation, getMoveLocations, makeMove()
2. Checking the grid, processActors, get MoveLocations, selectMoveLocation, makeMove
3. No because if need be they can change attributes to the actors without changing the act method.
4. removeSelfFromGrid(), check for a rock, and check for a critter
5. processActors (initializes the ability to move), selectMoveLocation (Point to, or choose, where to critter will move to), and moveTo (actually perform the move action) (or getMoveLocation)?
6. Because the actual method which controls the character is the actor method

#### Set 8
1. Because the ChameleonCritter class extends Critter, which has the act method, causing it to perform distinct actions.
2. Because it overrides the makeMove method in the Critter class.
3. Flower flower = new Flower(getColor()); flower.putSelfInGrid(gr, loc);
4. Because it doesn't need to.
5. Actor
6. getGrid

#### Set 9
1. Because it doesn't need to process the actors any differently.
2. It will always eat all the actors that are in front of it. If there is nothing to eat, it will move side to side.
3. Because it needs to process multiple actors in multiple locations at once.
4. (4,3), (4,4), and (4,5)
5. A CrabCritter only moves side to side and eats the actors in front and diagonal to it. They both move, getActors, act; everything that is a part of Critter is simply extended by CrabCritter.
6. It checks if it can make any moves, and if it can't then it turns.
7. Because the source code for their class excludes them from items available to eat.
