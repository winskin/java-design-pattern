package pattern.builder.common;

/**
 * 手机对象
 * builder模式
 * 1. 提供Builder类,并拥有
 */
public class PhoneData {

    /**
     * CPU
     */
    private String cpu;
    /**
     * 内存
     */
    private String ram;
    /**
     * 存储
     */
    private String storage;
    /**
     * 电池
     */
    private String battery;

    private PhoneData setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    private PhoneData setRam(String ram) {
        this.ram = ram;
        return this;
    }

    private PhoneData setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    private PhoneData setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "PhoneData{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }

    /**
     * 暴露实例化builder方法
     * @return
     */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String cpu;
        private String ram;
        private String storage;
        private String battery;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder battery(String battery) {
            this.battery = battery;
            return this;
        }

        /**
         * 实例化对象和赋值方法
         * @return
         */
        public PhoneData build() {
            return new PhoneData()
                    .setCpu(cpu)
                    .setBattery(battery)
                    .setRam(ram)
                    .setStorage(storage);
        }
    }
}
