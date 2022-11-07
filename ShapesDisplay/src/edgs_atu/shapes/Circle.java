package edgs_atu.shapes;

import java.awt.*;

/**
 * A circle.
 */
public class Circle extends Shape {

    /**
     * Radius, in pixels, of the circle.
     */
    private int radius;

    /**
     * Creates a new Circle with the provided arguments.
     * @param color Color of the circle.
     * @param xCenter X coordinate, in pixels, of the center of the circle.
     * @param yCenter Y coordinate, in pixels, of the center of the circle.
     * @param radius the with of this circle.
     *
     */
    public Circle(Color color, int xCenter, int yCenter, int radius) {
        super(color, xCenter, yCenter, false);

        this.radius = radius;
    }

    /**
     * Creates a new Circle with the provided arguments.
     * @param color Color of the circle.
     * @param xCenter X coordinate, in pixels, of the center of the circle.
     * @param yCenter Y coordinate, in pixels, of the center of the circle.
     * @param radius the radius, in pixels, of the circle.
     * @param filled whether the circle is filled.
     */
    public Circle(Color color, int xCenter, int yCenter, int radius, boolean filled) {
        super(color, xCenter, yCenter, filled);

        this.radius = radius;
    }

    /**
     * Draws a shape to console
     *
     * @param displayName        whether the name of the shapes should be displayed.
     * @param displayBoundingBox whether the bounding box of the shapes should be displayed.
     */
    @Override
    public void drawShapeConsole(boolean displayName, boolean displayBoundingBox) {

    }

    /**
     * Draws a filled shape on the provided <code>Graphics</code> object.
     *
     * @param g The <code>Graphics</code> object to draw to.
     */
    @Override
    protected void drawFilledShape(Graphics g) {

    }

    /**
     * Draws a non-filled shape on the provided <code>Graphics</code> object.
     *
     * @param g The <code>Graphics</code> object to draw to.
     */
    @Override
    protected void drawShape(Graphics g) {

    }

    /**
     * Returns the name of this shape.
     *
     * @return the name of the shape.
     */
    @Override
    protected String getShapeName() {
        return "Circle";
    }

    /**
     * Creates the bounding box of the shape.
     *
     * @return the bounding box of the shape.
     */
    @Override
    protected BoundingBox createBoundingBox() {
        return null;
    }
}
