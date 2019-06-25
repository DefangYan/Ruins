package ruins.Singleton;

/**
 * @author defang.yan
 * @date 19-5-9 上午9:46
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();
    //一进来调用getInstance方法执行 static singleton 方法 为饿汉模式，初始值就是直接进行构造器构造
    //延迟加载 ，也就是懒汉模式  详见 SingletonLan
    private Singleton(){
        System.out.println("开始调用此方法");
    }

    public static Singleton getInstance(){
        System.out.println("这是一个刚刚的开始");
        return singleton;
    }
}
