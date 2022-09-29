import junit.framework.TestCase;

import java.awt.Color;
import java.io.FileNotFoundException;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens

    Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red);
    PacMan pacman = frame.addPacMan(new Location(2, 1));
    assert (ghost.is_pacman_in_range());
    ghost = frame.addGhost(new Location(2, 1), "name", Color.red);
    assert (ghost.is_pacman_in_range());
    ghost = frame.addGhost(new Location(3, 1), "name", Color.red);
    assert (ghost.is_pacman_in_range());
    ghost = frame.addGhost(new Location(69, 13), "name", Color.red);
    assert(!ghost.is_pacman_in_range());

  }
}


