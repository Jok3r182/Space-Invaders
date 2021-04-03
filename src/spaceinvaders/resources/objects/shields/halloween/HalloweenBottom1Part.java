package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.resources.objects.BaseShieldPart;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class HalloweenBottom1Part extends BaseShieldPart {
    public HalloweenBottom1Part() throws IOException {
        super(ImageIO.read(new FileInputStream("src/spaceinvaders/resources/sprites/shields/halloween/halloweenBottom1.png")), 5);
    }
}
