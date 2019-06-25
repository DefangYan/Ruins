package ruins.Adapter;

/**
 * @author defang.yan
 * @date 19-5-6 下午5:01
 */
public class PrintBanner extends Banner implements IBannerCompany {

    public PrintBanner(String bannerName) {
        super(bannerName);
    }

    @Override
    public void design() {
        designBanner();
    }

    @Override
    public void describe() {
        painBanner();
    }
}

//  PrintBanner 为 Adapter  适配对象
