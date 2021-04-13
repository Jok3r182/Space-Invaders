package spaceinvaders.resources.objects.shields.halloween;

import spaceinvaders.resources.objects.BaseShieldPart;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class HalloweenEye1Part extends BaseShieldPart {
    public HalloweenEye1Part() throws IOException {
        super(ImageIO.read(new FileInputStream("src/main/resources/sprites/shields/halloween/halloweenEye1.png")), 5);
    }
}