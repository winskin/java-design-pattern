package pattern.abstractFactory.create.impls;

import pattern.abstractFactory.create.interfaces.FactoryInterface;
import pattern.abstractFactory.product.impls.BeijingAppleImpl;
import pattern.abstractFactory.product.impls.BeijingPhoneImpl;
import pattern.factory.product.interfaces.ProductInterface;

/**
 * 北京工厂
 */
public class BeijingFactoryImpl implements FactoryInterface {
    @Override
    public ProductInterface createApple() {
        return new BeijingAppleImpl();
    }

    @Override
    public ProductInterface createPhone() {
        return new BeijingPhoneImpl();
    }
}
