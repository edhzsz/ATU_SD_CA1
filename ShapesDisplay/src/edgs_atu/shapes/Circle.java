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
     * Writes the extra properties particular for each shape to a String buffer
     * to write to the console as part of the method drawShapeConsole.
     * @param sb StringBuffer to write to.
     */
    @Override
    protected void drawExtraPropertiesToConsole(StringBuffer sb) {
        sb.append("; radius: ");
        sb.append(radius);
    }

    /**
     * Draws a filled shape on the provided <code>Graphics</code> object.
     *
     * @param g The <code>Graphics</code> object to draw to.
     */
    @Override
    protected void drawFilledShape(Graphics g) {
        int diameter = 2 * radius;
        g.fillOval(xCenter - radius, yCenter - radius,  diameter, diameter);
    }

    /**
     * Draws a non-filled shape on the provided <code>Graphics</code> object.
     *
     * @param g The <code>Graphics</code> object to draw to.
     */
    @Override
    protected void drawShape(Graphics g) {
        int diameter = 2 * radius;
        g.drawOval(xCenter - radius, yCenter - radius, diameter, diameter);
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
        Point topRight = new Point(xCenter - radius, yCenter - radius);
        Point bottomLeft = new Point(xCenter + radius, yCenter + radius);

        return new BoundingBox(bottomLeft, topRight);
    }
}
