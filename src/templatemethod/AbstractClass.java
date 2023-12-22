package templatemethod;

/**
 * @author hoby
 * @since 2021-03-25
 */
public abstract class AbstractClass {

    public void operation() {
        System.out.println("pre ...");
        System.out.println("step1 ...");
        System.out.println("step2 ...");
        templateMethod();
    }

    protected abstract void templateMethod();
}
