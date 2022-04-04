package com.example.demo.config;


import com.example.demo.annotation.LazyConfiguration;
import com.example.demo.annotation.ThreadScopeBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

@LazyConfiguration
public class RemoteWebDriverConfig {

    @Value("${selenium.grid.url}")
    private URL url;

    @ThreadScopeBean
    @Primary
    public WebDriver remoteChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.cookies", 2);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--window-size=1920,1080");
        WebDriver driver = new RemoteWebDriver(this.url, options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
        return driver;
    }
}
