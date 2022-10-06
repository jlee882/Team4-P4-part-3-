import java.io.*;
import java.util.List;

import junit.framework.*;

public class TestConsume extends TestCase {

public void testPacManMove() throws FileNotFoundException {
	  NoFrame frame = new NoFrame();	    
	  PacMan pacman = frame.addPacMan(new Location(1, 2));
    assert (pacman.consume() != null);

    PacMan pacman2 = frame.addPacMan(new Location(0, 0));
    assert (pacman2.consume() == null);
  }
}
