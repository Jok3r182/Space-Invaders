package spaceinvaders.resources.objects.aliens;

import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.objects.BaseAlien;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PatricksDayMediumAlien extends BaseAlien {
    public PatricksDayMediumAlien(Position position) throws IOException {
        super(100, ImageIO.read(new FileInputStream("src/main/resources/sprites/aliens/alienPatrickMedium.png")), position);
    }
}
