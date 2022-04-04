package com.example.demo.pages;

import com.example.demo.annotation.LazyAutowired;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.PostConstruct;

public abstract class BasePage {
    @LazyAutowired
    protected WebDriver driver;

    @LazyAutowired
    protected WebDriverWait wait;

    @LazyAutowired
    protected Wait<WebDriver> fluentWait;

    @LazyAutowired
    protected JavascriptExecutor javascriptExecutor;

    @PostConstruct
    private void init() {
        PageFactory.initElements(this.driver, this);
    }

    public abstract boolean isAt();
}
