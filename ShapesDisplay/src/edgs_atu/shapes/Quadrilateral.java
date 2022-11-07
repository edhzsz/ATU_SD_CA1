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


    /**
     * Rotates the quadrilateral by 90 degrees around the center point.
     */
    @Override
    public void rotateNinetyDegrees() {

    }

    /**
     * Draws a shape on the provided <code>Graphics</code> object.
     *
     * @param g                  The <code>Graphics</code> object to draw to.
     * @param displayName        whether the name of the shapes should be displayed.
     * @param displayBoundingBox whether the bounding box of the shapes should be displayed.
     */
    @Override
    public void drawShape(Graphics g, boolean displayName, boolean displayBoundingBox) {

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
}
