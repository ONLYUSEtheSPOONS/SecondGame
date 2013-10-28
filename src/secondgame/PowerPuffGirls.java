/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secondgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author doughill
 */
public class PowerPuffGirls {

    private Point position = new Point(100, 100);
//    private Dimension size = new Dimension(200, 200);
    private Dimension size = new Dimension(200, 300);

    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.fillRect(position.x + size.width * -80 / 100, position.y + (size.height * -80 / 100), size.width * 400 / 44, size.height * 400 / 44);
//      four corners
        graphics.drawOval(position.x, position.y, 3, 3);
        graphics.drawOval(position.x + size.width, position.y, 3, 3);
        graphics.drawOval(position.x + size.width, position.y + size.height, 3, 3);
        graphics.drawOval(position.x, position.y + size.height, 3, 3);
        graphics.setColor(Color.BLACK);
        graphics.fillArc(position.x + size.width * 16 / 100, position.y + (size.height * -22 / 100), size.width * 90 / 100, +size.height * 70 / 100, 180, 180);
        graphics.fillArc(position.x + size.width * -6 / 100, position.y + (size.height * -22 / 100), size.width * 90 / 100, +size.height * 70 / 100, 180, 180);
//      graphics.setColor(Color.RED);
//      graphics.fillOval(position.x + size.width * 95 / 100, position.y + (size.height * 10 / 100), size.width * 10 / 100, + size.height * 5 / 100);
//      Hands
        graphics.drawOval(position.x + size.width * 64 / 100, position.y + (size.height * 55 / 100), size.width * 5 / 44, size.height * 5 / 44);
        graphics.drawOval(position.x + size.width * 27 / 100, position.y + (size.height * 55 / 100), size.width * 5 / 44, size.height * 5 / 44);
        graphics.setColor(new Color(255, 221, 207));
        graphics.fillOval(position.x + size.width * 64 / 100, position.y + (size.height * 55 / 100), size.width * 5 / 44, size.height * 5 / 44);
        graphics.fillOval(position.x + size.width * 27 / 100, position.y + (size.height * 55 / 100), size.width * 5 / 44, size.height * 5 / 44);
//      Feet
        graphics.setColor(Color.BLACK);
        graphics.fillArc(position.x + size.width * 50 / 100, position.y + (size.height * 83 / 100), size.width * 27 / 150, size.height * 19 / 100, 180, 180);
        graphics.fillArc(position.x + size.width * 67 / 200, position.y + (size.height * 83 / 100), size.width * 27 / 150, size.height * 19 / 100, 180, 180);
//      socks
        graphics.setColor(Color.WHITE);
        graphics.fillArc(position.x + size.width * 52 / 100, (int) (position.y + (size.height * 0.9)), (int) (size.width * 0.13), (int) (size.height * 0.09), 180, 180);
        graphics.fillArc(position.x + size.width * 71 / 200, (int) (position.y + (size.height * 0.9)), (int) (size.width * 0.13), (int) (size.height * 0.09), 180, 180);
//      Legs
        graphics.setColor(Color.BLACK);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(position.x + size.width * 51 / 100, position.y + (size.height * 73 / 100), size.width * 25 / 150, size.height * 20 / 100);
        graphics.fillRect(position.x + size.width * 34 / 100, position.y + (size.height * 73 / 100), size.width * 25 / 150, size.height * 20 / 100);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(position.x + size.width * 51 / 100, position.y + (size.height * 73 / 100), size.width * 25 / 150, size.height * 20 / 100);
        graphics.drawRect(position.x + size.width * 34 / 100, position.y + (size.height * 73 / 100), size.width * 25 / 150, size.height * 20 / 100);
//      Mid section
        graphics.setColor(new Color(0, 205, 102));
        graphics.fillRect(position.x + size.width * 34 / 100, position.y + (size.height * 45 / 100), size.width * 15 / 44, size.height * 15 / 44);
//      face
        graphics.setColor(new Color(255, 221, 207));
        graphics.fillOval(position.x, position.y, size.width, (size.height / 2));
//      eyes
        graphics.setColor(Color.WHITE);
        graphics.fillOval(position.x, position.y + (size.height * 1 / 10), (size.width * 9 / 20), (size.width * 9 / 20));
        graphics.fillOval(position.x + size.width * 11 / 20, position.y + (size.height * 1 / 10), (size.width * 9 / 20), (size.width * 9 / 20));
//      lime stuff eyes
        graphics.setColor(new Color(0, 205, 102));
        graphics.fillOval(position.x + size.width / 23, position.y + (size.height * 1 / 9), (size.width * 9 / 22), (size.width * 9 / 22));
        graphics.fillOval(position.x + size.width * 13 / 22, position.y + (size.height * 1 / 9), (size.width * 9 / 22), (size.width * 9 / 22));
//      pupuls
        graphics.setColor(Color.BLACK);
        graphics.fillOval(position.x + size.width * 8 / 100, position.y + (size.height * 12 / 100), (size.width * 16 / 44), (size.width * 16 / 44));
        graphics.fillOval(position.x + size.width * 63 / 100, position.y + (size.height * 12 / 100), (size.width * 16 / 44), (size.width * 16 / 44));
//      white eye reflection
        graphics.setColor(Color.WHITE);
        graphics.fillOval(position.x + size.width * 24 / 100, position.y + (size.height * 15 / 100), (size.width * 7 / 44), (size.width * 7 / 44));
        graphics.fillOval(position.x + size.width * 8 / 10, position.y + (size.height * 15 / 100), (size.width * 7 / 44), (size.width * 7 / 44));
        graphics.setColor(Color.BLACK);
//      smile
        graphics.setColor(Color.BLACK);
        graphics.drawArc(position.x + size.width * 43 / 100, position.y + (size.height * 33 / 100), (size.width * 7 / 44), size.width * 7 / 44, 180, 180);
//      Belt
        graphics.setColor(Color.BLACK);
        graphics.fillRect(position.x + size.width * 34 / 100, position.y + (size.height * 55 / 100), size.width * 15 / 44, size.height * 5 / 44);
//      Hair
        graphics.setColor(Color.BLACK);
        graphics.fillArc(position.x + size.width * 5 / 100, position.y + (size.height * 0 / 100), size.width * 90 / 100, size.height * 30 / 100, 360, 180);
//      triangle split
        graphics.setColor(new Color(255, 221, 207));
        int[] xPoints = {position.x + size.width * 16 / 32, position.x + size.width * 18 / 32, position.x + size.width * 14 / 32};
        int[] yPoints = {position.y + size.height * 2 / 32, position.y + size.height * 5 / 32, position.y + size.height * 5 / 32};
        graphics.fillPolygon(xPoints, yPoints, 3);



//        graphics.setColor(new Color(255, 221, 207));
//        graphics.fillOval(position.x + 190, position.y - 60, size.width + 40, size.height);
//        graphics.setColor(Color.WHITE);
//        graphics.fillOval(position.x + 190, position.y - 20, size.width - 100, size.height - 100);
//        graphics.fillOval(position.x + 330, position.y - 20, size.width - 100, size.height - 100);
//        graphics.fillOval(position.x + 190, position.y - 20, size.width - 200, size.height - 150);
//        graphics.setColor(new Color(255, 145, 164));
//        graphics.fillOval(position.x + 198, position.y - 17, size.width - 109, size.height - 109);
//        graphics.fillOval(position.x + 337, position.y - 18, size.width - 107, size.height - 107);
//        graphics.setColor(Color.BLACK);
//        graphics.fillOval(position.x + 218, position.y - 15, size.width - 130, size.height - 130);
//        graphics.fillOval(position.x + 358, position.y - 15, size.width - 130, size.height - 130);


    }
}
