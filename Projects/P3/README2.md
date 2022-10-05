
# Pacman
## Group Members: Annie Chen, June Philip, Colin Brager, Jahanzeb Hassan

1. Image of Playing PacMan
2. How to run the code from the command line
  - 
3. Functions Written
  - PacMan Class
    1. get_valid_moves() - Function that returns an ArrayList that contains all possible moves for PACMAN (stored as LOCATIONS).
    2. move() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    3. is_ghost_in_range() - Function that returns true if a ghost is nearby (1 unit distance away), false otherwise.:
      - Implementation: Stored x and y coordinates of location and also stores what Types are within the range of pacman's current position. In each possible location, it is checked to see if a Ghost exists. 
      - Tests: A test for when a Ghost is in range of Pacman.
    4. consume() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
  - Ghost Class
    1. get_valid_moves() - Function returns an Arraylist of Locations for where the Ghost can move to based on its current position.:
      - Implementation: Created an ArrayList (to be returned) that contains where the Ghost can move based on its current position (while making sure that a wall will not be in the way).
      - Tests: A test seeing if the ghost can move to positions that are available.
    2. move() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    3. is_pacman_in_range() - This function checks if there is a PACMAN in the attack radius (+- 1 to x,y) of a given ghost. If so, return true, and false if not.
      - Tests: Places a PACMAN and Ghost on the board and verifies if is_pacman_in_range is correct.
    4. attack()
  - Map Class
    1. move() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    2. getLoc() - Function that returns a HashSet containing various map types (GHOST, PACMAN, EMPTY, etc), for a location argument, based on the board's status at any given moment.
    3. attack() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    5. eatCookie() - Function that returns the Cookie Component if it got eaten by PacMan, otherwise it returns null.:
      - Implementation: Stores the location, token of the pacman given. Checks to see if components variable contains that token (has an existing key) and if so, will check if a component at that token has a cookie. If that is also true, locations, components, and field variables are updated to remove the cookie, and the cookie that was eated (removed) is returned. Otherwise null is returned. 
      - Tests: A test for if a cookie and pacman are at the same location, and a test for if a cookie and pacman are not in the same location.

