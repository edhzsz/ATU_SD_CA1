package edgs_atu.shapes;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * Manager of the shapes that will be displayed.
 * Only shapes in this manager will be displayed.
 */
public class ShapesManager {
    /**
     * Indicates whether the bounding box of the shapes should be displayed.
     */
    private boolean displayBoundingBox;

    /**
     * Indicates whether the name of the shapes should be displayed.
     */
    private boolean displayName;

    /**
     * List of shapes managed by this manager
     */
    private List<Shape> shapes;

    /**
     * Creates a new ShapesManager with an empty list of shapes.
     */
    public ShapesManager() {
        shapes = new ArrayList<>();
    }

    /**
     * Indicates whether the bounding box of the shapes should be displayed.
     * @return whether the bounding box of the shapes should be displayed.
     */
    public boolean isDisplayBoundingBox() {
        return displayBoundingBox;
    }

    /**
     * Sets whether the bounding box of the shapes should be displayed.
     * @param displayBoundingBox a boolean that indicates whether the
     *                          bounding box of the shapes should be displayed.
     */
    public void setDisplayBoundingBox(boolean displayBoundingBox) {
        this.displayBoundingBox = displayBoundingBox;
    }

    /**
     * Indicates whether the name of the shapes should be displayed.
     * @return whether the name of the shapes should be displayed.
     */
    public boolean isDisplayName() {
        return displayName;
    }

    /**
     * Sets whether the name of the shapes should be displayed.
     * @param displayName a boolean that indicates whether the
     *                   name of the shapes should be displayed.
     */
    public void setDisplayName(boolean displayName) {
        this.displayName = displayName;
    }

    /**
     * Adds a new <code>Shape</code> to be managed.
     * @param shape the new <code>Shape</code> to be managed
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Draws the shapes managed by this instance.
     * @param g The <code>Graphics</code> object to draw to.
     */
    public void drawShapes(Graphics g) {
        for(Shape shape:shapes) {
            shape.drawShape(g, displayName, displayBoundingBox);
            shape.drawShapeConsole(displayBoundingBox);
        }
    }

    /**
     * Handles a click on a specific pixel represented by the Point p.
     * If the point is in bounds of any shape the shape will be updated.
     * If the button pressed is the left button, the filled property
     * of the shape will be toggled.
     * If the button pressed is the right button, and the shape is Moveable,
     * the moveTenUnits method will be invoked.
     * If the button pressed is the right button, and the shape is Rotatable,
     *      * the rotateNinetyDegrees method will be invoked.
     * @param p point in which the click occurred.
     * @param button which button was pressed.
     *               1 means left button
     *               2 means center button
     *               3 means right button
     */
    public void handleClick(Point p, int button) {
        for(Shape s: shapes) {
            if(s.inBounds(p)) {
                if(button == 1) {
                    s.setFilled(!s.isFilled());
                } else if(button == 3) {
                    if(s instanceof Moveable) {
                        ((Moveable)s).moveTenUnits();
                    }
                    if(s instanceof Rotatable) {
                        ((Rotatable)s).rotateNinetyDegrees();
                    }
                }
            }
        }
    }
}
