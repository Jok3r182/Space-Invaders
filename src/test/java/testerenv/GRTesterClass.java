package testerenv;

import spaceinvaders.engine.GameRules;
import spaceinvaders.engine.misc.KeybindingController;
import spaceinvaders.engine.misc.TimerController;
import spaceinvaders.resources.keybindings.keybindings.*;
import spaceinvaders.resources.scenes.levels.*;
import spaceinvaders.window.WindowLoader;

import javax.swing.*;


public class GRTesterClass {

    public TimerController timerController;

    public GRTesterClass() {
        GameRules.getInstance(new Level2());
        timerController = TimerController.getInstance(null, null);
        timerController.startAllTimers();

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new GRTesterClass();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}


