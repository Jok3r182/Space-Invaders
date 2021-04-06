package spaceinvaders.resources.objects.aliengrid.columns;

import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.objects.BaseAlien;
import spaceinvaders.resources.objects.aliengrid.BaseAlienColumn;
import spaceinvaders.resources.objects.aliens.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArturColumn extends BaseAlienColumn {
    @Override
    protected List<BaseAlien> setAlienColumn() {
        List<BaseAlien> alienColumn = new ArrayList<>();
        try {
            int yPos = 100;
            alienColumn.add(new BiggAlien(new Position(0, yPos, 1)));
            alienColumn.add(new NotSoBigAlien(new Position(0, yPos + 50, 1)));
            alienColumn.add(new BiggAlien(new Position(0, yPos + 100, 1)));
            alienColumn.add(new NotSoBigAlien(new Position(0, yPos + 150, 1)));
            alienColumn.add(new BiggAlien(new Position(0, yPos + 200,1)));
            alienColumn.add(new NotSoBigAlien(new Position(0, yPos + 250, 1)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alienColumn;
    }

    @Override
    protected int setAlienCount() {
        return 10;
    }
}

