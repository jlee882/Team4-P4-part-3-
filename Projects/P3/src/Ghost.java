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
    return null;
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
