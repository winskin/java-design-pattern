package pattern.builder.classic.product;

/**
 * 计算机
 */
public class Computer {

    private String cpu;
    private String ram;
    private String graphics;

    public String getCpu() {
        return cpu;
    }

    public Computer setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public Computer setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getGraphics() {
        return graphics;
    }

    public Computer setGraphics(String graphics) {
        this.graphics = graphics;
        return this;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", graphics='" + graphics + '\'' +
                '}';
    }
}
