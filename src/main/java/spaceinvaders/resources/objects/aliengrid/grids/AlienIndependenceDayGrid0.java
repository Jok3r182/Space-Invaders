package spaceinvaders.resources.objects.aliengrid.grids;

import spaceinvaders.resources.objects.aliengrid.BaseAlienColumn;
import spaceinvaders.resources.objects.aliengrid.BaseAlienGrid;
import spaceinvaders.resources.objects.aliengrid.columns.AlienColumn0;
import spaceinvaders.resources.objects.aliengrid.columns.AlienIndependenceDayColumn0;

import java.util.ArrayList;
import java.util.List;

public class AlienIndependenceDayGrid0 extends BaseAlienGrid {
    @Override
    protected List<BaseAlienColumn> setAlienGrid() {

        List<BaseAlienColumn> alienColumns = new ArrayList<>();
        int posX = 0;
        BaseAlienColumn alienColumn;
        for(int i = 0; i < 11; i++){
            alienColumn = new AlienIndependenceDayColumn0();
            alienColumns.add(alienColumn);
            alienColumn.setColumnPositionX(posX + i*(int)(alienColumn.getWidthOfWidestAliveAlien()*1.25));
        }
        return alienColumns;
    }

    @Override
    protected int setAlienColumnCount() {
        return 11;
    }
}
