import java.awt.Color;
import java.io.*;
import junit.framework.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); 

    // only can go down or to the right
    Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red); 
    ArrayList<Location> possible_locs = new ArrayList<Location>();
    Location down = new Location(1, 2);
    Location right = new Location(2, 1);

    possible_locs.add(down);
    possible_locs.add(right);

    assert (ghost.get_valid_moves().containsAll(possible_locs));
  }
}
