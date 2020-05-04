package pattern.builder.classic;

/**
 * 通用构造者
 */
public interface Builder {

    /**
     * 重置
     */
    void reset();

    /**
     * CPU
     */
    void setCpu(String cpu);

    /**
     * 内存
     */
    void setRam(String ram);

    /**
     * 显卡
     */
    void setGraphics(String graphics);
}
