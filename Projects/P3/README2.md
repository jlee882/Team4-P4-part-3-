# Pacman

## Group Members: Annie Chen, June Philip, Colin Brager, Jahanzeb Hassan

1. Image of Playing PacMan
2. How to run the code from the command line
  - 
3. Functions Written
  - PacMan Class
    1. get_valid_moves() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    2. move() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    3. is_ghost_in_range() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    4. consume() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
  - Ghost Class
    1. get_valid_moves() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    2. move() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    3. is_pacman_in_range() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    4. attack()
  - Map Class
    1. move() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    2. getLoc() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    3. attack() - DESCRIPTION HERE:
      - Implementation: DESCRIPTION HERE
      - Tests: DESCRIPTION HERE
    5. eatCookie() - Function that returns the Cookie Component if it got eaten by PacMan, otherwise it returns null.:
      - Implementation: Stores the location, token of the pacman given. Checks to see if components variable contains that token (has an existing key) and if so, will check if a component at that token has a cookie. If that is also true, locations, components, and field variables are updated to remove the cookie, and the cookie that was eated (removed) is returned. Otherwise null is returned. 
      - Tests: A test for if a cookie and pacman are at the same location, and a test for if a cookie and pacman are not in the same location.


