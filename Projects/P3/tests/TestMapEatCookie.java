import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  @Test
  public void testMapEatCookie() throws FileNotFoundException {
    Mainframe frame = new MainFrame(); 
    NoFrame frame = new NoFrame(); 

    PacMan pacman = frame.addPacMan(new Location(1, 2));
    assertTrue(frame.getMap.eatCookie("pacman") != null);

    PacMan pacman2 = frame.addPacMan(new Location(0, 0));
    assertTrue(frame.getMap.eatCookie("pacman") == null);
  }
}