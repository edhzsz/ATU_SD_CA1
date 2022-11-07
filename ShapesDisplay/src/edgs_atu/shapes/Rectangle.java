package edgs_atu.shapes;

import java.awt.*;

/**
 * A rectangle.
 *
 * Rectangles can be moved.
 */
public class Rectangle extends Shape implements Moveable {
    /**
     * The with of this rectangle.
     */
    protected int width;

    /**
     * The height of this rectangle
     */
    protected int height;

    /**
     * Creates a new Rectangle with the provided arguments.
     * @param color Color of the rectangle.
     * @param xCenter X coordinate, in pixels, of the center of the rectangle.
     * @param yCenter Y coordinate, in pixels, of the center of the rectangle.
     * @param width the with of this rectangle.
     * @param height the height of this rectangle.
     */
    public Rectangle(Color color, int xCenter, int yCenter, int width, int height) {
        super(color, xCenter, yCenter);

        this.height = height;
        this.width = width;
    }

    /**
     * Creates a new Rectangle with the provided arguments.
     * @param color Color of the rectangle.
     * @param xCenter X coordinate, in pixels, of the center of the rectangle.
     * @param yCenter Y coordinate, in pixels, of the center of the rectangle.
     * @param width the with of this rectangle.
     * @param height the height of this rectangle.
     * @param filled whether the rectangle is filled.
     */
    public Rectangle(Color color, int xCenter, int yCenter, int width, int height, boolean filled) {
        super(color, xCenter, yCenter, filled);

        this.height = height;
        this.width = width;
    }

    /**
     * Moves the rectangle by 10 pixels in the X axis.
     */
    @Override
    public void moveTenUnits() {

    }

    /**
     * Draws a rectangle to console
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
        return "Rectangle";
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

