package pattern.test;

import pattern.abstractFactory.create.impls.BeijingFactoryImpl;
import pattern.abstractFactory.create.impls.GuangdongFactoryImpl;
import pattern.abstractFactory.create.interfaces.FactoryInterface;

/**
 * 抽象工厂模式客户端
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        System.out.println("广东生产----------");
        action(new GuangdongFactoryImpl());

        System.out.println("北京生产----------");
        action(new BeijingFactoryImpl());

    }

    public static void action(FactoryInterface factoryInterface) {
        factoryInterface.createApple().sales();
        factoryInterface.createPhone().sales();
    }
}
