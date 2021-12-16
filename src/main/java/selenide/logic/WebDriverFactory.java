package selenide.logic;

import com.codeborne.selenide.Configuration;

public class WebDriverFactory {
    public static void init (String browserName){
        Configuration.browser =browserName;
        Configuration.baseUrl = "http://localhost:8000";
    }
}
