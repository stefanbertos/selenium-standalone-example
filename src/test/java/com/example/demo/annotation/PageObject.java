package com.example.demo.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Lazy
@Component
@Scope("prototype")
@Documented // for javadoc
@Target({ElementType.TYPE}) //this one will be used for classes, so it must be TYPE
@Retention(RetentionPolicy.RUNTIME) // will be used at runtime (not available during compile time etc..)
public @interface PageObject {
}
