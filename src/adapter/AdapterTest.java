package adapter;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class AdapterTest {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.output5V();

        ClassAdapter adapter = new ClassAdapter();
        adapter.output5V();
    }
}
