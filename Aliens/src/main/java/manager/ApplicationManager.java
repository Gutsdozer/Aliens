package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.concurrent.TimeUnit;


public class ApplicationManager {

    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);
    WebDriver wd;
    HelperUser helperUser;

    public void init(){
        WebDriver wd = new ChromeDriver();
        wd.navigate().to("https://brutalassault.cz/cs");
        logger.info("navigated to link ---> "+ wd.getCurrentUrl());
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        helperUser = new HelperUser(wd);
    }

    public void stop(){
        wd.quit();
    }

    public HelperUser getHelperUser() {
        return helperUser;
    }
}
