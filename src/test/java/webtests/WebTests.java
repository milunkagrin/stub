package webtests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenide.logic.WebDriverFactory;
import selenide.logic.pages.MainDiscoPage;

public class WebTests {
    private MainDiscoPage mainDiscoPage;

    @BeforeMethod
    public void setUp(){
        mainDiscoPage = new MainDiscoPage();
        WebDriverFactory.init("chrome");
    }

   // @Test


}
