package creational.abstractfactory.factory.device;

import creational.abstractfactory.factory.device.cellphone.CellPhone;
import creational.abstractfactory.factory.device.computer.Computer;

/**
 * 여기 전자기기를 생산해내는 공장이 있다.
 */
public interface DeviceFactory {
    CellPhone produceCellphone();
    Computer produceComputer();
}
