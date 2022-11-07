package edgs_atu.display;

import edgs_atu.shapes.Point;
import edgs_atu.shapes.ShapesManager;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * This allows us to create a panel which we can add to a frame/window
 * Oftentimes, you would then add standard GUI components, e.g. JButton, JLabel, to the
 * panel.
 * In our case, though, we will want to draw shapes, so we override the paintComponent() method
 * that we inherit from the javax.swing.JPanel class.
 * The graphics system passes us a java.awt.Graphics object and this has methods which allows us
 * to draw shapes.
 */
public class CustomPanel extends JPanel {
    /**
     * Shapes manager that contains the shapes that will be rendered into the screen.
     */
    private ShapesManager manager;

    /**
     * Creates a new instance of this class with a provided shape manager.
     *
     * @param manager Shapes manager that contains the <code>Shape</code>s
     *               that will be rendered into the screen
     */
    public CustomPanel(ShapesManager manager) {
        this.manager = manager;
        // Make a closure over the current panel to be able to repaint on mouse clicks
        JPanel panel = this;

        addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                Point click = new Point(e.getX(), e.getY());
                int button = e.getButton();

                manager.handleClick(click, button);
                panel.repaint();
            }
        });
    }


    /**
     * Renders the shapes to the screen.
     *
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        // The superclass does some important work in the method we've overridden, so we
        // should invoke it.
        super.paintComponent(g);

        // ask the shapes manager to draw all shapes
        manager.drawShapes(g);
    }

}
