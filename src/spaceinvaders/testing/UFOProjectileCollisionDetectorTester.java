package spaceinvaders.testing;

import org.junit.Test;
import spaceinvaders.GameRunner;
import spaceinvaders.engine.GameRules;
import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.collisiondetectors.detectors.UFOProjectileCollisionDetector;
import spaceinvaders.resources.objects.Projectile;
import spaceinvaders.resources.objects.aliens.UFO;
import spaceinvaders.resources.objects.player.Player;
import spaceinvaders.resources.scenes.levels.PatricksDayLevel;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UFOProjectileCollisionDetectorTester {

    @Test
    public void UFOshouldBeHit() throws IOException {
        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();
        Projectile projectile = new Projectile(new Position(0, 0), "player");
        GameRules gameRules = GameRules.getInstance();
        gameRules.setUFO(new UFO(new Position(0, 0)));
        //When
        UFOProjectileCollisionDetector ufoProjectileCollisionDetector = new UFOProjectileCollisionDetector();
        boolean result = ufoProjectileCollisionDetector.process(projectile);
        //Then
        assertTrue(result, "UFO should be hit if the projectile is in its position");
    }
    @Test
    public void UFOshouldntBeHit() throws IOException {
        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();
        Projectile projectile = new Projectile(new Position(20, 20), "player");
        GameRules gameRules = GameRules.getInstance();
        gameRules.setUFO(new UFO(new Position(0, 0)));
        //When
        UFOProjectileCollisionDetector ufoProjectileCollisionDetector = new UFOProjectileCollisionDetector();
        boolean result = ufoProjectileCollisionDetector.process(projectile);
        //Then
        assertFalse(result, "UFO should be hit if the projectile is in its position");
    }
}
