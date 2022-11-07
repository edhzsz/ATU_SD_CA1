package edgs_atu.display;

import edgs_atu.shapes.*;
import edgs_atu.shapes.Point;
import edgs_atu.shapes.Rectangle;

import javax.swing.*;
import java.awt.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();

        shapesManager.setDisplayName(true);
        shapesManager.setDisplayBoundingBox(true);

        shapesManager.addShape(new Circle(Color.green, 300,80, 50));
        Rectangle rect = new Rectangle(Color.blue, 50,120,50, 80);
        shapesManager.addShape(rect);

        Square sq = new Square(Color.orange, 250,320, 50, true);
        shapesManager.addShape(sq);

        //Note: I don't display this rectangle - I merely use it to initialise a quadrilateral
        Rectangle rect2 = new Rectangle(Color.red, 140,180, 40, 30, true);
        Quadrilateral quad = new Quadrilateral(rect2);
        shapesManager.addShape(quad);

        Quadrilateral quad2 = new Quadrilateral(Color.CYAN,
                new Point(80, 80),
                new Point[] {
                        new Point(50, 50),
                        new Point(120, 70),
                        new Point(100, 120),
                        new Point(40, 90)
                    },
                true);
        shapesManager.addShape(quad2);

        //Create and configure our JFrame (window)
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Test Window");
        customWindow.setVisible(true);
    }
}
