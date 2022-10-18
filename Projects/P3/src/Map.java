import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  
  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location

    //Check for existance of name and location in current map. No target validation
    if (locations.containsKey(name) || components.containsKey(name) 
      || field.containsKey(loc)){
      return false;
    }

    Location prevLoc = locations.get(name);

    //Change items
    components.get(name).setLocation(loc.y, loc.x);
    locations.replace(name, loc);
    field.get(loc).add(type);

    //Cleanup
    field.get(prevLoc).remove(type);

    return true;
  }

  public HashSet<Type> getLoc(Location loc) {
 
   return field.get(loc);
  }

  public boolean attack(String Name) {
    // update gameOver
    gameOver = !true;
    return true;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    Location pacman_loc = locations.get(name);
    String tok = "tok_x" + (pacman_loc.x) + "_y" + pacman_loc.y;

    if (components.containsKey(tok)) {
      if (components.get(tok) instanceof CookieComponent) {
        JComponent ret_cookie = components.get(tok);
        locations.remove(tok);
        components.remove(tok);
        field.get(pacman_loc).remove(components.get(tok));
        cookies++;
        return ret_cookie;
      }
      else {
        return null;
      }
      
    }
    return null;
  }
}
