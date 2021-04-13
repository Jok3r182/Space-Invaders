package spaceinvaders.resources.objects.aliens;

import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.objects.BaseAlien;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;

public class BiggAlien extends BaseAlien {
    public BiggAlien(Position position) throws IOException {
        super(66, ImageIO.read(new FileInputStream("src/main/resources/sprites/aliens/alienBig.png")), position);
    }
}
