package creational.abstractfactory.factory.browser.tabui;

public class IeTabUi implements TabUi{
    private final String browser;

    public IeTabUi(String browser) {
        this.browser = browser;
    }

    @Override
    public String getBrowserName() {
        return this.browser;
    }

    @Override
    public int getTabUiArea() {
        return 0; // ie doesn't have tab
    }
}
