package selenide.logic.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainDiscoPage {
    private SelenideElement main = $("flt-glass-pane");

    public MainDiscoPage clickMainElement(){
        main.click();
        return  this;
    }
}

