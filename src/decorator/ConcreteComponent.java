package decorator;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("拍照");
    }
}
