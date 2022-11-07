package edgs_atu.shapes;

import java.awt.*;

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
     * Y coordinate, in pixels, of the center of the shape.
     */
    private int yCenter;

    /**
     * Creates a new shape with the provided arguments
     * @param color Color of the shape
     * @param xCenter X coordinate, in pixels, of the center of the shape.
     * @param yCenter Y coordinate, in pixels, of the center of the shape.
     */
    protected Shape(Color color, int xCenter, int yCenter) {
        this(color, xCenter, yCenter,false);
    }

    /**
     * Creates a new shape with the provided arguments
     * @param color Color of the shape
     * @param xCenter X coordinate, in pixels, of the center of the shape.
     * @param yCenter Y coordinate, in pixels, of the center of the shape.
     * @param filled whether the shape is filled.
     */
    protected Shape(Color color, int xCenter, int yCenter, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    /**
     * Draws a shape on the provided <code>Graphics</code> object.
     * @param g The <code>Graphics</code> object to draw to.
     * @param displayName whether the name of the shapes should be displayed.
     * @param displayBoundingBox whether the bounding box of the shapes should be displayed.
     */
    public abstract void drawShape(Graphics g, boolean displayName, boolean displayBoundingBox);

    /**
     * Draws a shape to console
     * @param displayName whether the name of the shapes should be displayed.
     * @param displayBoundingBox whether the bounding box of the shapes should be displayed.
     */
    public abstract void drawShapeConsole(boolean displayName, boolean displayBoundingBox);
}
