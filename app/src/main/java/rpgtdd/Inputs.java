package rpgtdd;

import java.util.Scanner;
import rpgtdd.Inputs;

public class Inputs {
    public Scanner scanner;
    public Character character;
    public String valueReceived;

    public Inputs(Scanner scanner, Character character) {
        this.scanner = scanner;
        this.character = character;
    }

    public void processNextInput() {
        String str = scanner.next();
        if (str.equals("1"))
            character.hit(2);
        else if (str.equals("2"))
            System.out.println(character.display());

    }
}
