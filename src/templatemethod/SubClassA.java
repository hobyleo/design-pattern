package templatemethod;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class SubClassA extends AbstractClass {

    @Override
    protected void templateMethod() {
        System.out.println("subclass A executed ...");
    }
}
