package creational.abstractfactory.factory.device.cellphone;

public class CellPhone {
    private final String brandName;
    private final String deviceName;

    public CellPhone(String brandName, String deviceName) {
        this.brandName = brandName;
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
            "brandName='" + brandName + '\'' +
            ", deviceName='" + deviceName + '\'' +
            '}';
    }
}
