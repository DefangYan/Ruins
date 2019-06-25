package ruins.Singleton;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author defang.yan
 * @date 19-5-13 下午2:34
 */
public class SingletonLan {

    //懒汉模式  也就是延迟加载   在调用getInstance方法时候先给 静态变量 singleton 赋值为null
    //多线程模式下的单例模式实现
    private static SingletonLan singletonLan = null;

    private SingletonLan(){
        System.out.println("开始调用此方法");
    }

    public static SingletonLan getInstance(){
        if (singletonLan == null){
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("开始创建实例，懒汉模式");
            singletonLan = new SingletonLan();
        }
        return singletonLan;
    }
}
