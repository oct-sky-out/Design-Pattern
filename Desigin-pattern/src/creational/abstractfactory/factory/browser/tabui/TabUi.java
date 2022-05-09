package creational.abstractfactory.factory.browser.tabui;

public class TabUi {
    private final String browser;
    private int width;
    private int height;
    private boolean hasHtmlIconSpace;

    public TabUi(String browser, int width, int height, boolean hasHtmlIconSpace) {
        this.browser = browser;
        this.width = width;
        this.height = height;
        this.hasHtmlIconSpace = hasHtmlIconSpace;
    }

    @Override
    public String toString() {
        return "TabUi{" +
            "browser='" + browser + '\'' +
            ", width=" + width +
            ", height=" + height +
            ", hasHtmlIconSpace=" + hasHtmlIconSpace +
            '}';
    }
}
