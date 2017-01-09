package pl.edu.agh.kis;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Scanner;

/**
 * Created by Karl on 09.01.2017.
 */
public class Plot extends JPanel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj a: ");
        int a = scanner.nextInt();
        System.out.print("Podaj b: ");
        int b = scanner.nextInt();
        System.out.print("Podaj c: ");
        int c = scanner.nextInt();

        System.out.print("Podaj x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Podaj x2: ");
        int x2 = scanner.nextInt();

        QuadraticFunction function = new QuadraticFunction(a, b, c);
        int y1 = function.countValueInGivenArgument(x1);
        int y2 = function.countValueInGivenArgument(x2);


        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Plot());
        f.setSize(400, 400);
        f.setLocation(200, 200);
        f.setVisible(true);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;


        int h = getHeight();
        int w = getWidth();
        // Draw axeX.
        g2.draw(new Line2D.Double(0, h / 2, w, h / 2)); //to make axisX in the middle
        // Draw axeY.
        g2.draw(new Line2D.Double(w / 2, h, w / 2, 0));//to make axisY in the middle of the panel

        //line between P1(0,1) and P2(1,2) to draw function x+1
        //Point2D P1 = new Point2D.Double(w / 2, (h / 2) + UNIT);
        //Point2D P2 = new Point2D.Double((w / 2) + UNIT, (h / 2) + 2 * UNIT);  //considering 20 = 1 unit in your syste,
        //g2.draw(new Line2D.Double(P1, P2));
    }
}
