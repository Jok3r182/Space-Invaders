package spaceinvaders.resources.objects.aliens;

import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.objects.BaseAlien;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class NotSoBigAlien extends BaseAlien {
    public NotSoBigAlien(Position position) throws IOException {
        super(33, ImageIO.read(new FileInputStream("src/spaceinvaders/resources/sprites/aliens/Medium_Alien.png")), position);
    }
}
