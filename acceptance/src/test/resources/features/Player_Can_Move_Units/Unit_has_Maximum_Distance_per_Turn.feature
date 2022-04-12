Feature: Unit has Maximum Distance per Turn

  Background:
    Given a flat, 30 by 30 map
      And a unit is in the center of the map
      And the unit has a maximum allowed distance of 10

  Scenario Outline: Can't move too far
     When the player moves the unit a distance of 10.1 at <angle>
     Then a "TOO FAR" message should be given
      And the unit should not have been moved from the center of the map

    Examples:
      | angle       |
      | 0 degrees   |
      | 45 degrees  |
      | -30 degrees |
      | 90 degrees  |
      | 276 degrees |

  Scenario Outline: Can't incrementally move too far
     When the player moves the unit a distance of 4 at <angle>
      And the player moves the unit a distance of 3 at <angle>
      And the player moves the unit a distance of 2.1 at <angle>
     Then a "TOO FAR" message should be given
      And the unit should be a distance of 7 at <angle> from the center of the map

    Examples:
      | angle       |
      | 0 degrees   |
      | 45 degrees  |
      | -30 degrees |
      | 90 degrees  |
      | 276 degrees |

  Scenario Outline: Moving back and forth incrementally counts as moving
     When the player moves the unit a distance of 4 at <angle>
      And the player moves the unit a distance of 3 at negative <angle>
      And the player moves the unit a distance of 2.1 at <angle>
     Then a "TOO FAR" message should be given
      And the unit should be a distance of 1 at <angle> from the center of the map

    Examples:
      | angle       |
      | 0 degrees   |
      | 45 degrees  |
      | -30 degrees |
      | 90 degrees  |
      | 276 degrees |
