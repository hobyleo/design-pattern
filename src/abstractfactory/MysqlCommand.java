package abstractfactory;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class MysqlCommand implements ICommand {

    @Override
    public void command() {
        System.out.println("mysql command...");
    }
}
