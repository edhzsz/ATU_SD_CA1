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
     * @param center the center of the quadrilateral.
     * @param p1 A point that defines the quadrilateral.
     * @param p2 A point that defines the quadrilateral.
     * @param p3 A point that defines the quadrilateral.
     * @param p4 A point that defines the quadrilateral.
     */
    public Quadrilateral(Color color, Point center, Point p1, Point p2, Point p3, Point p4) {
        this(color, center, new Point[]{p1, p2, p3, p4}, false);
    }

    /**
     * Creates a new Quadrilateral with the provided arguments.
     * @param color Color of the quadrilateral.
     * @param center the center of the quadrilateral.
     * @param p1 A point that defines the quadrilateral.
     * @param p2 A point that defines the quadrilateral.
     * @param p3 A point that defines the quadrilateral.
     * @param p4 A point that defines the quadrilateral.
     * @param filled whether the rectangle is filled.
     */
    public Quadrilateral(Color color, Point center, Point p1, Point p2, Point p3, Point p4, boolean filled) {
        this(color, center, new Point[]{p1, p2, p3, p4}, filled);
    }

    /**
     * Creates a new Quadrilateral with the provided arguments.
     * @param color Color of the quadrilateral.
     * @param center the center of the quadrilateral.
     * @param points The points that define the quadrilateral.
     * @param filled whether the rectangle is filled.
     */
    public Quadrilateral(Color color, Point center, Point[] points, boolean filled) {
        super(color, center.getX(), center.getY(), filled);

        this.points = points;
    }

    /**
     * Creates a new quadrilateral that covers the provided <code>Rectangle</code>
     * @param rect the rectangle that defines the quadrilateral.
     */
    public Quadrilateral(Rectangle rect) {
        super(rect.getColor(), rect.getXCenter(), rect.getYCenter(), rect.isFilled());

        // The rectangle bounding box points are the corners of the rectangle
        BoundingBox bb = rect.getBoundingBox();
        Point topRight = bb.getTopRight();
        Point bottomLeft = bb.getBottomLeft();
        Point topLeft = new Point(bottomLeft.getX(), topRight.getY());
        Point bottomRight = new Point(topRight.getX(), bottomLeft.getY());

        points = new Point[]{ topRight, topLeft, bottomLeft, bottomRight };
    }

    /**
     * Rotates the quadrilateral by 90 degrees around the center point.
     */
    @Override
    public void rotateNinetyDegrees() {
        double angleInRadians = Math.toRadians(90);
        Point ctr = new Point(xCenter, yCenter);

        for(int i=0; i<4; i++) {
            points[i] = rotateAround(ctr, points[i], angleInRadians);
        }
    }

    private Point rotateAround(Point ctr, Point p, double rads) {
        Point translated = new Point(p.getX() - ctr.getX(), p.getY() - ctr.getY());
        Point rot = rotate(translated, rads);

        return new Point(rot.getX() + ctr.getX(), rot.getY() + ctr.getY());
    }

    private Point rotate(Point p, double rads) {
        int x = p.getX();
        int y = p.getY();
        double sinTheta = Math.sin(rads);
        double cosTheta = Math.cos(rads);

        double xp = x * cosTheta - y * sinTheta;
        double yp = x * sinTheta + y * cosTheta;

        return new Point((int)xp, (int)yp);
    }

    /**
     * Writes the extra properties particular for each shape to a String buffer
     * to write to the console as part of the method drawShapeConsole.
     * @param sb StringBuffer to write to.
     */
    @Override
    protected void drawExtraPropertiesToConsole(StringBuffer sb) {
        sb.append("; points: [");
        for(Point p:points) {
            sb.append(p);
            sb.append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
    }

    /**
     * Draws a filled shape on the provided <code>Graphics</code> object.
     *
     * @param g The <code>Graphics</code> object to draw to.
     */
    @Override
    protected void drawFilledShape(Graphics g) {
        int[] xPoints = new int[4];
        int[] yPoints = new int[4];

        for(int i = 0; i<4; i++) {
            xPoints[i] = points[i].getX();
            yPoints[i] = points[i].getY();
        }

        g.fillPolygon(xPoints, yPoints, 4);
    }

    /**
     * Draws a non-filled shape on the provided <code>Graphics</code> object.
     *
     * @param g The <code>Graphics</code> object to draw to.
     */
    @Override
    protected void drawShape(Graphics g) {
        int[] xPoints = new int[4];
        int[] yPoints = new int[4];

        for(int i = 0; i<4; i++) {
            xPoints[i] = points[i].getX();
            yPoints[i] = points[i].getY();
        }

        g.drawPolygon(xPoints, yPoints, 4);
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
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for(Point p: points) {
            minX = Math.min(minX, p.getX());
            maxX = Math.max(maxX, p.getX());
            minY = Math.min(minY, p.getY());
            maxY = Math.max(maxY, p.getY());
        }

        Point topRight = new Point(minX, minY);
        Point bottomLeft = new Point(maxX, maxY);

        return new BoundingBox(bottomLeft, topRight);
    }
}
