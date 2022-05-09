package creational.abstractfactory.factory.device;

import creational.abstractfactory.factory.device.cellphone.CellPhone;
import creational.abstractfactory.factory.device.computer.Computer;

public class Apple implements DeviceFactory{
    @Override
    public CellPhone produceCellphone() {
        return new CellPhone("Apple", "iphone");
    }

    @Override
    public Computer produceComputer() {
        return new Computer("Apple", "mackintosh");
    }
}
