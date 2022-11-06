package edgs_atu.display;

import edgs_atu.shapes.ShapesManager;

import javax.swing.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();

        /*
        shapesManager.setDisplayName(true);
        shapesManager.setDisplayBoundingBox(false);
        shapesManager.addShape(new Circle(Color.green, 300,80, 50));
        Rectangle rect = new Rectangle(Color.blue, 50,120, true,50, 80);
        shapesManager.addShape(rect);
        //Note: I don't display this rectangle - I merely use it to initialise a quadrilateral
        Rectangle rect2 = new Rectangle(Color.red, 140,180, 40, 30);
        Quadrilateral quad = new Quadrilateral(rect2);
        shapesManager.addShape(quad);
        */

        //Create and configure our JFrame (window)
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Test Window");
        customWindow.setVisible(true);
    }
}
