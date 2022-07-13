package rpgtdd;

public class Character {
    private int life = 0;

    public Character(int life) {
        this.life = life;
    }

    public boolean isAlive() {
        if (this.life >= 0)
            return true;
        else
            return false;
    }

    public void hit(int damage) {
        this.life -= damage;
    }
}
