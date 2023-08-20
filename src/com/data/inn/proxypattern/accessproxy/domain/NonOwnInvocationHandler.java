package com.data.inn.proxypattern.accessproxy.domain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnInvocationHandler implements InvocationHandler {
    Person person;

    public NonOwnInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().startsWith("get")){

            method.invoke(person, args);
        } else if(method.getName().startsWith("setGeekRating")){

            method.invoke(person, args);
        } else if(method.getName().startsWith("set")){

            throw new IllegalAccessException("Non Owner cannot set other values except geek rating.");
        }

        return null;
    }
}
