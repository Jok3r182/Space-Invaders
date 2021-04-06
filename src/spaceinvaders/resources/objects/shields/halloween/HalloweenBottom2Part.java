package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.resources.objects.BaseShieldPart;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class HalloweenBottom2Part extends BaseShieldPart {
    public HalloweenBottom2Part() throws IOException {
        super(ImageIO.read(new FileInputStream("src/spaceinvaders/resources/sprites/shields/halloween/halloweenBottom2.png")), 5);
    }
}