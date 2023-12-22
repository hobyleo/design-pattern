package factorymethod;

import simplefactory.Product;
import simplefactory.ProductA;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class ConcreteProductA extends Application {

    @Override
    public Product createProduct() {
        // ...
        return new ProductA();
    }

}
