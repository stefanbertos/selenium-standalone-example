package com.example.demo.pages;

import com.example.demo.JSWaiter;
import com.example.demo.annotation.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class BlogPage extends BasePage {
    @FindBy(xpath = "//title[text()='Angular Blog']")
    private WebElement appTitle;

    public void goTo() {
        this.driver.get("https://blog.angular.io/");
    }

    @Override
    public boolean isAt() {
        JSWaiter js = new JSWaiter(super.driver, super.wait, super.javascriptExecutor);
        js.waitAllRequest();

        return this.wait.until((d) -> this.appTitle.isDisplayed());
    }
}
