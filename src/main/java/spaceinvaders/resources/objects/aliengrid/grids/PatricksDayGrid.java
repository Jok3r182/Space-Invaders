package spaceinvaders.resources.objects.aliengrid.grids;

import spaceinvaders.resources.objects.aliengrid.BaseAlienColumn;
import spaceinvaders.resources.objects.aliengrid.BaseAlienGrid;
import spaceinvaders.resources.objects.aliengrid.columns.AlienColumn0;
import spaceinvaders.resources.objects.aliengrid.columns.AlienColumn1;
import spaceinvaders.resources.objects.aliengrid.columns.AlienColumn2;
import spaceinvaders.resources.objects.aliengrid.columns.PatricksDayColumn;

import java.util.ArrayList;
import java.util.List;

public class PatricksDayGrid extends BaseAlienGrid {
    @Override
    protected List<BaseAlienColumn> setAlienGrid() {
        List<BaseAlienColumn> alienColumns = new ArrayList<>();
        int posX = 0;
        BaseAlienColumn alienColumn10 = new PatricksDayColumn();
        BaseAlienColumn alienColumn11 = new PatricksDayColumn();
        BaseAlienColumn alienColumn20 = new PatricksDayColumn();
        BaseAlienColumn alienColumn21 = new PatricksDayColumn();
        alienColumn10.setColumnPositionX(posX);
        alienColumn11.setColumnPositionX(posX + 10*(int)(alienColumn11.getWidthOfWidestAliveAlien()*1.25));
        alienColumn20.setColumnPositionX(posX + (int) (alienColumn20.getWidthOfWidestAliveAlien() * 1.25));
        alienColumn21.setColumnPositionX(posX + 9*(int)(alienColumn21.getWidthOfWidestAliveAlien()*1.25));

        alienColumns.add(alienColumn10);
        alienColumns.add(alienColumn20);

        BaseAlienColumn alienColumn0;
        for(int i = 0; i < 3; i++){
            alienColumn0 = new PatricksDayColumn();
            alienColumn0.setColumnPositionX(posX + (i+4)*(int)(alienColumn0.getWidthOfWidestAliveAlien()*1.25));
            alienColumns.add(alienColumn0);
        }
        alienColumns.add(alienColumn21);
        alienColumns.add(alienColumn11);
        return alienColumns;
    }

    @Override
    protected int setAlienColumnCount() {
        return 7;
    }
}
