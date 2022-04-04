package com.example.demo.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import java.lang.annotation.*;

@Lazy
@Configuration
@Documented // for javadoc
@Target({ElementType.TYPE}) //this one will be used for classes, so it must be TYPE
@Retention(RetentionPolicy.RUNTIME) // will be used at runtime (not available during compile time etc..)
public @interface LazyConfiguration {
}
