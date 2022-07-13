package rpgtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharacterTest {
    @Test
    public void TestHit() {
        Character character = new Character(10);
        character.hit(5);
        Assertions.assertTrue(character.isAlive());
    }

    @Test
    public void TestWithDeath() {
        Character character = new Character(10);
        character.hit(10);
        Assertions.assertFalse(character.isAlive());
    }

    @Test
    public void TestTwoWithoutDeath() {
        Character character = new Character(10);
        character.hit(5);
        character.hit(4);

        Assertions.assertTrue(character.isAlive());
    }

}
