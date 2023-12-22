package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class InnerClassSingleton implements Serializable {

    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
        if (InnerClassHolder.instance != null) {
            throw new RuntimeException("单例不允许多个实例");
        }
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

    public Object readResolve() throws ObjectStreamException {
        return InnerClassHolder.instance;
    }
}
