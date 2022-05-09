package creational.abstractfactory.factory.browser.bookmarkui;

public class BookmarkUi {
    private final String browser;
    private int width;
    private int height;

    public BookmarkUi(String browser, int width, int height) {
        this.browser = browser;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "BookmarkUi{" +
            "browser='" + browser + '\'' +
            ", width=" + width +
            ", height=" + height +
            '}';
    }
}
