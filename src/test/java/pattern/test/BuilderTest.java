package pattern.test;

import pattern.builder.classic.Builder;
import pattern.builder.classic.Director;
import pattern.builder.classic.impls.ComputerBuilder;
import pattern.builder.classic.impls.ManualBuilder;
import pattern.builder.common.PhoneData;

/**
 * 构造器模式
 */
public class BuilderTest {

    public static void main(String[] args) {

        /**
         * 经典builder模式
         */
        // 实例化主管
        Director director = new Director();

        // 创建computer构造器
        ComputerBuilder builder = new ComputerBuilder();
        // 这里让director赋值
        director.buildModel1(builder);
        System.out.println(builder.build());

        ManualBuilder builder2 = new ManualBuilder();
        // 这里让director赋值
        director.buildModel1(builder2);
        System.out.println(builder2.build());

        /**
         * 常用bilder模式
         */
        PhoneData data = PhoneData.builder()
                .cpu("晓龙865")
                .battery("5000毫安")
                .ram("8G")
                .storage("256G")
                .build();

        System.out.println(data);

    }
}
