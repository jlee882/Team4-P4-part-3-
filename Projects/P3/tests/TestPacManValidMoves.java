import junit.framework.TestCase;

import java.io.FileNotFoundException;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens

    PacMan pacman = frame.addPacMan(new Location(2, 1));
    assert (pacman.get_valid_moves().contains(new Location(1,1)));
    assert (pacman.get_valid_moves().contains(new Location(3,1)));
    assert (!pacman.get_valid_moves().contains(new Location(2,2)));
    assert (!pacman.get_valid_moves().contains(new Location(2,0)));

  }
}
