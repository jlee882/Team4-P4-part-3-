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
