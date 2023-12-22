package strategy;

/**
 * @author hoby
 * @since 2021-03-25
 */
public abstract class Zombie {

    protected Moveable moveable;
    protected Attackable attackable;

    public Zombie(Moveable moveable, Attackable attackable) {
        this.moveable = moveable;
        this.attackable = attackable;
    }

    public abstract void display();

    public abstract void move();

    public abstract void attack();

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }
}
