package pattern.abstractFactory.product.impls;

import pattern.factory.product.interfaces.ProductInterface;

/**
 * 广东苹果产品
 */
public class GuangdongAppleImpl implements ProductInterface {
    @Override
    public void sales() {
        // 定制化业务，按一箱卖
        System.out.println("卖苹果-广东生产");
    }
}
