import java.io.*;
import junit.framework.*;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
	  NoFrame frame = new NoFrame();
	  Map map = frame.getMap();
	  
	  assert !map.isGameOver();
	  
	  map.attack("fake pacman");
	  
	  assert map.isGameOver();
  }
}
