package org.example;

public class Compass {
    public enum Point {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }
    public enum Direction {
        LEFT,
        RIGHT
    }
    String point = String.valueOf(Point.NORTH);
    public String rotate(String point, String direction) {

        if (point.equalsIgnoreCase(Point.NORTH.toString()) && direction.equalsIgnoreCase(Direction.RIGHT.toString())) {
            return Point.EAST.toString();
        } else if (point.equalsIgnoreCase(Point.EAST.toString()) && direction.equalsIgnoreCase(Direction.RIGHT.toString())) {
            return Point.SOUTH.toString();
        } else if (point.equalsIgnoreCase(Point.SOUTH.toString()) && direction.equalsIgnoreCase(Direction.RIGHT.toString())) {
            return Point.WEST.toString();
        } else if (point.equalsIgnoreCase(Point.WEST.toString()) && direction.equalsIgnoreCase(Direction.RIGHT.toString())) {
            return Point.NORTH.toString();

        }
        return null;
    }
}
