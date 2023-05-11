public class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Enemy Bergerak !!!");
    }
    public void move(int step) {
        System.out.println("Enemy melangkah sebanyak "+step);
    }

}
