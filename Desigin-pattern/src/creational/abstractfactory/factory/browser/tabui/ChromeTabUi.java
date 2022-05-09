package creational.abstractfactory.factory.browser.tabui;

public class ChromeTabUi implements TabUi{
    private final String browser;
    private int width;
    private int height;

    public ChromeTabUi(String browser, int width, int height) {
        this.browser = browser;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getBrowserName() {
        return this.browser;
    }

    @Override
    public int getTabUiArea() {
        return this.height * this.width;
    }
}
