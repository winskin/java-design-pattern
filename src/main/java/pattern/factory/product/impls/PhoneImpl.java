package pattern.factory.product.impls;

import pattern.factory.product.interfaces.ProductInterface;

/**
 * 手机产品
 */
public class PhoneImpl implements ProductInterface {
    @Override
    public void sales() {
        // 定制化业务，按一台卖
        System.out.println("卖手机");
    }
}
