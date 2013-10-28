/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secondgame;

import environment.ApplicationStarter;

/**
 *
 * @author doughill
 */
public class SecondGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        ApplicationStarter.run("Power Puff Girls", new SecondGameEnvironment());
    }
    
}
