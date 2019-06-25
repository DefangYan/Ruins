package ruins.FactoryMethod;

/**
 * @author defang.yan
 * @date 19-5-7 下午2:08
 */
public abstract class Factory {

    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
