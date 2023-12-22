package abstractfactory;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class OracleConnection implements IConnection {

    @Override
    public void connect() {
        System.out.println("oracle connection established...");
    }
}
