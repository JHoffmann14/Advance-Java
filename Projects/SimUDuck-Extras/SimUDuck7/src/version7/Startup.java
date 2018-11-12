package version7;

import javax.swing.UIManager;

/**
 * This is the startup class that you should use with this version (7).
 * It starts a GUI that you can use to change fly and quack behaviors
 * at runtime.
 * 
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
                // Set System Look & Feel to whatever the O/S uses....
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
                // do nothing, this can safely be ignored because
                // it will fall back to the basic metal L&F if something
                // goes wrong.
        }
        
        // This is an advanced multithreading technique that Adv. Java
        // student will learn about later.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // start the GUI
                new MainGUI().setVisible(true);
            }
        });
    }

}
