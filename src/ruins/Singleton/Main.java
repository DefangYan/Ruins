package ruins.Singleton;

/**
 * @author defang.yan
 * @date 19-5-9 上午9:50
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("开始");
        Singleton instance = Singleton.getInstance();
        //由此可以看出 static 类的加载的时候先加载static 静态的
        Singleton instance1 = Singleton.getInstance();
        if (instance == instance1){
            System.out.println("两者相等");
        }else {
            System.out.println("两者不等");
        }
        System.out.println("结束");

        Testforeq testforeq = new Testforeq();
        if (testforeq.foreq().equals(true)){
            System.out.println("可以这么写");
        }else {
            System.out.println("不可以这么写");
        }
    }
}
