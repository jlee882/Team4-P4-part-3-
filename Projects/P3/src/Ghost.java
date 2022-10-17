import java.util.ArrayList;
import java.util.HashSet;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    ArrayList<Location> moves = new ArrayList<Location>();
    ArrayList<Location> moves2 = new ArrayList<Location>();
    Location curr_loc = this.myLoc;
    int x_val = curr_loc.x;
    int y_val = curr_loc.y;

    // to the right
    Location loc = new Location(x_val + 1, y_val);
    HashSet<Map.Type> types = this.myMap.getLoc(loc);
    for (Map.Type type : types) {
      if (type != Map.Type.WALL) {
        moves.add(loc);
      }
    }

    // to the left
    loc = new Location(x_val - 1, y_val);
    types = this.myMap.getLoc(loc);
    for (Map.Type type : types) {
      if (type != Map.Type.WALL) {
        moves.add(loc);
      }
    }

    // to the upper right corner
    loc = new Location(x_val + 1, y_val + 1);
    types = this.myMap.getLoc(loc);
    for (Map.Type type : types) {
      if (type != Map.Type.WALL) {
        moves.add(loc);
      }
    }

    // to the lower right corner
    loc = new Location(x_val + 1, y_val - 1);
    types = this.myMap.getLoc(loc);
    for (Map.Type type : types) {
      if (type != Map.Type.WALL) {
        moves.add(loc);
      }
    }

    // up
    loc = new Location(x_val, y_val - 1);
    types = this.myMap.getLoc(loc);
    for (Map.Type type : types) {
      if (type != Map.Type.WALL) {
        moves.add(loc);
      }
    }

    // down
    loc = new Location(x_val + 1, y_val + 1);
    types = this.myMap.getLoc(loc);
    for (Map.Type type : types) {
      if (type != Map.Type.WALL) {
        moves.add(loc);
      }
    }

    // upper left corner
    loc = new Location(x_val - 1, y_val + 1);
    types = this.myMap.getLoc(loc);
    for (Map.Type type : types) {
      if (type != Map.Type.WALL) {
        moves.add(loc);
      }
    }

    // lower left corner
    loc = new Location(x_val - 1, y_val - 1);
    types = this.myMap.getLoc(loc);
    for (Map.Type type : types) {
      if (type != Map.Type.WALL) {
        moves.add(loc);
      }
    }
    
    moves = moves2;
    return moves;
  }

  public boolean move() {
    ArrayList<Location> validMoves = get_valid_moves();

    //relies on the locations from get_valid_moves being properly instantiated to new objects
    //Checks if there is at least 1 valid move and if the move resolves correctly
    if (!validMoves.isEmpty() && myMap.move(myName, validMoves.get(0), Map.Type.GHOST)){
      myLoc = validMoves.get(0);
      return true;
    }
    
    return false;
  }

  public boolean is_pacman_in_range() {
    ArrayList<Location> radiusAttack = new ArrayList<>();
    radiusAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y));
    radiusAttack.add(new Location(this.myLoc.x + 1, this.myLoc.y));
    radiusAttack.add(new Location(this.myLoc.x, this.myLoc.y - 1));
    radiusAttack.add(new Location(this.myLoc.x, this.myLoc.y + 1));
    radiusAttack.add(new Location(this.myLoc.x + 1, this.myLoc.y + 1));
    radiusAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y - 1));
    radiusAttack.add(new Location(this.myLoc.x, this.myLoc.y));
    radiusAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y + 1));
    radiusAttack.add(new Location(this.myLoc.x + 1, this.myLoc.y - 1));

  
    return false;
  }

  public boolean attack() {
    if (is_pacman_in_range()) {
      return myMap.attack(myName);
    }

    return false;
  }
}
