package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("return next Point when passed a previous-facing Point and Direction RIGHT.")
    void rotate() {
        //Arrange
        Compass compass = new Compass();
//        String point = Compass.Point.NORTH.toString();
        String direction = Compass.Direction.RIGHT.toString();
//        String expectedResult = Compass.Point.EAST.toString();

        //Act
//        String result = compass.rotate(point, direction);

        //Assert
//        assertEquals(expectedResult, result);
        assertAll("Testing Direction Right for all Points",
            () -> assertEquals(Compass.Point.EAST.toString(), compass.rotate(Compass.Point.NORTH.toString(), direction)),
            () -> assertEquals(Compass.Point.SOUTH.toString(), compass.rotate(Compass.Point.EAST.toString(), direction)),
            () -> assertEquals(Compass.Point.WEST.toString(), compass.rotate(Compass.Point.SOUTH.toString(), direction)),
            () -> assertEquals(Compass.Point.NORTH.toString(), compass.rotate(Compass.Point.WEST.toString(), direction))
        );

    }
}