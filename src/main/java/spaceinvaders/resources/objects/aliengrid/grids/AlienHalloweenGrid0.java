package spaceinvaders.resources.objects.aliengrid.grids;

import spaceinvaders.resources.objects.aliengrid.BaseAlienColumn;
import spaceinvaders.resources.objects.aliengrid.BaseAlienGrid;
import spaceinvaders.resources.objects.aliengrid.columns.*;

import java.util.ArrayList;
import java.util.List;

public class AlienHalloweenGrid0 extends BaseAlienGrid {
    @Override
    protected List<BaseAlienColumn> setAlienGrid() {
        List<BaseAlienColumn> alienColumns = new ArrayList<>();
        int posX = 0;
        BaseAlienColumn alienColumn00 = new AlienHalloweenColumn0();
        BaseAlienColumn alienColumn01 = new AlienHalloweenColumn0();
        BaseAlienColumn alienColumn02 = new AlienHalloweenColumn0();
        BaseAlienColumn alienColumn03 = new AlienHalloweenColumn0();
        BaseAlienColumn alienColumn10 = new AlienHalloweenColumn1();
        BaseAlienColumn alienColumn11 = new AlienHalloweenColumn1();

        alienColumn00.setColumnPositionX(posX);
        alienColumn01.setColumnPositionX(posX + 1*(int)(alienColumn01.getWidthOfWidestAliveAlien()*1.25));
        alienColumns.add(alienColumn00);
        alienColumns.add(alienColumn01);

        alienColumn10.setColumnPositionX(posX + 2*(int)(alienColumn10.getWidthOfWidestAliveAlien()*1.25));
        alienColumns.add(alienColumn10);

        BaseAlienColumn alienColumn2;
        for(int i = 0; i < 5; i++){
            alienColumn2 = new AlienHalloweenColumn2();
            alienColumn2.setColumnPositionX(posX + (i+3)*(int)(alienColumn2.getWidthOfWidestAliveAlien()*1.25));
            alienColumns.add(alienColumn2);
        }
        alienColumn11.setColumnPositionX(posX + 8*(int)(alienColumn11.getWidthOfWidestAliveAlien()*1.25));
        alienColumn02.setColumnPositionX(posX + 9*(int)(alienColumn02.getWidthOfWidestAliveAlien()*1.25));
        alienColumn03.setColumnPositionX(posX + 10*(int)(alienColumn03.getWidthOfWidestAliveAlien()*1.25));
        alienColumns.add(alienColumn11);
        alienColumns.add(alienColumn02);
        alienColumns.add(alienColumn03);
        return alienColumns;
    }

    @Override
    protected int setAlienColumnCount() {
        return 11;
    }
}
