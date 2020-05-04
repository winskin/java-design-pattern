package pattern.factory.create.interfaces;

import pattern.factory.product.interfaces.ProductInterface;

/**
 * 工厂接口
 */
public interface FactoryInterface {

    /**
     * 生产商品
     * @return
     */
    ProductInterface create();
}
