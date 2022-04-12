Feature: Units do not Leave the Map

  Background:
    Given a flat, 30 by 30 map
    And a unit is in the center of the map

  Scenario Outline: Move anywhere on the map
    When the player moves the unit a distance of <distance> at <angle>
    Then the unit should be a distance of <distance> at <angle> from the center of the map

    Examples:
      | distance | angle       |
      | 15       | 0 degrees   |
      | 15       | 90 degrees  |
      | 15       | 180 degrees |
      | 15       | 270 degrees |
      | 21.2     | 45 degrees  |
      | 1        | 15 degrees  |
      | 4        | -63 degrees |
      | 13.2     | 356 degrees |
      | 3.6      | 200 degrees |

  Scenario Outline: Cannot leave the map
    When the player moves the unit a distance of <distance> at <angle>
    Then a "OUT OF BOUNDS" message should be given
    And the unit should not have been moved from the center of the map

    Examples:
      | distance | angle       |
      | 15.1     | 0 degrees   |
      | 15.1     | 90 degrees  |
      | 15.1     | 180 degrees |
      | 15.1     | 270 degrees |
      | 21.3     | 45 degrees  |

