import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
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
    ArrayList<Location> valid_moves = new ArrayList<Location>();
    if(this.myLoc.x - 1 >= 0){
      valid_moves.add(new Location(this.myLoc.x - 1, this.myLoc.y));
      valid_moves.add(new Location(this.myLoc.x - 1, this.myLoc.y+1));

    }
    if(this.myLoc.y - 1 >= 0){
      valid_moves.add(new Location(this.myLoc.x, this.myLoc.y - 1));
      valid_moves.add(new Location(this.myLoc.x + 1, this.myLoc.y-1));
    }
    
    if ((this.myLoc.x - 1 >= 0) && (this.myLoc.y - 1 >= 0)){
          valid_moves.add(new Location(this.myLoc.x -1, this.myLoc.y - 1));
    }
    
    valid_moves.add(new Location(this.myLoc.x + 1, this.myLoc.y));
    valid_moves.add(new Location(this.myLoc.x , this.myLoc.y + 1));
    valid_moves.add(new Location(this.myLoc.x + 1, this.myLoc.y+1));

    valid_moves.removeIf(loc -> this.myMap.getLoc(loc).contains(Map.Type.WALL));

    return valid_moves;
  }

  public boolean move() {
    ArrayList<Location> validMoves = get_valid_moves();
	
    if (!validMoves.isEmpty()) {
      return false;
    }
    
    Random rand = new Random();
    Location nextMove = validMoves.get(rand.nextInt(validMoves.size()));
      
    if (myMap.move(myName, nextMove, Map.Type.PACMAN)) {
      myLoc = nextMove;
      return true;
    }
    
    return false;
  }

  public boolean is_ghost_in_range() {
    Location curr_loc = this.myLoc;
    int x_val = curr_loc.x;
    int y_val = curr_loc.y;

    Location loc = new Location(x_val, y_val);
    HashSet<Map.Type> types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }

    // to the right
    loc = new Location(x_val + 1, y_val);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }
      

    // to the left
    loc = new Location(x_val - 1, y_val);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }

    // to the right upper corner
    loc = new Location(x_val + 1, y_val + 1);
   types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }

    // to the right lower corner
    loc = new Location(x_val + 1, y_val - 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }

    // to the top
    loc = new Location(x_val, y_val - 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }

    // to the bottom
    loc = new Location(x_val, y_val + 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }

    // to the left lower corner
    loc = new Location(x_val - 1, y_val - 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }

    // to the left upper corner
    loc = new Location(x_val - 1, y_val + 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return false;
      }
    }
    return false;
  }

  public JComponent consume() {
    HashSet<Map.Type> locTypes = myMap.getLoc(myLoc);

    if (locTypes.contains(Map.Type.COOKIE)){
      return myMap.eatCookie("pacMan");
    }

    return null;
  }
}
