package com.example.demo.steps;

import com.example.demo.annotation.LazyAutowired;
import com.example.demo.pages.BlogPage;
import com.example.demo.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@CucumberContextConfiguration
@SpringBootTest
public class NavigationSteps {
    @LazyAutowired
    private MainPage mainPage;

    @LazyAutowired
    private BlogPage blogPage;

    @Given("I am on the Angular app Page")
    public void iAmOnTheAngularAppPage() {
        this.mainPage.goTo();
        this.mainPage.isAt();
        Assert.assertEquals("angular-app app is running!", this.mainPage.getAppTitle());
    }

    @When("I click on the Blog link")
    public void iClickOnTheBlogLink() {
        this.mainPage.clickBlog();
    }

    @Then("I should be redirected to Blog page")
    public void iShouldBeRedirectedToBlogPage() {
       Assert.assertTrue(blogPage.isAt());
    }
}
