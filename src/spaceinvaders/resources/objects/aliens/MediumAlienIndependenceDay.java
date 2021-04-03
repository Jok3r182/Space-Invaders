package spaceinvaders.resources.objects.aliens;

import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.objects.BaseAlien;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class MediumAlienIndependenceDay extends BaseAlien {
    public MediumAlienIndependenceDay(int points, BufferedImage image, Position position)  throws IOException {
        super(100,  ImageIO.read(new FileInputStream("src/spaceinvaders/resources/sprites/aliens/alienMediumIndependenceDay.PNG")), position);
    }
}
