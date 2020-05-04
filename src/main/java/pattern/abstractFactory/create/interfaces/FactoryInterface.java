package pattern.abstractFactory.create.interfaces;

import pattern.factory.product.interfaces.ProductInterface;

/**
 * 工厂接口
 */
public interface FactoryInterface {

    /**
     * 生产苹果商品
     * @return
     */
    ProductInterface createApple();

    /**
     * 生产手机产品
     * @return
     */
    ProductInterface createPhone();
}
