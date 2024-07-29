package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("return Point EAST when passed a NORTH-facing Point and Direction RIGHT.")
    void rotate() {
        //Arrange
        Compass compass = new Compass();
        String point = Compass.Point.NORTH.toString();
        String direction = Compass.Direction.RIGHT.toString();
        String expectedResult = Compass.Point.EAST.toString();

        //Act
        String result = compass.rotate(point, direction);


        //Assert
        assertEquals(expectedResult, result);

    }
}