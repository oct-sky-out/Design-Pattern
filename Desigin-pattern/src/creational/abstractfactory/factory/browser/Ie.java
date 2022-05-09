package creational.abstractfactory.factory.browser;

import creational.abstractfactory.factory.browser.bookmarkui.BookmarkUi;
import creational.abstractfactory.factory.browser.bookmarkui.IeBookmarkUi;
import creational.abstractfactory.factory.browser.tabui.IeTabUi;
import creational.abstractfactory.factory.browser.tabui.TabUi;

public class Ie implements BrowserUiFactory{
    @Override
    public BookmarkUi createBookMarkIcon() {
        return new IeBookmarkUi("IE", 30);
    }

    @Override
    public TabUi createTabUi() {
        return new IeTabUi("IE");
    }
}
