import java.io.*;
import java.util.List;

import junit.framework.*;

public class TestPacManMove extends TestCase {

public void testPacManMove() throws FileNotFoundException {
	  NoFrame frame = new NoFrame();	    
	  PacMan pacman = frame.addPacMan(new Location(1, 1));
	  List<Location> locations = pacman.get_valid_moves();
	  
	  pacman.move();
	  
	  assert locations.contains(pacman.myLoc);
  }
}
