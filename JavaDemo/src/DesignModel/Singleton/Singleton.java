package DesignModel.Singleton;

/**
 * 懒汉式
 * 对象延迟加载
 * */
public class Singleton {
    private static Singleton singleton = null;

    /**
     * 私有构造方法，防止被实例化
     * */
    private Singleton(){}

    /**
     * 静态工程方法,创建实例
     * */
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve(){
        return singleton;
    }
}
