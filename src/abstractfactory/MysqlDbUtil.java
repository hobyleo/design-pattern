package abstractfactory;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class MysqlDbUtil implements IDbUtil {

    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MysqlCommand();
    }
}
