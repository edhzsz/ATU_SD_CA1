package edgs_atu.shapes;

/**
 * Represents a point
 */
public class Point {
    /**
     * The x coordinate of the point.
     */
    private int x;

    /**
     * The y coordinate of the point.
     */
    private int y;

    /**
     * Creates a new point
     * @param x the x coordinate of the point.
     * @param y the y coordinate of the point.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The x coordinate of the point.
     * @return the x coordinate of the point.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x coordinate of the point.
     * @param x the x coordinate of the point.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * The y coordinate of the point.
     * @return the y coordinate of the point.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y coordinate of the point.
     * @param y The y coordinate of the point.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return the string representation of the object.
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("(");
        sb.append(x);
        sb.append(",");
        sb.append(y);
        sb.append(")");
        return sb.toString();
    }
}
