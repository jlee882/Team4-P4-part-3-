import junit.framework.TestCase;

import java.awt.Color;
import java.io.FileNotFoundException;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
//Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens
    // Initialized

//Creating Players
    Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red);
    PacMan pacman = frame.addPacMan(new Location(3, 3));
    assert(frame.getMap().getLoc(new Location(1, 1)).contains(Map.Type.GHOST));
    assert(frame.getMap().getLoc(new Location(3, 3)).contains(Map.Type.PACMAN));
    assert(frame.getMap().getLoc(new Location(60, 60)).contains(Map.Type.EMPTY));
    PacMan pacman2 = frame.addPacMan(new Location(1, 1));
    assert(frame.getMap().getLoc(new Location(1, 1)).contains(Map.Type.PACMAN));
  }
}
