public class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Enemy sedang bergerak...");
    }
    public void move(int step) {
        System.out.println("Enemy bergerak " + step + " langkah");
    }
}
