package pattern.abstractFactory.product.impls;

import pattern.factory.product.interfaces.ProductInterface;

/**
 * 北京手机产品
 */
public class BeijingPhoneImpl implements ProductInterface {
    @Override
    public void sales() {
        // 定制化业务，按一台卖
        System.out.println("卖手机-北京生产");
    }
}
