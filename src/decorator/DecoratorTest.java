package decorator;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Component component = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        component.operation();
    }
}
