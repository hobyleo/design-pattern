package strategy;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class BiteAttack implements Attackable {

    @Override
    public void attack() {
        System.out.println("咬");
    }
}
