package factorymethod;

import simplefactory.Product;
import simplefactory.ProductB;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class ConcreteProductB extends Application {

    @Override
    public Product createProduct() {
        // ...
        return new ProductB();
    }

}
