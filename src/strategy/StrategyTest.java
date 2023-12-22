package strategy;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class StrategyTest {

    public static void main(String[] args) {
        Zombie zombie = new NormalZombie();
        zombie.display();
        zombie.move();
        zombie.attack();
        zombie.setAttackable(new HitAttack());
        zombie.attack();
    }
}
