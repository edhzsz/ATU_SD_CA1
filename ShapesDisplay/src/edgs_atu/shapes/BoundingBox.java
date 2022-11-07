package edgs_atu.shapes;

import java.awt.Graphics;

/**
 * The bounding box of a shape.
 *
 * The bounding box is the smallest imaginary rectangle that contains a shape.
 */
public class BoundingBox {

    /**
     * Bottom left point of the rectangle that defines the bounding box.
     */
    private Point bottomLeft;

    /**
     * Top right point of the rectangle that defines the bounding box.
     */
    private Point topRight;

    /**
     * Creates a new bounding box limited by the top left and bottom right arguments.
     * @param bottomLeft Bottom left point of the rectangle that defines the bounding box.
     * @param topRight Top right point of the rectangle that defines the bounding box.
     */
    public BoundingBox(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }


    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public void draw(Graphics g) {

    }
}
