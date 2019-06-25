package ruins.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author defang.yan
 * @date 19-5-7 下午2:19
 */
public class IDFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCards(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCards)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
