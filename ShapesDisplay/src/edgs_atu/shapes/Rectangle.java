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
        this(color, xCenter, yCenter, height, width, false);
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
     * Moves the rectangle by 10 pixels on both axis.
     */
    @Override
    public void moveTenUnits() {
        this.xCenter += 10;
        this.yCenter += 10;
        recreateBoundingBox();
    }

    /**
     * Writes the extra properties particular for each shape to a String buffer
     * to write to the console as part of the method drawShapeConsole.
     * @param sb StringBuffer to write to.
     */
    @Override
    protected void drawExtraPropertiesToConsole(StringBuffer sb) {
        sb.append("; width: ");
        sb.append(width);
        sb.append("; height: ");
        sb.append(height);
    }

    /**
     * Draws a filled shape on the provided <code>Graphics</code> object.
     *
     * @param g The <code>Graphics</code> object to draw to.
     */
    @Override
    protected void drawFilledShape(Graphics g) {
        Point topRight = buildTopRightPoint();
        g.fillRect(topRight.getX(), topRight.getY(), width, height);
    }

    /**
     * Draws a non-filled shape on the provided <code>Graphics</code> object.
     *
     * @param g The <code>Graphics</code> object to draw to.
     */
    @Override
    protected void drawShape(Graphics g) {
        Point topRight = buildTopRightPoint();
        g.drawRect(topRight.getX(), topRight.getY(), width, height);
    }

    protected Point buildTopRightPoint() {
        int halfWidth = width / 2;
        int halfHeight = height / 2;

        return new Point(xCenter - halfWidth, yCenter - halfHeight);
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
        Point topRight =  buildTopRightPoint();
        Point bottomLeft = new Point(topRight.getX() + width, topRight.getY() + height);

        return new BoundingBox(bottomLeft, topRight);
    }
}

