package edgs_atu.display;

import edgs_atu.shapes.ShapesManager;

import javax.swing.*;
import java.awt.*;

/**
 * We can think of a JFrame as a window
 * By extending (inheriting from) the class javax.swing.JFrame we can
 * define what goes into our window - in this case a single JPanel which is
 * a component container for GUI elements.
 */
public class CustomWindow extends JFrame {

    /**
     * Main panel in which the shapes will be rendered.
     */
    private CustomPanel mainPanel;

    /**
     * Creates a new instance of this class with a panel that will render
     * the shapes in the provided shape manager.
     *
     * @param manager Shapes manager that contains the <code>Shape</code>s
     *               that will be rendered into the screen
     */
    public CustomWindow(ShapesManager manager)
    {
        mainPanel = new CustomPanel(manager);

        //add our new panel to the frame
        add(mainPanel, BorderLayout.CENTER);

        //set the dimensions of the frame/window
        setSize(Consts.FRAME_WIDTH, Consts.FRAME_HEIGHT);
    }

}
