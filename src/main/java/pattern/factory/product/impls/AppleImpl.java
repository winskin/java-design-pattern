package pattern.factory.product.impls;

import pattern.factory.product.interfaces.ProductInterface;

/**
 * 苹果产品
 */
public class AppleImpl implements ProductInterface {
    @Override
    public void sales() {
        // 定制化业务，按一箱卖
        System.out.println("卖苹果");
    }
}
