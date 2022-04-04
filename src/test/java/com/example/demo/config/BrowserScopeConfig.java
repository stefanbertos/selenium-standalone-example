package com.example.demo.config;


import com.example.demo.annotation.LazyConfiguration;
import com.example.demo.scope.BrowserScopePostProcessor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class BrowserScopeConfig {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new BrowserScopePostProcessor();
    }
}
