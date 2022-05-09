package creational.abstractfactory.factory.browser;

import creational.abstractfactory.factory.browser.bookmarkui.BookmarkUi;
import creational.abstractfactory.factory.browser.tabui.TabUi;

public class Ie implements BrowserUiFactory{
    @Override
    public BookmarkUi createBookMarkIcon() {
        return new BookmarkUi("IE", 100, 100);
    }

    @Override
    public TabUi createTabUi() {
        return new TabUi("IE",0, 0, false);
    }
}
