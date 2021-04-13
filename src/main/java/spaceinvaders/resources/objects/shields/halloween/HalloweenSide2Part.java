package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.resources.objects.BaseShieldPart;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class HalloweenSide2Part extends BaseShieldPart {
    public HalloweenSide2Part() throws IOException {
        super(ImageIO.read(new FileInputStream("src/main/resources/sprites/shields/halloween/halloweenSide2.png")), 5);
    }
}
