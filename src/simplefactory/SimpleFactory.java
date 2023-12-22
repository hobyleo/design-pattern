package simplefactory;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class SimpleFactory {

    public static Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ProductA();
        } else if ("B".equals(type)) {
            return new ProductB();
        }
        return null;
    }
}
