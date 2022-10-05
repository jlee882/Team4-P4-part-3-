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
