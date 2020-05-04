package pattern.factory.create.impls;

import pattern.factory.create.interfaces.FactoryInterface;
import pattern.factory.product.impls.AppleImpl;
import pattern.factory.product.impls.PhoneImpl;
import pattern.factory.product.interfaces.ProductInterface;

/**
 * 手机工厂
 */
public class PhoneFactory implements FactoryInterface {

    /**
     * 创建手机
     * @return
     */
    @Override
    public ProductInterface create() {
        // 可以在这里处理业务操作，最后返回产品对象
        return new PhoneImpl();
    }
}
