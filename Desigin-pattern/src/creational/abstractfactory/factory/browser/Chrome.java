package creational.abstractfactory.factory.browser;

import creational.abstractfactory.factory.browser.bookmarkui.BookmarkUi;
import creational.abstractfactory.factory.browser.tabui.TabUi;

public class Chrome implements BrowserUiFactory{
    @Override
    public BookmarkUi createBookMarkIcon() {
        return new BookmarkUi("chrome", 50, 10);
    }

    @Override
    public TabUi createTabUi() {
        return new TabUi("chrome", 100, 10, true);
    }
}
