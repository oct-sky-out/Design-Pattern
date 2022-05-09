package creational.abstractfactory.factory.browser.bookmarkui;

public class IeBookmarkUi implements BookmarkUi{
    private final String browser;
    private int width;

    public IeBookmarkUi(String browser, int width) {
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
