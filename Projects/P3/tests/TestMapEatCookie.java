import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); 

    PacMan pacman = frame.addPacMan(new Location(1, 2));
    assert (frame.getMap().eatCookie("pacman") != null);

    PacMan pacman2 = frame.addPacMan(new Location(0, 0));
    assert (frame.getMap().eatCookie("pacman") == null);
  }
}