package edgs_atu.shapes;

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
     * Rotates the quadrilateral by 90 degrees around the center point.
     */
    @Override
    public void rotateNinetyDegrees() {

    }
}
