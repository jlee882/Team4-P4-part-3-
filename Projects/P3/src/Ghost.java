import java.util.ArrayList;

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
    Location curr_loc = this.myLoc;
    int x_val = curr_loc.x
    int y_val = curr_loc.y

    // to the right
    HashSet<Type> types = this.myMap.getLoc(Location(x_val + 1, y_val))
    for (Type type : types) {
      if type != WALL {
        moves.add(Location(x_val + 1, y_val));
      }
    }

    // to the left
    HashSet<Type> types = this.myMap.getLoc(Location(x_val - 1, y_val))
    for (Type type : types) {
      if type != WALL {
        moves.add(Location(x_val - 1, y_val));
      }
    }

    // to the upper right corner
    HashSet<Type> types = this.myMap.getLoc(Location(x_val + 1, y_val + 1))
    for (Type type : types) {
      if type != WALL {
        moves.add(Location(x_val + 1, y_val + 1));
      }
    }

    // to the lower right corner
    HashSet<Type> types = this.myMap.getLoc(Location(x_val - 1, y_val + 1))
    for (Type type : types) {
      if type != WALL {
        moves.add(Location(x_val - 1, y_val + 1));
      }
    }

    // up 
    HashSet<Type> types = this.myMap.getLoc(Location(x_val, y_val + 1))
    for (Type type : types) {
      if type != WALL {
        moves.add(Location(x_val, y_val));
      }
    }

    // down
    HashSet<Type> types = this.myMap.getLoc(Location(x_val, y_val - 1))
    for (Type type : types) {
      if type != WALL {
        moves.add(Location(x_val, y_val - 1));
      }
    }

    // upper left corner
    HashSet<Type> types = this.myMap.getLoc(Location(x_val - 1, y_val + 1))
    for (Type type : types) {
      if type != WALL {
        moves.add(Location(x_val - 1, y_val + 1));
      }
    }

    // lower left corner
    HashSet<Type> types = this.myMap.getLoc(Location(x_val - 1, y_val - 1))
    for (Type type : types) {
      if type != WALL {
        moves.add(Location(x_val - 1, y_val - 1));
      }
    }

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
    return false;
  }

  public boolean attack() {
    if (is_pacman_in_range()) {
      return myMap.attack(myName);
    }

    return false;
  }
}
