package webdriver;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeTest
    @Parameters({"rootLink", "browser"})
    public void readParams(String rootLink, String browser) {
        Configuration.baseUrl = rootLink;
        Configuration.driverManagerEnabled = false;
        //Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "firefox";
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
    }

    protected void openRootPage() {
        open("/");
    }
}
