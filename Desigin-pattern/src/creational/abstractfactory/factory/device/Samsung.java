package creational.abstractfactory.factory.device;

import creational.abstractfactory.factory.device.cellphone.CellPhone;
import creational.abstractfactory.factory.device.computer.Computer;

public class Samsung implements DeviceFactory{
    @Override
    public CellPhone produceCellphone() {
        return new CellPhone("samsung", "galaxy");
    }

    @Override
    public Computer produceComputer() {
        return new Computer("samsung", "odyssey");
    }
}
