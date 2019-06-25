package ruins.Adapter;

/**
 * @author defang.yan
 * @date 19-5-6 下午4:57
 */
public class Banner {

    private String bannerName;

    public void painBanner(){
        System.out.println("this is a test for painBanner"+bannerName);
    }

    public void designBanner(){
        System.out.println("小明正在设计Banner"+bannerName);
    }

    public Banner(String bannerName) {
        this.bannerName = bannerName;
    }
}
// Banner 类 为被适配对象Adaptee