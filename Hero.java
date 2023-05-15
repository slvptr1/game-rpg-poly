public class Hero extends Character {
    @Override
    public void move(){
        System.out.println("Hero sedang bergerak...");
    }
    public void move(String direction) {
        System.out.println("Hero bergerak menuju " + direction);
    }
}
