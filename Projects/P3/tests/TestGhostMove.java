import java.awt.Color;
import java.io.*;
import java.util.List;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();	    
	  Ghost ghost = frame.addGhost(new Location(1, 1), "Blinky", Color.RED);
	  List<Location> locations = ghost.get_valid_moves();
	  
	  ghost.move();
	  
	  assert locations.contains(ghost.myLoc);
  }
}
