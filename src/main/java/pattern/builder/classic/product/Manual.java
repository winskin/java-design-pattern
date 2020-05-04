package pattern.builder.classic.product;

/**
 * 手册
 */
public class Manual {

    private String cpu;
    private String ram;
    private String graphics;

    public String getCpu() {
        return cpu;
    }

    public Manual setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public Manual setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getGraphics() {
        return graphics;
    }

    public Manual setGraphics(String graphics) {
        this.graphics = graphics;
        return this;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", graphics='" + graphics + '\'' +
                '}';
    }
}
