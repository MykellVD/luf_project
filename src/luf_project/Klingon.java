package luf_project;

import java.util.Random;

public class Klingon extends Ship {
    int hull;
    Random rand = new Random();

    public Klingon() {
        // random health between 100 and 300
        hull = rand.nextInt((300-100) + 1) + 100;
    }

    public void usePhaser() {

    }

    @Override
    public void takeDamage(int damage) {
        if (getShields() > 0) {
            decShields(damage);
        } else {
            hull -= damage;
        }
    }
}
