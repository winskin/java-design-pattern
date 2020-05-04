package pattern.builder.classic;

public class Director {

    /**
     * 构造业务-型号1
     * @return
     */
    public Builder buildModel1(Builder builder) {
        builder.reset();
        builder.setCpu("i5");
        builder.setRam("16G");
        builder.setGraphics("GTX");
        return builder;
    }

    /**
     * 构造业务型号2
     * @return
     */
    public Builder buildModel2(Builder builder) {
        builder.reset();
        builder.setCpu("i7");
        builder.setRam("32G");
        builder.setGraphics("RTX");
        return builder;
    }
}
