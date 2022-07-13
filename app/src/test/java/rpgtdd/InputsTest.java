package rpgtdd;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InputsTest {
    @Test
    public void testAttack() {
        // Create fake scanner
        Scanner scanner = Mockito.mock(Scanner.class);
        // That will return "1" when next() is called;
        Mockito.when(scanner.next()).thenReturn("1");
        // Create a fake character
        Character character = Mockito.mock(Character.class);
        // the actual test code
        Inputs inputs = new Inputs(scanner, character);
        inputs.processNextInput();
        Mockito.verify(character, Mockito.never()).display();
        // Check that character took 2 damage
        Mockito.verify(character, Mockito.times(1)).hit(2);
    }

    @Test
    public void testDisplay() {
        // Create fake scanner
        Scanner scanner = Mockito.mock(Scanner.class);
        // That will return "1" when next() is called;
        Mockito.when(scanner.next()).thenReturn("2");
        // Create a fake character
        Character character = Mockito.mock(Character.class);
        // the actual test code
        Inputs inputs = new Inputs(scanner, character);
        inputs.processNextInput();
        Mockito.verify(character, Mockito.never()).hit(2);
        // Check that character took 2 damage
        Mockito.verify(character, Mockito.times(1)).display();
    }
}
