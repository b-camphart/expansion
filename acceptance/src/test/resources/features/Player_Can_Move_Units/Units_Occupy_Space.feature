Feature: Units Occupy Space

  Background:
    Given a flat, 30 by 30 map
      And a unit is in the center of the map
      And the unit has a maximum allowed distance of 10
      And the unit has a diameter of 1
      And another friendly unit is a distance of 5 at 45 degrees from the center of the map
      And the other friendly unit has a diameter of 1

  Scenario: Can't move to a space already occupied
    When the player moves the unit a distance of 5 at 45 degrees
    Then a "SPACE ALREADY OCCUPIED" message should be given
     And the unit should not have been moved from the center of the map

  Scenario: Can't move to a space intersecting another unit's occupied space
    When the player moves the unit a distance of 4.1 at 45 degrees
    Then a "SPACE ALREADY OCCUPIED" message should be given
     And the unit should not have been moved from the center of the map

  Scenario: Can move to space that is adjacent to another unit
    When the player moves the unit a distance of 4 at 45 degrees
    Then the unit should be a distance of 4 at 45 degrees from the center of the map

  Scenario: Can move to space beyond another unit by passing through
    When the player moves the unit a distance of 6 at 45 degrees
    Then the unit should be a distance of 6 at 45 degrees from the center of the map


