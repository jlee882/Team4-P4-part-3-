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

