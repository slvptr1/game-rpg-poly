public class App {
    public static void main(String[] args) {
        // static polimorfisme pada class Hero
        Hero hero = new Hero();
        hero.move();
        hero.move("barat");

        //static polimorfisme pada class Enemy
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(7);

        //dinamic polimorfisme
        Character character1 = new Hero();
        character1.move();

        Character character2 = new Enemy();
        character2.move();

        Character character3 = new Witch();
        character3.move();

        Character character4 = new Witch();
        Fighter fighter = (Fighter) character4;
        fighter.move();
    }
}
