package adapter;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public int output5V() {
        int i = output220V();
        // ...
        System.out.println(String.format("原始电压: %dV -> 输出电压: %dV", i, 5));
        return 5;
    }
}
