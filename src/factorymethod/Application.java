package factorymethod;

import simplefactory.Product;

/**
 * @author hoby
 * @since 2021-03-25
 */
public abstract class Application {

    public abstract Product createProduct();

    public Product getProduct() {
        Product product = createProduct();
        // ...
        return product;
    }
}
