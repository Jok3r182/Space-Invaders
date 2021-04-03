package spaceinvaders.testing;

import org.junit.Test;
import spaceinvaders.GameRunner;
import spaceinvaders.engine.GameRules;
import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.collisiondetectors.detectors.AlienProjectileCollisionDetector;
import spaceinvaders.resources.collisiondetectors.detectors.UFOProjectileCollisionDetector;
import spaceinvaders.resources.objects.BaseAlien;
import spaceinvaders.resources.objects.BaseShieldPart;
import spaceinvaders.resources.objects.Projectile;
import spaceinvaders.resources.objects.aliens.UFO;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlienProjectileCollisionDetectorTester {

    @Test
    public void AlienShouldBeHit() throws IOException {

        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();
        GameRules gameRules = GameRules.getInstance();
        BaseAlien alien = gameRules.getLevel().getAlienGrid().getGrid().get(0).getColumn().get(0);
        Projectile projectile = new Projectile(alien.getPosition(), "player");
        //When
        AlienProjectileCollisionDetector alienProjectileCollisionDetector = new AlienProjectileCollisionDetector();
        boolean result = alienProjectileCollisionDetector.process(projectile);
        //Then
        assertTrue(result, "Alien should be hit if the projectile is in its position");
    }

    @Test
    public void AlienShouldNotBeHit() throws IOException {

        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();
        GameRules gameRules = GameRules.getInstance();
        Projectile projectile = new Projectile(new Position(0, 0), "player");
        //When
        AlienProjectileCollisionDetector alienProjectileCollisionDetector = new AlienProjectileCollisionDetector();
        boolean result = alienProjectileCollisionDetector.process(projectile);
        //Then
        assertFalse(result, "Alien should not be hit if the projectile is not in its position");
    }
}
