package pattern.builder.classic.impls;

import pattern.builder.classic.Builder;
import pattern.builder.classic.product.Computer;
import pattern.builder.classic.product.Manual;

/**
 * 手册构造器
 */
public class ManualBuilder implements Builder {

    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setCpu(String cpu) {
        manual.setCpu(cpu);
    }

    @Override
    public void setRam(String ram) {
        manual.setRam(ram);
    }

    @Override
    public void setGraphics(String graphics) {
        manual.setGraphics(graphics);
    }

    public Manual build() {
        return manual;
    }
}
