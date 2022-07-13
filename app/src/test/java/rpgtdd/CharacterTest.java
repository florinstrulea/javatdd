package rpgtdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CharacterTest {
    @Test
    public void TestHit() {
        Character character = new Character(10, "test");
        character.hit(5);
        assertTrue(character.isAlive());
    }

    @Test
    public void TestWithDeath() {
        Character character = new Character(10, "test");
        character.hit(10);
        assertFalse(character.isAlive());
    }

    @Test
    public void TestTwoWitDeath() {
        Character character = new Character(10, "test");
        character.hit(5);
        character.hit(5);

        assertFalse(character.isAlive());
    }

    @Test
    public void TestTwoWithoutDeath() {
        Character character = new Character(10, "test");
        character.hit(5);
        character.hit(4);

        assertTrue(character.isAlive());
    }

}
