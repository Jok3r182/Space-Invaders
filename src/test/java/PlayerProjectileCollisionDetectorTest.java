import org.junit.Test;
import spaceinvaders.GameRunner;
import spaceinvaders.engine.GameRules;
import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.collisiondetectors.detectors.PlayerProjectileCollisionDetector;
import spaceinvaders.resources.collisiondetectors.detectors.UFOProjectileCollisionDetector;
import spaceinvaders.resources.objects.Projectile;
import spaceinvaders.resources.objects.aliens.UFO;
import spaceinvaders.resources.objects.player.Player;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerProjectileCollisionDetectorTest {

    @Test
    public void PlayerShouldBeHit() throws IOException {
        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();

        Projectile projectile = new Projectile(new Position(0, 0), "alien");
        GameRules gameRules = GameRules.getInstance();
        gameRules.setPlayerLivesLeft(1);
        gameRules.setPlayerPositionX(0);
        gameRules.setPlayerPositionY(0);
        //When

        PlayerProjectileCollisionDetector playerProjectileCollisionDetector = new PlayerProjectileCollisionDetector();
        boolean result = playerProjectileCollisionDetector.process(projectile);

        //Then
        assertTrue(result);
    }

    @Test
    public void PlayerShouldntBeHit() throws IOException {
        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();

        Projectile projectile = new Projectile(new Position(0, 0), "alien");
        GameRules gameRules = GameRules.getInstance();
        gameRules.setPlayerLivesLeft(1);
        gameRules.setPlayerPositionX(10);
        gameRules.setPlayerPositionY(10);
        //When

        PlayerProjectileCollisionDetector playerProjectileCollisionDetector = new PlayerProjectileCollisionDetector();
        boolean result = playerProjectileCollisionDetector.process(projectile);

        //Then
        assertFalse(result);

    }
}
