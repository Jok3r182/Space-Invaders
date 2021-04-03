package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.objects.BaseShield;
import spaceinvaders.resources.objects.shields.fortress.*;

import java.io.IOException;

public class HalloweenShield extends BaseShield {
    public HalloweenShield(Position position) {
        super(position, 24, 24);
    }

    @Override
    protected void setupShield() {
        try {
            //first layer
            super.addShieldPartByGrid(new HalloweenCorner1Part(), 0, 0);
            super.addShieldPartByGrid(new HalloweenTopPart(), 1, 0);
            super.addShieldPartByGrid(new HalloweenTopPart(), 2, 0);
            super.addShieldPartByGrid(new HalloweenCorner2Part(), 3, 0);
            //second layer
            super.addShieldPartByGrid(new HalloweenSide1Part(), 0, 1);
            super.addShieldPartByGrid(new HalloweenEye1Part(), 1, 1);
            super.addShieldPartByGrid(new HalloweenEye2Part(), 2, 1);
            super.addShieldPartByGrid(new HalloweenSide2Part(), 3, 1);

            //third layer
            super.addShieldPartByGrid(new HalloweenBottom1Part(), 1, 2);
            super.addShieldPartByGrid(new HalloweenBottom2Part(), 2, 2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
