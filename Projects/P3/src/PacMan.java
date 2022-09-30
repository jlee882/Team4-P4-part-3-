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
	
    if (validMoves.isEmpty()) {
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
    return false;
  }

  public JComponent consume() {
    HashSet<Map.Type> locTypes = myMap.getLoc(myLoc);

    if (locTypes.contains(Map.Type.COOKIE)){
      return myMap.eatCookie(myName);
    }

    return null;
  }
}
