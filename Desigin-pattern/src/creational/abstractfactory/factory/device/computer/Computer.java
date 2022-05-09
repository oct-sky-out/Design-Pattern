package creational.abstractfactory.factory.device.computer;

public class Computer {
    private final String brandName;
    private final String deviceName;

    public Computer(String brandName, String deviceName) {
        this.brandName = brandName;
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "brandName='" + brandName + '\'' +
            ", deviceName='" + deviceName + '\'' +
            '}';
    }
}
