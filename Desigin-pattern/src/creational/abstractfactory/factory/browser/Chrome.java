package creational.abstractfactory.factory.browser;

import creational.abstractfactory.factory.browser.bookmarkui.BookmarkUi;
import creational.abstractfactory.factory.browser.bookmarkui.ChromeBookmarkUi;
import creational.abstractfactory.factory.browser.tabui.ChromeTabUi;
import creational.abstractfactory.factory.browser.tabui.TabUi;

public class Chrome implements BrowserUiFactory{
    @Override
    public BookmarkUi createBookMarkIcon() {
        return new ChromeBookmarkUi("chrome", 50);
    }

    @Override
    public TabUi createTabUi() {
        return new ChromeTabUi("chrome", 100, 10);
    }
}
