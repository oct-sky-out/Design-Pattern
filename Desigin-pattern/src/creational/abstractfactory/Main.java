package creational.abstractfactory;

import creational.abstractfactory.factory.browser.BrowserUiFactory;
import creational.abstractfactory.factory.browser.Chrome;
import creational.abstractfactory.factory.browser.Ie;
import creational.abstractfactory.factory.browser.bookmarkui.BookmarkUi;
import creational.abstractfactory.factory.browser.tabui.TabUi;

public class Main {
    public static void main(String[] args) {
        BrowserUiFactory chromeUi = new Chrome();
        BrowserUiFactory internetExploreUi = new Ie();

        BookmarkUi chromeBookmark = chromeUi.createBookMarkIcon();
        BookmarkUi ieBookmark = internetExploreUi.createBookMarkIcon();
        System.out.println("browser name : " + chromeBookmark.getBrowserName());
        System.out.println("width : " + chromeBookmark.getBookmarkUiWidth());
        System.out.println("browser name : " + ieBookmark.getBrowserName());
        System.out.println("width : " + ieBookmark.getBookmarkUiWidth());

        TabUi chromeTabUi = chromeUi.createTabUi();
        TabUi ieTabUi = internetExploreUi.createTabUi();
        System.out.println("browser name : " + chromeTabUi.getBrowserName());
        System.out.println("area : " + chromeTabUi.getTabUiArea());
        System.out.println("browser name : " + ieTabUi.getBrowserName());
        System.out.println("area : " + ieTabUi.getTabUiArea());
    }
}
