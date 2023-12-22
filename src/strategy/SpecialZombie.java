package strategy;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class SpecialZombie extends Zombie {

    public SpecialZombie() {
        super(new JumpMove(), new HitAttack());
    }

    public SpecialZombie(Moveable moveable, Attackable attackable) {
        super(moveable, attackable);
    }

    @Override
    public void display() {
        System.out.println("我是特殊僵尸...");
    }

    @Override
    public void move() {
        moveable.move();
    }

    @Override
    public void attack() {
        attackable.attack();
    }
}
