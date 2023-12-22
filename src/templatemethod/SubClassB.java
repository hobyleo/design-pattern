package templatemethod;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class SubClassB extends AbstractClass {

    @Override
    protected void templateMethod() {
        System.out.println("subclass B executed ...");
    }
}
