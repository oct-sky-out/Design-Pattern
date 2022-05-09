package creational.abstractfactory.factory.browser.bookmarkui;

public class ChromeBookmarkUi implements BookmarkUi{
    private final String browser;
    private int width;

    public ChromeBookmarkUi(String browser, int width) {
        this.browser = browser;
        this.width = width;
    }

    @Override
    public String getBrowserName() {
        return this.browser;
    }

    @Override
    public int getBookmarkUiWidth() {
        return this.width;
    }
}
