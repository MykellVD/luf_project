package luf_project;

public abstract class Ship extends Placeable {
    private int shields;

    public void incShields(int damage)  {
        shields += damage;
    }

    public void decShields(int damage) {
        shields -= damage;
    }

    public int getShields() {
        return shields;
    }

    public void setShields(int shields) {
        this.shields = shields;
    }

    public abstract void takeDamage(int damage);
}
