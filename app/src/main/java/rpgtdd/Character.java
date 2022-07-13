package rpgtdd;

public class Character {
    public String name = "";
    public int life = 0;

    public Character(int life, String name) {
        this.life = life;
        this.name = name;
    }

    public boolean isAlive() {
        if (this.life > 0)
            return true;
        else
            return false;
    }

    public void hit(int damage) {
        this.life -= damage;
    }

    // public void Attack() {

    // }

    public String display() {
        return name + " : " + life + "PV";
    }
}
