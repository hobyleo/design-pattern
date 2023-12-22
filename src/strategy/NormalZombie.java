package strategy;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class NormalZombie extends Zombie {

    public NormalZombie() {
        super(new StepByStepMove(), new BiteAttack());
    }

    public NormalZombie(Moveable moveable, Attackable attackable) {
        super(moveable, attackable);
    }

    @Override
    public void display() {
        System.out.println("我是普通僵尸...");
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
