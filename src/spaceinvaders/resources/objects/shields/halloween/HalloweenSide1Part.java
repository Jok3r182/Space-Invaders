package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.resources.objects.BaseShieldPart;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class HalloweenSide1Part extends BaseShieldPart {
    public HalloweenSide1Part() throws IOException {
        super(ImageIO.read(new FileInputStream("src/spaceinvaders/resources/sprites/shields/halloween/halloweenSide1.png")), 5);
    }
}
