/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secondgame;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author doughill
 */
public class SecondGameEnvironment extends Environment {
    PowerPuffGirls myPowerPuffGirls;

    @Override
    public void initializeEnvironment() {
        myPowerPuffGirls = new PowerPuffGirls();
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        myPowerPuffGirls.draw(graphics);
 
    }
}
