package abstractfactory;

/**
 * @author hoby
 * @since 2021-03-25
 */
public interface IDbUtil {

    IConnection getConnection();

    ICommand getCommand();

}
