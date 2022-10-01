import java.io.*;
import junit.framework.*;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); 

    // only can go down or to the right
    Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red); 
    ArrayList<Location> possible_locs = new ArrayList<Location>();
    Location down = new Location(1, 2);
    Location right = new Location(2, 1);

    possible_locs.append(down, right);

    assertTrue(ghost.get_valid_moves().containsAll(possible_locs));
  }
}
