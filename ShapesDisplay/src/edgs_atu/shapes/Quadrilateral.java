package edgs_atu.shapes;

import java.awt.*;

/**
 * A quadrilateral shape.
 *
 * This shape is defined by 4 points in a plane.
 * This shape can be rotated around the center point.
 */
public class Quadrilateral extends Shape implements Rotatable {

    /**
     * The points that define the quadrilateral.
     * It will always have length 4.
     */
    private Point[] points;

    /**
     * Creates a new Quadrilateral with the provided arguments.
     * @param color Color of the quadrilateral.
     * @param xCenter X coordinate, in pixels, of the center of the quadrilateral.
     * @param yCenter Y coordinate, in pixels, of the center of the quadrilateral.
     * @param points The points that define the quadrilateral.
     * @param filled whether the rectangle is filled.
     */
    public Quadrilateral(Color color, int xCenter, int yCenter, Point[] points, boolean filled) {
        super(color, xCenter, yCenter, filled);

        this.points = points;
    }

    public Quadrilateral(Rectangle rect) {
        super(rect.getColor(), rect.getXCenter(), rect.getYCenter(), rect.isFilled());

        // Calculate the points here
        points = new Point[4];
    }


    /**
     * Rotates the quadrilateral by 90 degrees around the center point.
     */
    @Override
    public void rotateNinetyDegrees() {

    }

    /**
     * Writes the extra properties particular for each shape to a String buffer
     * to write to the console as part of the method drawShapeConsole.
     * @param sb StringBuffer to write to.
     */
    @Override
    protected void drawExtraPropertiesToConsole(StringBuffer sb) {
        sb.append("; points [: ");
        for(Point p:points) {
            sb.append(p);
        }
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
        return "Quadrilateral";
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
