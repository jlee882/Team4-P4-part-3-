import java.io.*;
import java.util.List;

import junit.framework.*;

public class TestMapMove extends TestCase {

public void testMapMove() throws FileNotFoundException {
	  NoFrame frame = new NoFrame();	    
	  PacMan pacman = frame.addPacMan(new Location(1, 1));
	  Location curLoc = pacman.myLoc;
	  
    pacman.myMap.move(pacman.myName, new Location(1, 2), Map.Type.PACMAN);
	  
	  assert pacman.myMap.getLoc(new Location(1, 2)).contains(Map.Type.PACMAN);
  }
}
