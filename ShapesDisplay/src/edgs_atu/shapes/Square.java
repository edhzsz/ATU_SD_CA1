package edgs_atu.shapes;

import java.awt.*;

/**
 * A square.
 *
 * Squares are rectangles that have their height equal to their width.
 * As this class inherits from Rectangle, then it can also be moved.
 */
public class Square extends Rectangle {
    /**
     * Creates a new Square not filled.
     *
     * @param color   Color of the square
     * @param xCenter X coordinate, in pixels, of the center of the square.
     * @param yCenter Y coordinate, in pixels, of the center of the square.
     * @param length  the length of each side of this square.
     */
    public Square(Color color, int xCenter, int yCenter, int length) {
        super(color, xCenter, yCenter, length, length);
    }

    /**
     * Creates a new Square with the provided arguments.
     *
     * @param color   Color of the square
     * @param xCenter X coordinate, in pixels, of the center of the square.
     * @param yCenter Y coordinate, in pixels, of the center of the square.
     * @param length  the length of each side of this square.
     * @param filled  whether the square is filled.
     */
    public Square(Color color, int xCenter, int yCenter, int length, boolean filled) {
        super(color, xCenter, yCenter, length, length, filled);
    }
}
