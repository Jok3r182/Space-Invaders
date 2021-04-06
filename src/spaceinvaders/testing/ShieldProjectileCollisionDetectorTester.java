package spaceinvaders.testing;

import org.junit.Test;
import spaceinvaders.GameRunner;
import spaceinvaders.engine.GameRules;
import spaceinvaders.engine.object.CollisionBox;
import spaceinvaders.engine.object.Position;
import spaceinvaders.resources.collisiondetectors.detectors.ShieldProjectileCollisionDetector;
import spaceinvaders.resources.collisiondetectors.detectors.UFOProjectileCollisionDetector;
import spaceinvaders.resources.objects.BaseShield;
import spaceinvaders.resources.objects.BaseShieldPart;
import spaceinvaders.resources.objects.Projectile;
import spaceinvaders.resources.objects.aliens.UFO;
import spaceinvaders.resources.scenes.levels.Level0;
import spaceinvaders.resources.scenes.levels.PatricksDayLevel;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShieldProjectileCollisionDetectorTester {
    @Test
    public void shouldReturnTrueIfPlayerProjectileIsHittingAShield() throws IOException {
        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();
        GameRules gameRules = GameRules.getInstance();
        BaseShieldPart baseShieldPart = gameRules.getLevel().getShields().get(0).getShield().get(0);
        Projectile projectile = new Projectile(baseShieldPart.getPosition(), "player");
        //When
        ShieldProjectileCollisionDetector shieldProjectileCollisionDetector = new ShieldProjectileCollisionDetector();
        boolean result = shieldProjectileCollisionDetector.process(projectile);
        //Then
        assertTrue(result, "Shield should be hit if player projectile is in its position");
    }
    @Test
    public void shouldReturnFalseIfPlayerProjectileIsNotHittingAShield() throws IOException {
        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();
        GameRules gameRules = GameRules.getInstance();
        BaseShieldPart baseShieldPart = gameRules.getLevel().getShields().get(0).getShield().get(0);
        Projectile projectile = new Projectile(new Position(0, 0), "player");
        //When
        ShieldProjectileCollisionDetector shieldProjectileCollisionDetector = new ShieldProjectileCollisionDetector();
        boolean result = shieldProjectileCollisionDetector.process(projectile);
        //Then
        assertFalse(result, "Shield should not be hit if player projectile is not in its position");
    }
    @Test
    public void shouldReturnTrueIfNonPlayerProjectileIsHittingAShield() throws IOException {
        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();
        GameRules gameRules = GameRules.getInstance();
        BaseShieldPart baseShieldPart = gameRules.getLevel().getShields().get(0).getShield().get(0);
        Projectile projectile = new Projectile(baseShieldPart.getPosition(), "non-player object (can be anything)");
        //When
        ShieldProjectileCollisionDetector shieldProjectileCollisionDetector = new ShieldProjectileCollisionDetector();
        boolean result = shieldProjectileCollisionDetector.process(projectile);
        //Then
        assertTrue(result, "Shield should be hit if non-player projectile is in its position");
    }
    @Test
    public void shouldReturnFalseIfNonPlayerProjectileIsNotHittingAShield() throws IOException {
        //Given
        GameRunner gameRunner = new GameRunner();
        gameRunner.timerController.stopAllTimers();
        GameRules gameRules = GameRules.getInstance();
        BaseShieldPart baseShieldPart = gameRules.getLevel().getShields().get(0).getShield().get(0);
        Projectile projectile = new Projectile(new Position(0, 0), "non-player object (can be anything)");
        //When
        ShieldProjectileCollisionDetector shieldProjectileCollisionDetector = new ShieldProjectileCollisionDetector();
        boolean result = shieldProjectileCollisionDetector.process(projectile);
        //Then
        assertFalse(result, "Shield should not be hit if non-player projectile is not in its position");
    }
}
