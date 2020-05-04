package pattern.test;

import pattern.factory.create.impls.AppleFactory;
import pattern.factory.create.impls.PhoneFactory;
import pattern.factory.create.interfaces.FactoryInterface;

/**
 * 工厂模式客户端
 */
public class FactoryTest {

    public static void main(String[] args) {
        System.out.println("手机----------");
        // 创建手机工厂
        FactoryInterface phoneFactory = new PhoneFactory();
        // 工厂生产手机产品，调用销售方法
        phoneFactory.create().sales();

        System.out.println("苹果----------");
        // 创建苹果工厂
        FactoryInterface appleFactory = new AppleFactory();
        // 工厂生产苹果产品，调用销售方法
        appleFactory.create().sales();
    }
}
