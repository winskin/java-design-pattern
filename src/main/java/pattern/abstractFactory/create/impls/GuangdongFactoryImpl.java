package pattern.abstractFactory.create.impls;

import pattern.abstractFactory.create.interfaces.FactoryInterface;
import pattern.abstractFactory.product.impls.GuangdongAppleImpl;
import pattern.abstractFactory.product.impls.GuangdongPhoneImpl;
import pattern.factory.product.interfaces.ProductInterface;

/**
 * 广东工厂
 */
public class GuangdongFactoryImpl implements FactoryInterface {
    @Override
    public ProductInterface createApple() {
        return new GuangdongAppleImpl();
    }

    @Override
    public ProductInterface createPhone() {
        return new GuangdongPhoneImpl();
    }
}
