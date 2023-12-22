package templatemethod;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        AbstractClass abstractClass = new SubClassA();
        abstractClass.operation();
    }
}
