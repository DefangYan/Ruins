package ruins.Singleton;

/**
 * @author defang.yan
 * @date 19-5-13 下午2:57
 */
public class WooWoo {
    public static void main(String[] args) {
        System.out.println("开始");
        SingletonLan singletonLan = SingletonLan.getInstance();
        System.out.println("结束");
    }
}
