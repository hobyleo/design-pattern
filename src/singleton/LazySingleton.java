package singleton;

/**
 * @author hoby
 * @since 2021-03-25
 */
public class LazySingleton {

    private volatile static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    // 分配空间 => 初始化 => 引用赋值
                    // 有可能重排序后变成：分配空间 => 引用赋值(若这一步被其他线程中断,则可能导致多次实例化) => 初始化
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
