package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @Test
    public void registrationSuccess(){
        app.getHelperUser().langChangeToEnglish();
        app.getHelperUser().pause(1000);
        app.getHelperUser().openRegistrationForm();
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.cssSelector("button[type = 'submit']")));
    }

}
