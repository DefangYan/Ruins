package ruins.FactoryMethod;

/**
 * @author defang.yan
 * @date 19-5-7 下午2:13
 */
public class IDCards extends Product {

    private String owner;

    public IDCards(String owner) {
        System.out.println("制作"+owner+"的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }

    public String getOwner() {
        System.out.println(owner);
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
