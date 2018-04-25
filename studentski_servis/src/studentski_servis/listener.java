/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentski_servis;

import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.WindowListener;

/**
 *
 * @author domenosojnik
 */
public class listener {
    private void initSelfListeners() {
    WindowListener taskStarterWindowListener = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent e) {
            //Perform task here. In this case, we are simulating a startup (only once) time-consuming task that would use a worker. 
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //Do nothing...Or something...You decide!
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //Do nothing...Or drink coffee...NVM; always drink coffee!
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //Do nothing...Or do EVERYTHING!
        }
        
     @Override
        public void windowDeiconified(WindowEvent e) {
            //Do nothing...Or break the law...
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //Do nothing...Procrastinate like me!
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //Do nothing...And please don't notice I have way too much free time today...
        }
    };

    //Here is where the magic happens! We make (a listener within) the frame start listening to the frame's own events!
    
}
    
}
