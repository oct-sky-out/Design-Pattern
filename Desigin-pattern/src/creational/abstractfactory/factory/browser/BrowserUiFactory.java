package creational.abstractfactory.factory.browser;

import creational.abstractfactory.factory.browser.bookmarkui.BookmarkUi;
import creational.abstractfactory.factory.browser.tabui.TabUi;

public interface BrowserUiFactory {
    BookmarkUi createBookMarkIcon();
    TabUi createTabUi();
}
