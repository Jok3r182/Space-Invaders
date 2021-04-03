package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.resources.objects.BaseShieldPart;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class HalloweenCorner2Part extends BaseShieldPart {
    public HalloweenCorner2Part() throws IOException {
        super(ImageIO.read(new FileInputStream("src/spaceinvaders/resources/sprites/shields/halloween/halloweenCorner2.png")), 5);
    }
}