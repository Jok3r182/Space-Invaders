package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.resources.objects.BaseShieldPart;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class HalloweenCorner1Part extends BaseShieldPart {
    public HalloweenCorner1Part() throws IOException {
        super(ImageIO.read(new FileInputStream("src/main/resources/sprites/shields/halloween/halloweenCorner1.png")), 5);
    }
}