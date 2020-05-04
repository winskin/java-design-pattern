package pattern.factory.create.impls;

import pattern.factory.create.interfaces.FactoryInterface;
import pattern.factory.product.impls.AppleImpl;
import pattern.factory.product.interfaces.ProductInterface;

/**
 * 苹果工厂
 */
public class AppleFactory implements FactoryInterface {

    /**
     * 创建苹果
     * @return
     */
    @Override
    public ProductInterface create() {
        // 可以在这里处理业务操作，最后返回产品对象
        return new AppleImpl();
    }
}
