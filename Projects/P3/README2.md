# Pacman

## Group Members: Annie Chen, June Philip, Colin Brager, Jahanzeb Hassan

## Gameplay
![Imgur Image](https://i.imgur.com/zo87QS2.png)

## Functions
### PacMan Class
#### get_valid_moves()
**Description:** Function that returns an ArrayList that contains all possible moves for PACMAN (stored as LOCATIONS).<br />
**Implementation:** Add all possible moves in a 1 unit radius to PACMAN, and remove any locations that contain a WALL in it.<br />
**Tests:** Test places a pacman on the board and confirms that get_valid_moves() only returns valid known good locations.<br />
#### move()
**Description:** Function that moves PACMAN by 1 unit and returns a boolean indicating whether or not PACMAN was able to move.<br />
**Implementation:** Stored all valid moves from get_valid_moves() in an ArrayList and simply picked a random move from the list.<br />
**Tests:** Placed PACMAN in top left corner of board, invoked the move() method, and then just checked if PACMAN moved to one of the valid locations in get_valid_moves().<br />
#### is_ghost_in_range()
**Description:** Function that returns true if a ghost is nearby (1 unit distance away), false otherwise.<br />
**Implementation:** Stored x and y coordinates of location and also stores what Types are within the range of pacman's current position. In each possible location, it is checked to see if a Ghost exists.<br />
**Tests:** A test for when a Ghost is in range of Pacman.<br />
#### consume()
**Description:**<br />
**Implementation:**<br />
**Tests:**<br />
### Ghost Class
#### get_valid_moves()
**Description:** Function returns an Arraylist of Locations for where the Ghost can move to based on its current position.<br />
**Implementation:** Created an ArrayList (to be returned) that contains where the Ghost can move based on its current position (while making sure that a wall will not be in the way).<br />
**Tests:** A test seeing if the ghost can move to positions that are available.<br />
#### move()
**Description:**<br />
**Implementation:**<br />
**Tests:**<br />
#### is_pacman_in_range()
**Description:** This function checks if there is a PACMAN in the attack radius (+- 1 to x,y) of a given ghost. If so, return true, and false if not.<br />
**Implementation:** Checks a 1 unit radius and uses Map's getLoc to check if pacman is inside any of said spaces<br />
**Tests:** Places a PACMAN and Ghost on the board and verifies if is_pacman_in_range is correct.<br />
#### attack()
**Description:** If PACMAN is in attack range, this function handles the ghost attacking PACMAN and returns a boolean indicating if the ghost was successfully able to attack PACMAN.<br />
**Implementation:** Checked if PACMAN is in range using the method is_pacman_in_range() and invoked Map.attack() if so.<br />
**Tests:** Placed a ghost that was out of attack range and one that was in attack range. Then, asserted that the out of range ghost attack returned false and the in range ghost attack returned true and ended the game.<br />
### Map Class
#### move()
**Description:**<br />
**Implementation:**<br />
**Tests:**<br />
#### getLoc()
**Description:** Function that returns a HashSet containing various map types (GHOST, PACMAN, EMPTY, etc), for a location argument, based on the board's status at any given moment.<br />
**Implementation:** Returns the Location found in the field variable, and  a set with just an Empty if the location DNE.<br />
**Tests:** Places items on the game map and confirms that getLoc returns the correct information.<br />
#### attack()
**Description:** Map handler for when a ghost attacks PACMAN.<br />
**Implementation:** Set the gameOver class variable to true.<br />
**Tests:** Invoked Map.attack() and checked if the gameOver variable was subsequently set to true.<br />
#### eatCookie()
**Description:** Function that returns the Cookie Component if it got eaten by PacMan, otherwise it returns null.<br />
**Implementation:** Stores the location, token of the pacman given. Checks to see if components variable contains that token (has an existing key) and if so, will check if a component at that token has a cookie. If that is also true, locations, components, and field variables are updated to remove the cookie, and the cookie that was eated (removed) is returned. Otherwise null is returned.<br />
**Tests:** A test for if a cookie and pacman are at the same location, and a test for if a cookie and pacman are not in the same location.<br />

## Running Program
### Compilation
`javac MainFrame.java`
### Execution
`java MainFrame`
