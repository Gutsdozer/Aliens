package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }
    Actions action = new Actions(wd);


    public void langChangeToEnglish(){
        action.moveToElement(wd.findElement(By.cssSelector("a[class = 'selected-currency']"))).perform();
        click(By.cssSelector("li[class = 'EN']"));
    }

    public void openRegistrationForm() {
        action.moveToElement(wd.findElement(By.cssSelector("i[class = 'icon fa fa-user']"))).perform();
        click(By.cssSelector("a[href = 'https://brutalassault.cz/en/cart/user-registration']"));
    }
}
