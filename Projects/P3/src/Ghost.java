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

    for(Location loc : radiusAttack){
      if(this.myMap.getLoc(loc).contains(Map.Type.PACMAN)){
        return true;
      }
    }

    return false;
  }

  public boolean attack() {
    return false;
  }
}
