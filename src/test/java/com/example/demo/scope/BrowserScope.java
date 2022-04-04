package com.example.demo.scope;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;

import java.util.Objects;

public class BrowserScope extends SimpleThreadScope {

    @Override // when a browser does not exist (it was closed in a previous tests within the same Thread), return a new one
    public Object get(String name, ObjectFactory<?> objectFactory) {

        Object o = super.get(name, objectFactory);
        SessionId sessionId = ((RemoteWebDriver)o).getSessionId();
        if(Objects.isNull(sessionId)){
            super.remove(name);
            o = super.get(name, objectFactory);
        }
        return o;
    }

    @Override // this is just for removing a warning in the console log -> see original method
    public void registerDestructionCallback(String name, Runnable callback) {
    }
}
