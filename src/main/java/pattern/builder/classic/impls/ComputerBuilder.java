package pattern.builder.classic.impls;

import pattern.builder.classic.Builder;
import pattern.builder.classic.product.Computer;

/**
 * 计算机构造器
 */
public class ComputerBuilder implements Builder {

    private Computer computer;

    @Override
    public void reset() {
        computer = new Computer();
    }

    @Override
    public void setCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void setRam(String ram) {
        computer.setRam(ram);

    }

    @Override
    public void setGraphics(String graphics) {
        computer.setGraphics(graphics);

    }

    public Computer build() {
        return computer;
    }
}
