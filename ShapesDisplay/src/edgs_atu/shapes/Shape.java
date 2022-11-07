package edgs_atu.shapes;

import java.awt.*;

/**
 * Represents a shape.
 *
 * <code>Shape</code> is an abstract class that contains properties and functionality
 * common to all shapes that are supported in this package.
 *
 * Being an abstract class, it cannot be directly instantiated.
 */
public abstract class Shape {
    /**
     * Color of the shape.
     *
     * If the shape is not <code>filled</code>, only the perimeter will be drawn using this color.
     */
    protected Color color;

    /**
     * Indicates whether the shape is filled.
     */
    protected boolean filled;

    /**
     * X coordinate, in pixels, of the center of the shape.
     */
    protected int xCenter;

    /**
     * Y coordinate, in pixels, of the center of the shape.
     */
    protected int yCenter;

    /**
     * The bounding box of the shape.
     */
    protected BoundingBox boundingBox;

    /**
     * Creates a new shape with the provided arguments
     * @param color Color of the shape
     * @param xCenter X coordinate, in pixels, of the center of the shape.
     * @param yCenter Y coordinate, in pixels, of the center of the shape.
     */
    protected Shape(Color color, int xCenter, int yCenter) {
        this(color, xCenter, yCenter,false);
    }

    /**
     * Creates a new shape with the provided arguments
     * @param color Color of the shape
     * @param xCenter X coordinate, in pixels, of the center of the shape.
     * @param yCenter Y coordinate, in pixels, of the center of the shape.
     * @param filled whether the shape is filled.
     */
    protected Shape(Color color, int xCenter, int yCenter, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.boundingBox = createBoundingBox();
    }

    /**
     * Draws a shape on the provided <code>Graphics</code> object.
     * @param g The <code>Graphics</code> object to draw to.
     * @param displayName whether the name of the shapes should be displayed.
     * @param displayBoundingBox whether the bounding box of the shapes should be displayed.
     */
    public void drawShape(Graphics g, boolean displayName, boolean displayBoundingBox) {
        if(filled) {
            drawFilledShape(g);
        } else {
            drawShape(g);
        }

        if(displayName) {
            String name = getShapeName();
            g.drawString(name, xCenter, yCenter);
        }

        if(displayBoundingBox) {
            boundingBox.draw(g);
        }
    }

    /**
     * Draws a shape to console
     * @param displayName whether the name of the shapes should be displayed.
     * @param displayBoundingBox whether the bounding box of the shapes should be displayed.
     */
    public abstract void drawShapeConsole(boolean displayName, boolean displayBoundingBox);

    /**
     * Draws a filled shape on the provided <code>Graphics</code> object.
     * @param g The <code>Graphics</code> object to draw to.
     */
    protected abstract void drawFilledShape(Graphics g);

    /**
     * Draws a non-filled shape on the provided <code>Graphics</code> object.
     * @param g The <code>Graphics</code> object to draw to.
     */
    protected abstract void drawShape(Graphics g);

    /**
     * Returns the name of this shape.
     * @return the name of the shape.
     */
    protected abstract String getShapeName();

    /**
     * Creates the bounding box of the shape.
     * @return the bounding box of the shape.
     */
    protected abstract BoundingBox createBoundingBox();

    /**
     * Color of the shape.
     * @return the color of the shape.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the Color of the shape.
     * @param color the Color of the shape.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Indicates whether the shape is filled.
     * @return Indicates whether the shape is filled.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Sets whether the shape is filled.
     * @param filled a boolean that indicates whether the shape is filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * X coordinate, in pixels, of the center of the shape.
     * @return X coordinate, in pixels, of the center of the shape.
     */
    public int getXCenter() {
        return xCenter;
    }

    /**
     * Sets the X coordinate, in pixels, of the center of the shape.
     * @param xCenter the X coordinate, in pixels, of the center of the shape.
     */
    public void setXCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    /**
     * Y coordinate, in pixels, of the center of the shape.
     * @return Y coordinate, in pixels, of the center of the shape.
     */
    public int getYCenter() {
        return yCenter;
    }

    /**
     * Sets the Y coordinate, in pixels, of the center of the shape.
     * @param yCenter the Y coordinate, in pixels, of the center of the shape.
     */
    public void setYCenter(int yCenter) {
        this.yCenter = yCenter;
    }
}
