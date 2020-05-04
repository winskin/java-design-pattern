package pattern.abstractFactory.product.impls;

import pattern.factory.product.interfaces.ProductInterface;

/**
 * 广东手机产品
 */
public class GuangdongPhoneImpl implements ProductInterface {
    @Override
    public void sales() {
        // 定制化业务，按一台卖
        System.out.println("卖手机-广东生产");
    }
}
