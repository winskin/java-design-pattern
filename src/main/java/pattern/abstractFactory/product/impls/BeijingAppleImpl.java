package pattern.abstractFactory.product.impls;

import pattern.factory.product.interfaces.ProductInterface;

/**
 * 北京苹果产品
 */
public class BeijingAppleImpl implements ProductInterface {
    @Override
    public void sales() {
        // 定制化业务，按一箱卖
        System.out.println("卖苹果-北京生产");
    }
}
