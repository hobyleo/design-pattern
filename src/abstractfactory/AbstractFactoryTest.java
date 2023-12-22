package abstractfactory;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IDbUtil dbUtil = new MysqlDbUtil();
        IConnection connection = dbUtil.getConnection();
        connection.connect();
        ICommand command = dbUtil.getCommand();
        command.command();
    }
}
