package spaceinvaders.resources.objects.aliens;

import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.objects.BaseAlien;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class SmallHalloweenAlien extends BaseAlien {
    public SmallHalloweenAlien(Position position) throws IOException {
        super(45, ImageIO.read(new FileInputStream("src/spaceinvaders/resources/sprites/aliens/alienHalloweenSmall.png")), position);
    }
}
