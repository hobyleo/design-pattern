package abstractfactory;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class MysqlConnection implements IConnection {

    @Override
    public void connect() {
        System.out.println("mysql connection established...");
    }
}
