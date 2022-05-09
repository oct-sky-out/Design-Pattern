package creational.abstractfactory;

import creational.abstractfactory.factory.browser.BrowserUiFactory;
import creational.abstractfactory.factory.browser.Chrome;
import creational.abstractfactory.factory.browser.Ie;
import creational.abstractfactory.factory.browser.bookmarkui.BookmarkUi;
import creational.abstractfactory.factory.browser.tabui.TabUi;
import creational.abstractfactory.factory.device.cellphone.CellPhone;
import creational.abstractfactory.factory.device.computer.Computer;
import creational.abstractfactory.factory.device.Apple;
import creational.abstractfactory.factory.device.DeviceFactory;
import creational.abstractfactory.factory.device.Samsung;

public class Main {
    public static void main(String[] args) {
        DeviceFactory samsungFactory = new Samsung();
        DeviceFactory appleFactory = new Apple();

        CellPhone samsungCellPhone = samsungFactory.produceCellphone();
        Computer samsungComputer = samsungFactory.produceComputer();

        System.out.println(samsungCellPhone);
        System.out.println(samsungComputer);

        CellPhone appleCellPhone = appleFactory.produceCellphone();
        Computer appleComputer = appleFactory.produceComputer();

        System.out.println(appleCellPhone);
        System.out.println(appleComputer);

        // ----------- deviece -----------

        BrowserUiFactory chromeUi = new Chrome();
        BrowserUiFactory internetExploreUi = new Ie();

        BookmarkUi chromeBookmark = chromeUi.createBookMarkIcon();
        BookmarkUi ieBookmakr = internetExploreUi.createBookMarkIcon();
        System.out.println(chromeBookmark);
        System.out.println(ieBookmakr);

        TabUi chromeTabUi = chromeUi.createTabUi();
        TabUi ieTabUi = internetExploreUi.createTabUi();
        System.out.println(chromeTabUi);
        System.out.println(ieTabUi);
    }
}
