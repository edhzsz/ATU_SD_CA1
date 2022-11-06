package edgs_atu.shapes;

import java.awt.Color;

/**
 * Represents a shape.
 *
 * <code>Shape</code> is an abstract class that contains properties and functionality
 * common to all shapes that are supported in this package.
 *
 * Being an abstract class, it cannot be directly instantiated.
 */
public abstract class Shape {
    /**
     * Color of the shape.
     *
     * If the shape is not <code>filled</code>, only the perimeter will be drawn using this color.
     */
    private Color color;

    /**
     * Indicates whether the shape is filled.
     */
    private boolean filled;

    /**
     * X coordinate, in pixels, of the center of the shape.
     */
    private int xCenter;

    /**
     * X coordinate, in pixels, of the center of the shape.
     */
    private int yCenter;
}
