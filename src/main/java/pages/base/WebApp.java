package pages.base;

import org.openqa.selenium.WebDriver;
import pages.admin.DashboardPage;
import pages.admin.LoginPage;

public class WebApp {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    public WebApp(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage(driver);
        }
        return dashboardPage;
    }
}
