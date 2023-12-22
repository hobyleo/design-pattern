package abstractfactory;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class OracleDbUtil implements IDbUtil {

    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}
