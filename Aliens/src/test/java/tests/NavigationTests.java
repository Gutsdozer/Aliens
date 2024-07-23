package tests;

import org.testng.annotations.Test;

public class NavigationTests extends TestBase{


    @Test
    public void langChange(){
        app.getHelperUser().langChangeToEnglish();
    }



}
