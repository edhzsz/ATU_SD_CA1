package edgs_atu.shapes;

import java.awt.*;

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

    /**
     * The bottom left point of the rectangle that defines the bounding box.
     * @return the bottom left point of the rectangle that defines the bounding box.
     */
    public Point getBottomLeft() {
        return bottomLeft;
    }

    /**
     * Sets the bottom left point of the rectangle that defines the bounding box.
     * @param bottomLeft The bottom left point of the rectangle that defines the bounding box.
     */
    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    /**
     * The top right point of the rectangle that defines the bounding box.
     * @return the top right point of the rectangle that defines the bounding box.
     */
    public Point getTopRight() {
        return topRight;
    }

    /**
     * Sets the top right point of the rectangle that defines the bounding box.
     * @param topRight the top right point of the rectangle that defines the bounding box.
     */
    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    /**
     * Draws the Bounding box to the provided <code>Graphics</code> object.
     * @param g The <code>Graphics</code> object to draw to.
     */
    public void draw(Graphics g) {
        g.setColor(Color.darkGray);
        Graphics2D g2d = (Graphics2D) g;

        float[] dash1 = { 2f, 0f, 2f };
        BasicStroke bs1 = new BasicStroke(1,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND,
                1.0f,
                dash1,
                2f);
        g2d.setStroke(bs1);

        int width = bottomLeft.getX() - topRight.getX();
        int height = bottomLeft.getY() - topRight.getY();
        g2d.drawRect(topRight.getX(), topRight.getY(), width, height);
    }

    /**
     * Returns a string representation of the object.
     *
     * @return the string representation of the object.
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("{ ");
        sb.append("bottomLeft: ");
        sb.append(bottomLeft);
        sb.append("; topRight: ");
        sb.append(topRight);
        sb.append("; }");
        return sb.toString();
    }

    /**
     * Indicates whether the point is in between the bounds of this bounding box.
     * @param p point to validate if it is in bounds.
     * @return whether the point is in between the bounds of this bounding box.
     */
    public boolean inBounds(Point p) {
        int x = p.getX();
        int y = p.getY();

        return x >= topRight.getX() && x <= bottomLeft.getX() && y >= topRight.getY() && y <= bottomLeft.getY();
    }
}
