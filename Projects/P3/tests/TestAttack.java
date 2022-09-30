import java.awt.Color;
import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
	  NoFrame frame = new NoFrame();	    
	  PacMan pacman = frame.addPacMan(new Location(1, 1));
	  Ghost ghostInRange = frame.addGhost(new Location(1, 2), "GHOST", Color.RED);
	  Ghost ghostOutOfRange = frame.addGhost(new Location(1, 6), "GHOST", Color.GREEN);
	  Map map = frame.getMap();
	  	   
	  assert !ghostOutOfRange.attack();
	  
	  assert ghostInRange.attack();
	  assert map.isGameOver();
  }
}
