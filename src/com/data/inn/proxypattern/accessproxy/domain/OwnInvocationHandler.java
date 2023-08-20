package com.data.inn.proxypattern.accessproxy.domain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnInvocationHandler implements InvocationHandler {
    Person person;

    public OwnInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().startsWith("get")){

            return method.invoke(person, args);
        } else if(method.getName().startsWith("setGeekRating")){

            throw new IllegalAccessException("Owner cannot set the geek rating.");
        } else if(method.getName().startsWith("set")){

            return method.invoke(person, args);
        }

        return null;
    }
}
