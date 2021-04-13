package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.resources.objects.BaseShieldPart;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class HalloweenTopPart extends BaseShieldPart {
    public HalloweenTopPart() throws IOException {
        super(ImageIO.read(new FileInputStream("src/main/resources/sprites/shields/halloween/halloweenTop.png")), 5);
    }
}