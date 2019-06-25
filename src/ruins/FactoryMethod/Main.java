package ruins.FactoryMethod;

/**
 * @author defang.yan
 * @date 19-5-7 下午2:26
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDFactory();
        Product cc = factory.create("cc");
        cc.use();
        factory.registerProduct(cc);
    }
}
