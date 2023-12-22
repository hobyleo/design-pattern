package decorator;

/**
 * @author hoby
 * @since 2021-03-25
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
