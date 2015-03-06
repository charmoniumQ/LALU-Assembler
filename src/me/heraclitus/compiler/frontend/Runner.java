package me.heraclitus.compiler.frontend;

import java.awt.*;

/**
 * Created by sam on 3/6/15.
 */
public class Runner {


    public static void main(String[] args) {
        if (args.length == 0) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        LogicWindow window = new LogicWindow();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } else {
            CompilerRunner.run();
        }
    }
}
