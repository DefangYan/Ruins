package ruins.demo;

/**
 * @author defang.yan
 * @date 19-4-25 上午10:42
 */
public class SynchronizedGuanJianZi {
    //同步方法
    public synchronized void dosth(){
        System.out.println("hello world");
    }

    //同步代码块
    public void dosth1(){
        synchronized (SynchronizedGuanJianZi.class){
            System.out.println("nihao");
        }
    }
}
