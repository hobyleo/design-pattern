package singleton;

/**
 * @author hoby
 * @since 2021-03-25
 */
public enum EnumSingleton {
    INSTANCE;

    public void print() {
        System.out.println(this.hashCode());
    }
}
