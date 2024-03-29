package spaceinvaders.resources.scenes.levels;

import spaceinvaders.GameSettings;
import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.objects.aliengrid.BaseAlienGrid;
import spaceinvaders.resources.objects.aliengrid.grids.AlienGrid1;
import spaceinvaders.resources.objects.aliengrid.grids.AlienGrid3;
import spaceinvaders.resources.objects.aliengrid.grids.AlienIndependenceDayGrid0;
import spaceinvaders.resources.objects.player.Player;
import spaceinvaders.resources.objects.shields.fortress.FortressShield;
import spaceinvaders.resources.scenes.BaseLevel;

import java.io.IOException;
import java.util.ArrayList;

public class Level2 extends BaseLevel {

    private int playerPositionY;
    private GameSettings gameSettings;

    public Level2() {
        super(new AlienIndependenceDayGrid0());
        gameSettings = GameSettings.getInstance();
        playerPositionY = (int)(gameSettings.getWindowHeight() * 0.8);
        shields = new ArrayList<>();
        shields.add(new FortressShield(new Position((int)(gameSettings.getWindowWidth() * 0.1), (int)(gameSettings.getWindowHeight()*0.6))));
        shields.add(new FortressShield(new Position((int)(gameSettings.getWindowWidth() * 0.30), (int)(gameSettings.getWindowHeight()*0.6))));
        shields.add(new FortressShield(new Position((int)(gameSettings.getWindowWidth() * 0.50), (int)(gameSettings.getWindowHeight()*0.6))));
        shields.add(new FortressShield(new Position((int)(gameSettings.getWindowWidth() * 0.75), (int)(gameSettings.getWindowHeight()*0.6))));
        shields.add(new FortressShield(new Position((int)(gameSettings.getWindowWidth() * 0.9), (int)(gameSettings.getWindowHeight()*0.6))));

        try {
            player = new Player(new Position(gameSettings.getWindowWidth()/2, playerPositionY, -1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void resetGrid() {
        alienGrid = new AlienGrid3();
    }

    @Override
    public BaseLevel resetLevel(){
        return new LevelIndependenceDay();
    }

}
