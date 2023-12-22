package strategy;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class StepByStepMove implements Moveable {

    @Override
    public void move() {
        System.out.println("一步一步移动...");
    }
}
