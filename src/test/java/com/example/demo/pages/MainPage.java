package com.example.demo.pages;

import com.example.demo.annotation.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Value;

import java.net.MalformedURLException;

@PageObject
public class MainPage extends BasePage {

    @FindBy(id = "appTitle")
    private WebElement appTitle;

    @FindBy(xpath = "//a[contains(@href, 'blog.angular.io')]")
    private WebElement linkBlog;

    @Value("${app.url:http://www.google.com}")
    private String url;

    public MainPage() throws MalformedURLException {
    }

    public void goTo() {
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.appTitle.isDisplayed());
    }

    public String getAppTitle() {
        return appTitle.getText();
    }

    public void clickBlog() {
        this.wait.until(ExpectedConditions.elementToBeClickable(linkBlog)).click();
    }
}
