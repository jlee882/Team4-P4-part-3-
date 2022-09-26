import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    Location curr_loc = this.myLoc;
    int x_val = curr_loc.x
    int y_val = curr_loc.y

    if this.myMap.getLoc(Location(x_val, y_val)) == Map.Type.GHOST:
      return true;

    // to the right
    else if this.myMap.getLoc(Location(x_val + 1, y_val)) == Map.Type.GHOST:
      return true;

    // to the left
    else if this.myMap.getLoc(Location(x_val - 1, y_val)) == Map.Type.GHOST:
      return true;

    // to the right upper corner
    else if this.myMap.getLoc(Location(x_val + 1, y_val + 1)) == Map.Type.GHOST:
      return true;

    // to the right lower corner
    else if this.myMap.getLoc(Location(x_val + 1, y_val - 1)) == Map.Type.GHOST:
      return true;

    // to the bottom
    else if this.myMap.getLoc(Location(x_val, y_val - 1)) == Map.Type.GHOST:
      return true;

    // to the top
    else if this.myMap.getLoc(Location(x_val, y_val + 1)) == Map.Type.GHOST:
      return true;

    // to the left lower corner
    else if this.myMap.getLoc(Location(x_val - 1, y_val - 1)) == Map.Type.GHOST:
      return true;

    // to the left upper corner
    else if this.myMap.getLoc(Location(x_val - 1, y_val + 1)) == Map.Type.GHOST:
      return true;

    else:
      return false;
  }

  public JComponent consume() {
    return null;
  }
}
